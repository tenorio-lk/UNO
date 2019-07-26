package Cliente;

import javax.swing.ImageIcon;

public final class CartaComodin extends Carta{
    private final ImageIcon imagen;

    public CartaComodin() {
        super("CartaComodin", "Negro", 0);
        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaComodin.png"));
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    
    
    
}
