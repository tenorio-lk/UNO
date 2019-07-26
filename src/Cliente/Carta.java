package Cliente;

import java.io.Serializable;
import javax.swing.ImageIcon;

public abstract class Carta implements Serializable {
    
    protected transient final String    tipo;
    protected transient final String    color;
    protected transient       ImageIcon imagen;
    protected transient int             numero;
    
    public Carta(String tipo, String color, int numero){
        this.tipo  = tipo;
        this.color = color;
        this.numero = numero;
    }

    public final String getTipo() {
        return tipo;
    }

    public final String getColor() {
        return color;
    }
    
    public ImageIcon getImagen() {
        return imagen;
    }
    
    public int getNumero(){
        return numero;
    }
 
}
