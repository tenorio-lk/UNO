package Cliente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public final class CartaFactory {
    
    private ArrayList<Carta> maso;
    private Random random;

    public CartaFactory() {
        this.maso = new ArrayList<>();
        random = new Random();
        
        for (int i = 0; i <= 9; i++){
            for (int j = 0; j < 2 ; j++){
                if (i!= 0){
                    maso.add(crearCarta("cartaNumeral", "Rojo",     i));
                    maso.add(crearCarta("cartaNumeral", "Amarillo", i));
                    maso.add(crearCarta("cartaNumeral", "Verde",    i));
                    maso.add(crearCarta("cartaNumeral", "Azul",     i));
                }
                else if (j == 0){
                    maso.add(crearCarta("cartaNumeral", "Rojo",     0));
                    maso.add(crearCarta("cartaNumeral", "Amarillo", 0));
                    maso.add(crearCarta("cartaNumeral", "Verde",    0));
                    maso.add(crearCarta("cartaNumeral", "Azul",     0));
                    for (int k = 0; k < 4; k++){
                        maso.add(crearCarta("cartaComodin",      "", 0));
                        maso.add(crearCarta("cartaComodinCome4", "", 0));
                        if (k < 2){
                            maso.add(crearCarta("cartaSalto",   "Rojo",     0));
                            maso.add(crearCarta("cartaSalto",   "Amarillo", 0));
                            maso.add(crearCarta("cartaSalto",   "Verde",    0));
                            maso.add(crearCarta("cartaSalto",   "Azul",     0));
                            maso.add(crearCarta("cartaReversa", "Rojo",     0));
                            maso.add(crearCarta("cartaReversa", "Amarillo", 0));
                            maso.add(crearCarta("cartaReversa", "Verde",    0));
                            maso.add(crearCarta("cartaReversa", "Azul",     0));
                            maso.add(crearCarta("cartaCome2",   "Rojo",     0));
                            maso.add(crearCarta("cartaCome2",   "Amarillo", 0));
                            maso.add(crearCarta("cartaCome2",   "Verde",    0));
                            maso.add(crearCarta("cartaCome2",   "Azul",     0));
                        }
                    }
                }
            }   
        }
        Collections.shuffle(maso);
    }
    
    private Carta crearCarta(String tipo, String color, int numero){
        switch(tipo) {
            case "cartaNumeral":
                return new CartaNumeral("CartaNumeral", color, numero);
            case "cartaSalto":
                return new CartaSalto(color);
            case "cartaReversa":
                return new CartaReversa(color);
            case "cartaCome2":
                return new CartaCome2(color);
            case "cartaComodin":
                return new CartaComodin();
            case "cartaComodinCome4":
                return new CartaComodinCome4();
            default:
                System.out.println("No encontró tipo de carta para crear");
                return null;
        }
    }

    public ArrayList<Carta> getMaso() {
        return maso;
    }
    
    public Carta sacarCarta(){
        return maso.remove(maso.size()-1);
    }
    
    public void voltearMaso(ArrayList<Carta> descarte){
        maso = descarte;
        Collections.shuffle(maso);
    }
    
    public Carta sacarCartaNumeral(){
        int cont = maso.size()-1;
        while (!"CartaNumeral".equals(maso.get(cont).tipo)){
            cont--;
        }
        return maso.remove(cont);
    }
    
}
