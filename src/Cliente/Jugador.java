package Cliente;


import Servidor.ServidorUno;
import java.util.ArrayList;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
        


public class Jugador implements Serializable{
    
    private                  String           nombreJugador;
    private final            ArrayList<Carta> mano;
    private final  transient Mesa             ventanaMesa; // Ventana del cliente
    private        transient String           colorDelJugador;
    private        transient boolean          juegoCartaMano;
    private        transient boolean          tomoCartaMaso;
    private        transient boolean          juegoActivado;
    private        transient boolean          jugadorActual;
    public  static transient String           IP_SERVER;
    public         transient DataInputStream  entrada = null;//leer comunicacion
    public         transient DataOutputStream salida  = null;//escribir comunicacion
    public         transient Socket           jugador = null;//para la comunicacion
    
    
    public Jugador(String color, Mesa ventanaMesa) {
        
        this.colorDelJugador = color;
        this.ventanaMesa     = ventanaMesa;
        IP_SERVER            = "localhost";
        this.juegoCartaMano  = false;
        this.tomoCartaMaso   = false;
        this.juegoActivado   = false;
        this.mano            = new ArrayList<>();
        this.nombreJugador   = "";
        jugadorActual        = false;
    }
    
    public void annadirCarta(Carta cartaJuego){
           this.mano.add(cartaJuego);
    }
    
    
    public Carta devolverCarta(int numeroCarta){
        return this.mano.get(numeroCarta);
    }
    
    public void eliminarCarta(int numeroCarta){
        this.mano.remove(numeroCarta);
        
    }
    
    public int retorarNumeroCartas(){
        return this.mano.size();
    }
    
    //Método para la conexión socket
    public void conexion() throws IOException{
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setJugador(this);
        menuPrincipal.setLocationRelativeTo(null);
        ventanaMesa.setEnabled(false);
        menuPrincipal.setVisible(true);
    }
   
    public void CrearPartida(String nombre, int cantJugadores, MenuPrincipal menu){
        try {
            ServidorUno servidor = new ServidorUno(ventanaMesa, cantJugadores);
            servidor.start();
            ventanaMesa.setTitle(nombre);
            nombreJugador = nombre;
            jugador = new Socket(IP_SERVER, 8081);
            entrada = new DataInputStream(jugador.getInputStream());
            salida  = new DataOutputStream(jugador.getOutputStream());
            new ObjectOutputStream (salida).writeObject(this);
            
            new ThreadJugador(entrada, ventanaMesa, this, jugador).start();
            ventanaMesa.setEnabled(true);
            menu.settxaIPs(true);
            menu.setBtnAceptar(true);
        } catch (IOException e) {
            ventanaMesa.mandarMensajeError("No se ha podido crear la Partida \n Quiza ya creó una.");
        }
    }
    
    public void UnirseAPartida(String nombre, String IP, MenuPrincipal menu){
        try {
            ventanaMesa.setTitle(nombre);
            nombreJugador = nombre;
            if (!IP.isEmpty() || !IP.equals("192.168.XXX.XXX"))
                IP_SERVER = IP;
            System.err.println("IP: ");
            System.out.println(IP_SERVER);
            jugador = new Socket(IP_SERVER, 8081);
            entrada = new DataInputStream(jugador.getInputStream());
            salida  = new DataOutputStream(jugador.getOutputStream());
            new ObjectOutputStream (salida).writeObject(this);
            
            new ThreadJugador(entrada, ventanaMesa, this, jugador).start();
            ventanaMesa.mostrarRegistroDeEventos("Servidor>> ", "Ha sido aceptado", "");
            ventanaMesa.mostrarRegistroDeEventos("Servidor>> ", "Favor espere los demas jugadores", "");
            ventanaMesa.setEnabled(true);
            menu.dispose();
        } catch (IOException e) {
            ventanaMesa.mandarMensajeError("No se ha creado la partida o la IP es incorrecta");
        }
    }
    
    public ArrayList<Carta> getMano(){
        return this.mano;
    }
    
    public boolean getJuegoMano(){
        return this.juegoCartaMano;
    }
    
    public boolean getJuegoMaso(){
        return this.tomoCartaMaso;
    }
    
    public void setJuegoMano(boolean juegoMano){
        this.juegoCartaMano = juegoMano;
    }
    
    public void setJuegoMaso(boolean juegoMaso){
        this.tomoCartaMaso = juegoMaso;
    }
    
    public boolean getJuegoActivado(){
        return this.juegoActivado;
    }
    
    public void setJuegoActivado(boolean juegoActivado){
        this.juegoActivado = juegoActivado;
    }
    
    public String getNombreJugador(){
        return this.nombreJugador;
    }

    public String getColorDelJugador() {
        return colorDelJugador;
    }

    public void setColorDelJugador(String colorDelJugador) {
        this.colorDelJugador = colorDelJugador;
    }

    public boolean isJugadorActual() {
        return jugadorActual;
    }

    public void setJugadorActual(boolean jugadorActual) {
        this.jugadorActual = jugadorActual;
    }

    
}
