package Servidor;
import Cliente.*;

import Cliente.Jugador;
import java.io.IOException;
import java.io.Serializable;
import static java.lang.Math.abs;
import java.util.ArrayList;

public class Partida implements Serializable{
    
    private final transient ArrayList<Carta>   descarte  = new ArrayList<>();
    private final           ArrayList<Jugador> jugadores = new ArrayList<>();
    private final           CartaFactory       maso;
    private                 String             colorEnJuego;
    private                 int                numeroEnJuego;
    private                 int                numeroJugadores;
    private                 boolean            reversa;
    private                 int                turnoJugador;
    private                 boolean            partidaIniciada;
    private                 boolean            jugoCarta;
    private                 boolean            saltoActivado;
    private final transient ServidorUno        servidor;
    private                 int                contadorTurnoReversa;

  
    //Se creará la partida por medio de la interfaz gráfica
    public Partida(ServidorUno servidor){
        
        this.servidor        = servidor;
        turnoJugador         = 0;
        reversa              = false;
        partidaIniciada      = false;
        jugoCarta            = false;
        contadorTurnoReversa = 0; 
        maso                 = new CartaFactory();
    } 
    
    
    //Método que se encarga de generar el maso y el inicio de la pila del descarte
    //Inicializará los arraylist definidos en la clase
    public void iniciarPartida() throws IOException{
        descarte.add(maso.sacarCartaNumeral());
        colorEnJuego  = descarte.get(0).getColor();
        numeroEnJuego = descarte.get(0).getNumero();
        for(Jugador jugador: jugadores){
            for(int i = 0; i < 7; i++)
                jugador.annadirCarta(maso.sacarCarta());
            jugador.setJuegoActivado(true);
        }
        for(ThreadServidor servidores: servidor.getServidores()){
            servidores.actualizarNombres();
        }
        getServidorActual().actualizarCartasOponentes();
        getServidorActual().actualizarJugadorActual();
    }
    
    //Método que se encarga de añadir un jugador al UNO
    //Se añade un nuevo elemento al arraylist de jugadores
    public void annadirJugador(Jugador jugador){
        jugadores.add(jugador);
        numeroJugadores++;
    }
    
    public ThreadServidor getServidorActual(){
        return servidor.getServidores().get(turnoJugador);
    }
    
    //Método que se encarga de recibir una carta como parámetros
    //Con dicho parámetro, se sabrá si cumple con las reglas del juego o no, aplicando o no su función
    public void manejarCarta(Carta carta) throws IOException{
        System.out.println("Comparando");
        System.out.println(carta.getColor());
        System.out.println(descarte.get(descarte.size()-1).getColor());
        if(carta.getColor().equals(colorEnJuego) || carta.getColor().equals("Negro")
                || carta.getTipo().equals(descarte.get(descarte.size()-1).getTipo())){
            
            switch (carta.getTipo()) {
                case "CartaCome2":
                    colorEnJuego  = carta.getColor();
                    numeroEnJuego = -1;
                    enviarCartasAlJugadorSiguiente(2);
                    getServidorActual().mostrarEvento("Ha jugado Come 2 " + carta.getColor());
                    pasarTurno(2);
                    descarte.add(carta);
                    jugoCarta = true;
                    break;
                case "CartaComodin":
                    getServidorActual().pedirColorComodin();
                    numeroEnJuego = -1;
                    getServidorActual().mostrarEvento("Ha jugado Comodin");
                    pasarTurno(1);
                    descarte.add(carta);
                    jugoCarta = true;
                    break;
                case "CartaComodinCome4":
                    getServidorActual().pedirColorComodin();
                    numeroEnJuego = -1;
                    enviarCartasAlJugadorSiguiente(4);
                    getServidorActual().mostrarEvento("Ha jugado Comodin Come 4");
                    pasarTurno(2);
                    descarte.add(carta);
                    jugoCarta = true;
                    break;
                case "CartaReversa":
                    colorEnJuego  = carta.getColor();
                    numeroEnJuego = -1;
                    reversa = !reversa;
                    if (reversa){
                        contadorTurnoReversa = 12345*jugadores.size();//simplemente se ultiliza un numero multiplo de cantJugadores lo suficientemente grande para que el turno no se vuelva negativo
                        contadorTurnoReversa +=turnoJugador;
                    }
                    getServidorActual().mostrarEvento("Ha jugado Reversa " + carta.getColor());
                    pasarTurno(1);
                    descarte.add(carta);
                    jugoCarta = true;
                    break;
                case "CartaSalto":
                    colorEnJuego  = carta.getColor();
                    numeroEnJuego = -1;
                    getServidorActual().mostrarEvento("Ha jugado Salto " + carta.getColor());
                    pasarTurno(2);
                    descarte.add(carta);
                    jugoCarta = true;
                    break;
                case "CartaNumeral":
                    if (carta.getColor().equals(colorEnJuego) || carta.getNumero() == numeroEnJuego){
                        colorEnJuego = carta.getColor();
                        numeroEnJuego = carta.getNumero();
                        getServidorActual().mostrarEvento("Ha jugado " + carta.getNumero() + " " + carta.getColor());
                        pasarTurno(1);
                        descarte.add(carta);
                        jugoCarta = true;
                    }
                    break;
                default:
                    System.out.println("No se identificó la carta");
                    pasarTurno(1);
                    break;
            }
            setSaltoActivado(false);
        }
    }

    //Método que se encarga de 
    public void enviarCartasAlJugadorSiguiente(int numeroDeCartas){
        if (reversa)
            for (int i = 0; i < numeroDeCartas; i++){
                if (maso.getMaso().isEmpty())
                    rehacerMaso();
                if (turnoJugador == 0)
                    encontrarJugador(numeroJugadores-1).annadirCarta(maso.sacarCarta());
                else
                    encontrarJugador(turnoJugador-1).annadirCarta(maso.sacarCarta());
            }
        else
            for(int i = 0; i < numeroDeCartas; i++){
              if(maso.getMaso().isEmpty())
                  rehacerMaso();
              encontrarJugador((turnoJugador+1)%numeroJugadores).annadirCarta(maso.sacarCarta());
          }
    }
    
    //Método que se encarga de sumar y restar las variables encargadas de asignar los turnos
    //Sumará o restará el contador de turnos para signar el turno
    public void pasarTurno(int salto) throws IOException{
        if(reversa)
            turnoJugador = abs(contadorTurnoReversa -= salto)%numeroJugadores;
        else
            turnoJugador = (turnoJugador + salto)%numeroJugadores;
        getServidorActual().actualizarJugadorActual();
    }   
    
    public void rehacerMaso(){
        maso.voltearMaso(descarte);
        descarte.add(maso.sacarCarta());
    }
    
    public boolean haGanado(int numeroJugador){
        if(jugadores.get(numeroJugador).retorarNumeroCartas() == 0){
            getServidorActual().mostrarEventoServidor("Se notifica que " + encontrarJugador(numeroJugador).getNombreJugador() + " ha ganado");
            turnoJugador = 5; //Gracias a esto, ningún jugador podrá seguir jugando
            return true;
        }
        return false;
    }
    
    public void tomarDeMaso(int numeroJugador) throws IOException{
        if(maso.getMaso().isEmpty())
            rehacerMaso();
        encontrarJugador(numeroJugador).annadirCarta(maso.sacarCarta());
        setSaltoActivado(true);
    }
    
    public void realizarSalto() throws IOException{
        setSaltoActivado(false);
        pasarTurno(1);
    }
    
    public void setPartidaIniciada(boolean estadoJuego){
        partidaIniciada = estadoJuego;
    }
    
    public boolean isPartidaIniciada(){
        return partidaIniciada;
    }
    
    public int getTurnoJugador(){
        return turnoJugador;
    }
    
    public void setColorEnJuego(String color){
        colorEnJuego = color;
    }
    
    public Jugador encontrarJugador(int numeroArray){
        return jugadores.get(numeroArray);
    }
    
    public Carta getTopeDescarte(){
        return descarte.get(descarte.size()-1);
    }
    
    public boolean getJugoLaCarta(){
        return jugoCarta;
    }
    
    public void setJugoLaCarta(boolean estado){
        jugoCarta = estado;
    }
 
    public boolean isSaltoActivado(){
        return saltoActivado;
    }

    public void setSaltoActivado(boolean saltoActivado) {
        this.saltoActivado = saltoActivado;
    }
}
