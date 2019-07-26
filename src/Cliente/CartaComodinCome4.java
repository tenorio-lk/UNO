package Cliente;

import javax.swing.ImageIcon;

public final class CartaComodinCome4 extends Carta {
    private final ImageIcon imagen;

    public CartaComodinCome4(){
        super("CartaComodinCome4", "Negro", 0);
        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaComodinCome4.png"));
    }
    
    public ImageIcon getImagen() {
        return imagen;
    }
    
}
