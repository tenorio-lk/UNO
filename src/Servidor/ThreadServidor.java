package Servidor;


import Cliente.*;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadServidor extends Thread implements Serializable{
    
    public transient Socket                    cliente = null;
    public           ServidorUno               servidor;
    private final    int                       numeroDeJugador;
    public           DataInputStream           entrada = null;
    public           DataOutputStream          salida  = null;
    public           String                    userName; 
    public           int                       numDeCartas;
    public           ArrayList<ThreadServidor> servidoresEscucha;
    public final     int                       cantidadOponentes;

    
    public ThreadServidor(Socket cliente,ServidorUno servidor, int numeroDeJugador, int cantidadDeOponentes){
        
        this.cliente           = cliente;
        this.servidor          = servidor;
        this.numeroDeJugador   = numeroDeJugador;
        userName               = "";
        numDeCartas            = 7;
        servidoresEscucha      = new ArrayList<>();
        cantidadOponentes      = cantidadDeOponentes;
    }
    
    @Override
    public void run(){
    	try{// inicializa para lectura y escritura con stream de cliente
            entrada = new DataInputStream(cliente.getInputStream());//comunic
            salida  = new DataOutputStream(cliente.getOutputStream());//comunic
            ObjectInputStream recibeObjetos = new ObjectInputStream (entrada);
            Jugador jugador = (Jugador)recibeObjetos.readObject();
            servidor.getPartida().annadirJugador(jugador);
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(ThreadServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException e){
        }
        int opcion;
        while(true){
            try{//Siempre espera leer un int que será la instruccion por hacer
                Jugador jugador;
                opcion = entrada.readInt();
                switch(opcion){
                    case 1://Cambiar el estado a la partida
                        if(!servidor.getPartida().isPartidaIniciada()){
                            if(servidor.getPartida().getTurnoJugador() == numeroDeJugador){
                                servidor.getPartida().iniciarPartida();
                                servidor.getPartida().setPartidaIniciada(true);                                
                                enviarMensajeAInterfaz();
                                if (numeroDeJugador == 0){
                                    mostrarEventoServidor("Se ha iniciado la partida!");
                                    asignarColorAJugadores();
                                    actualizarJugadorActual();
                                }
                            }
                        }
                        break;
                    case 2://Manejo de las cartas
                        int numeroCarta = entrada.readInt();
                        jugador = servidor.getPartida().encontrarJugador(numeroDeJugador);
                        Carta carta = jugador.devolverCarta(numeroCarta);
                        //if(carta.getTipo().equals("CartaComodin") || carta.getTipo().equals("CartaComodinCome4"))
                        //    pedirColorComodin();
                        servidor.getPartida().manejarCarta(carta);
                        if(servidor.getPartida().getJugoLaCarta()){
                            jugador.eliminarCarta(numeroCarta);
                            servidor.getPartida().setJugoLaCarta(false);
                            enviarMensajeAInterfaz();
                            actualizarCartasOponentes();
                        }
                        break;
                    case 3://Notificar a los demás jugadores el color del comodin elegido
                        String color = entrada.readUTF();
                        servidor.getPartida().setColorEnJuego(color);
                        mostrarEvento("Ha cambiado el color de la partida a " + color);
                        for(ThreadServidor threadServidor: servidoresEscucha)
                            threadServidor.mostrarMjsBox(servidor.getPartida().encontrarJugador(numeroDeJugador).getNombreJugador() + "ha elegido como color actual el " + color);
                        break;
                    case 4://verifica que el jugador haya ganado
                        if(servidor.getPartida().haGanado(numeroDeJugador)){
                            mostrarMjsBox("Se le notifica que ha ganado la partida");
                            for(ThreadServidor threadServidor: servidoresEscucha)
                                threadServidor.mostrarMjsBox("Se le notifica que ha ganado: " + servidor.getPartida().encontrarJugador(numeroDeJugador).getNombreJugador());
                        }
                        break;
                    case 5://Toma una carta 
                        servidor.getPartida().tomarDeMaso(numeroDeJugador);
                        mostrarEvento("Ha cogido una carta");
                        enviarMensajeAInterfaz();
                        actualizarCartasOponentes();
                        break;
                    case 6:
                        actualizarJugadorActual();
                        break;
                    case 7://salto
                        if (servidor.getPartida().isSaltoActivado()){
                            mostrarEvento("Ha saltado despues de comer");
                            servidor.getPartida().realizarSalto();
                            enviarMensajeAInterfaz(); 
                        }
                        break;
                    default:
                        System.out.println("Case no programado ;)");
                }
            }
            catch (IOException e) {
                mostrarEvento("He perdido la conexion");
                break;
            }
        }
        try{
            //servidor.getVentana().mostrarEnVentana("Se desconecto un usuario: " + userName);
            cliente.close();
        }	
        catch(Exception et){
            //servidor.getVentana().mostrarEnVentana("no se puede cerrar el socket");
        }
    }
    
    public void pedirColorComodin() throws IOException{
        salida.writeInt(4);//Se va al case que pide el color
        entrada.readInt();//esto solo hace que el hilo espere hasta que el usuario conteste el color
    }
    
    public void mostrarMjsBox(String mensaje) throws IOException{
        salida.writeInt(5);
        salida.writeUTF(mensaje);
    }

    public void annadirServidorEscucha(ThreadServidor servidorEscucha){
        servidoresEscucha.add(servidorEscucha);
    }
    
    public void asignarColorAJugadores(){
        servidor.getPartida().encontrarJugador(0).setColorDelJugador("Azul");
        servidoresEscucha.stream().map((servidoresEscucha1) -> servidoresEscucha1.numeroDeJugador).forEach((numJugador) -> {
            if (numJugador == 1)
                servidor.getPartida().encontrarJugador(1).setColorDelJugador("Amarilla");
            else if (numJugador == 2)
                servidor.getPartida().encontrarJugador(2).setColorDelJugador("Roja");
            else if (numJugador == 3)
                servidor.getPartida().encontrarJugador(3).setColorDelJugador("Verde");
        });
    }
   
    public void enviarMensajeAInterfaz(){
        try{
            enviarMensajeAMiInterfaz();
            enviarMensajeAOponentes();
        }
        catch (Exception e){
            System.out.println("El cliente termino la conexion");
        }
    }
    
    public void enviarMensajeAMiInterfaz() throws Exception{
        salida.writeInt(1);
        ObjectOutputStream enviaObjetos = new ObjectOutputStream (cliente.getOutputStream());
        enviaObjetos.writeObject(servidor.getPartida().encontrarJugador(numeroDeJugador).getMano());
        enviaObjetos.writeObject(servidor.getPartida().getTopeDescarte());
    }
    
    public void enviarMensajeAOponentes() throws Exception{
        for (ThreadServidor servidoresEscucha1 : servidoresEscucha) {
            servidoresEscucha1.salida.writeInt(1);
            ObjectOutputStream enviaObjetosServidores = new ObjectOutputStream(servidoresEscucha1.cliente.getOutputStream());
            enviaObjetosServidores.writeObject(servidor.getPartida().encontrarJugador(servidoresEscucha1.numeroDeJugador).getMano());
            enviaObjetosServidores.writeObject(servidor.getPartida().getTopeDescarte());
        }
    }
    
    public void actualizarJugadorActual(){
        try{
            Jugador jugador = servidor.getPartida().encontrarJugador(numeroDeJugador);
            if (jugador.getColorDelJugador() != null){
                actualizarmeJugador(jugador.getColorDelJugador());
                actualizarJugadorAOponentes(jugador.getColorDelJugador(), jugador.getNombreJugador());
            }
        }
        catch (Exception e){
            System.out.println("El cliente termino la conexion");
        }
    }
    
    public void actualizarmeJugador(String color)throws Exception{
        salida.writeInt(6);
        salida.writeBoolean(true);
        salida.writeUTF("Jugando actualmente");
        salida.writeInt(0);//Es mi turno
        salida.writeUTF(color);
        salida.writeInt(cantidadOponentes+1);
    }

    public void actualizarJugadorAOponentes(String color, String nombre) throws Exception{
        for (int i = 0; i < cantidadOponentes; i++){
            servidoresEscucha.get(i).salida.writeInt(6);
            servidoresEscucha.get(i).salida.writeBoolean(false);
            servidoresEscucha.get(i).salida.writeUTF("Jugando actualmente: " + nombre);
            servidoresEscucha.get(i).salida.writeInt(cantidadOponentes-i);
            servidoresEscucha.get(i).salida.writeUTF(color);
            servidoresEscucha.get(i).salida.writeInt(cantidadOponentes+1);
        }
    }
    
    public void actualizarCartasOponentes(){
        try{
            salida.writeInt(8);
            salida.writeInt(cantidadOponentes);
            for (int i = 0; i < cantidadOponentes; i++){
                salida.writeInt(i+1);
                salida.writeInt(servidor.getPartida().encontrarJugador(servidoresEscucha.get(i).numeroDeJugador).getMano().size());
                salida.writeInt(cantidadOponentes+1);
                
                servidoresEscucha.get(i).salida.writeInt(8);
                servidoresEscucha.get(i).salida.writeInt(cantidadOponentes);
                for (int j = 0; j < cantidadOponentes; j++){
                    servidoresEscucha.get(i).salida.writeInt(j+1);
                    servidoresEscucha.get(i).salida.writeInt(servidor.getPartida().encontrarJugador(servidoresEscucha.get(i).servidoresEscucha.get(j).numeroDeJugador).getMano().size());
                    servidoresEscucha.get(i).salida.writeInt(cantidadOponentes+1);
                }
            }
        }catch(Exception e){}
    }
    
    public void mostrarEvento(String mensaje){
        try {
            String nombre = servidor.getPartida().encontrarJugador(numeroDeJugador).getNombreJugador();
            String color = servidor.getPartida().encontrarJugador(numeroDeJugador).getColorDelJugador();
            salida.writeInt(2);
            salida.writeUTF(nombre + ">> ");
            salida.writeUTF(mensaje);
            salida.writeUTF(color);
            for(ThreadServidor servidorOponente: servidoresEscucha){
                servidorOponente.salida.writeInt(2);
                servidorOponente.salida.writeUTF(nombre + ">> ");
                servidorOponente.salida.writeUTF(mensaje);
                servidorOponente.salida.writeUTF(color);
            }
        } catch (IOException ex) {
            Logger.getLogger(ThreadServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void mostrarEventoServidor(String mensaje){
        try {
            salida.writeInt(2);
            salida.writeUTF("Servidor>> ");
            salida.writeUTF(mensaje);
            salida.writeUTF("");            
            for (ThreadServidor servidorOponente: servidoresEscucha){
                servidorOponente.salida.writeInt(2);
                servidorOponente.salida.writeUTF("Servidor>> ");
                servidorOponente.salida.writeUTF(mensaje);
                servidorOponente.salida.writeUTF("");
            }
        }catch (IOException ex){
            Logger.getLogger(ThreadServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    
    public void actualizarNombres(){
        try{
            salida.writeInt(7);
            salida.writeUTF(servidor.getPartida().encontrarJugador(numeroDeJugador).getNombreJugador());
            salida.writeInt(0);
            salida.writeInt(cantidadOponentes+1);  
            for (int i = 0; i < cantidadOponentes; i++){
                salida.writeInt(7);
                salida.writeUTF(servidor.getPartida().encontrarJugador(servidoresEscucha.get(i).numeroDeJugador).getNombreJugador());
                salida.writeInt(i+1);
                salida.writeInt(cantidadOponentes+1);
            }
        }
        catch (IOException e){
            System.out.println("El cliente termino la conexion");
        }
    }
}
