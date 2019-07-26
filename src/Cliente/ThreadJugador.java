package Cliente;




import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadJugador extends Thread{
    
    DataInputStream entrada;
    Mesa            ventanaMesa; //referencia acliente
    Jugador         jugador;
    Socket          cliente;
    
    public ThreadJugador (DataInputStream entrada,Mesa ventanaMesa, Jugador jugador , Socket cliente) throws IOException{
        
        this.entrada     = entrada;
        this.ventanaMesa = ventanaMesa;
        this.jugador     = jugador;
        this.cliente     = cliente;
    }
    
    @Override
    public void run(){
        int opcion;
        // solamente lee lo que el servidor threadServidor le envia
        while(true){
            try {
                String mensaje;
                opcion = entrada.readInt();  
                switch(opcion){
                    case 1://mensaje enviado
                        jugador.setJuegoActivado(true);
                        ObjectInputStream recibeObjetos = new ObjectInputStream (cliente.getInputStream());
                        ventanaMesa.actualizarMisCartas((ArrayList<Carta>)recibeObjetos.readObject());
                        ventanaMesa.actualizarCartaActual((Carta)recibeObjetos.readObject());
                        break;
                    case 2://mostrar en RegistroDeEventos
                        ventanaMesa.mostrarRegistroDeEventos(entrada.readUTF(),entrada.readUTF(), entrada.readUTF());
                        break; 
                    case 3://muestra message box
                        ventanaMesa.mandarMensaje(entrada.readUTF());
                        break;
                    case 4://muestra mensaje box escoger color
                        ventanaMesa.EscogerColorComodin();
                        break;
                    case 5://igual que el 3
                        mensaje = entrada.readUTF();
                        ventanaMesa.mandarMensaje(mensaje);
                        break;
                    case 6:
                        jugador.setJugadorActual(entrada.readBoolean());//permite que solo este usuario mande mjs al servidor
                        ventanaMesa.actualizarJugadorActual(entrada.readUTF());
                        ventanaMesa.actualizarTurno(entrada.readInt(), entrada.readUTF(), entrada.readInt());
                        break;
                    case 7://actualizar Nombres
                            ventanaMesa.actualizarNombres(entrada.readUTF(), entrada.readInt(), entrada.readInt());
                        break;
                    case 8:
                        int cantidadDeOponentes = entrada.readInt();
                        for (int i = 0; i < cantidadDeOponentes; i++)
                            ventanaMesa.actualizarJugador(entrada.readInt(), entrada.readInt(), entrada.readInt());
                        break;
                    default:
                        System.out.println("Opción de ThreadJugador invalida");
                }
            }
            catch (IOException e){
                System.out.println("Error en la comunicacion "+"Informacion para el usuario");
                break;
            }
            catch (ClassNotFoundException ex){
                Logger.getLogger(ThreadJugador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
