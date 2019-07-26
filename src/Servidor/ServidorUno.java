package Servidor;

import Cliente.Mesa;
import java.io.IOException;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServidorUno extends Thread implements Serializable {
    
    public final     Mesa                      ventanaMesa;
    private final     ArrayList<Socket>         sockets;
    private final     ArrayList<ThreadServidor> servidores;
    private final     Partida                   partida;  
    public            int                       numeroDeClientes;
    public transient  ServerSocket              servidor;
    
    
    public ServidorUno(Mesa ventanaMesa, int cantJugadores){
        this.ventanaMesa          = ventanaMesa;
        partida                   = new Partida(this);
        servidores                = new ArrayList<>();
        sockets                   = new ArrayList<>();
        numeroDeClientes          = cantJugadores;
    }
    
    
    @Override
    public void run(){
        try {//crea el socket servidor para aceptar dos conexiones
            System.out.println("running");
            servidor = new ServerSocket(8081);
            ventanaMesa.mostrarRegistroDeEventos("Servidor>> ", "Servidor activo", "");
            ventanaMesa.mostrarRegistroDeEventos("Servidor>> ", "Esperando " + numeroDeClientes + " jugadores", "");
            for(int i = 0; i < numeroDeClientes; i++){
                sockets.add(servidor.accept());
                ThreadServidor usuarioNuevo = new ThreadServidor(sockets.get(sockets.size()-1), this, i, numeroDeClientes-1);
                servidores.add(usuarioNuevo);
                servidores.get(servidores.size()-1).start();
                ventanaMesa.mostrarRegistroDeEventos("Servidor>> ", "Jugador Aceptado", "");
                ventanaMesa.mostrarRegistroDeEventos("Servidor>> ", "Aceptados " + (i+1) + " de " + numeroDeClientes + " jugadores", "");
            }
            ventanaMesa.mostrarRegistroDeEventos("Servidor>> ", "Todos los jugadores han sido aceptados", "");
            if(numeroDeClientes == 2){
                servidores.get(0).annadirServidorEscucha(servidores.get(1));
                servidores.get(1).annadirServidorEscucha(servidores.get(0));
            }
            else if(numeroDeClientes == 3){
                servidores.get(0).annadirServidorEscucha(servidores.get(1));
                servidores.get(0).annadirServidorEscucha(servidores.get(2));
                servidores.get(1).annadirServidorEscucha(servidores.get(2));
                servidores.get(1).annadirServidorEscucha(servidores.get(0));
                servidores.get(2).annadirServidorEscucha(servidores.get(0));
                servidores.get(2).annadirServidorEscucha(servidores.get(1));
            }
            else if(numeroDeClientes == 4){
                servidores.get(0).annadirServidorEscucha(servidores.get(1));
                servidores.get(0).annadirServidorEscucha(servidores.get(2));
                servidores.get(0).annadirServidorEscucha(servidores.get(3));
                servidores.get(1).annadirServidorEscucha(servidores.get(2));
                servidores.get(1).annadirServidorEscucha(servidores.get(3));
                servidores.get(1).annadirServidorEscucha(servidores.get(0));
                servidores.get(2).annadirServidorEscucha(servidores.get(3));
                servidores.get(2).annadirServidorEscucha(servidores.get(0));
                servidores.get(2).annadirServidorEscucha(servidores.get(1));
                servidores.get(3).annadirServidorEscucha(servidores.get(0));
                servidores.get(3).annadirServidorEscucha(servidores.get(1));
                servidores.get(3).annadirServidorEscucha(servidores.get(2));
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { }
            ventanaMesa.iniciarPartida();
            while(true){
                
            }
            
        } catch (IOException ex) {
            ventanaMesa.mostrarRegistroDeEventos("Servidor>> ", "ERROR En el servidor :/", "Roja");
        }
    }
    
    public Partida getPartida(){
        return partida;
    }
    
    public ArrayList<ThreadServidor> getServidores(){
        return servidores;
    }
    
}
