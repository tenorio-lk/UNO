package Cliente;

import javax.swing.ImageIcon;

public final class CartaReversa extends Carta {
    private final ImageIcon imagen;

    public CartaReversa(String color) {
        super("CartaReversa", color, 0);
        switch (color){
            case "Rojo":
                this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaRojaReversa.png"));
                break;
            case "Amarillo":
                this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaReversa.png"));
                break;
            case "Verde":
                this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaVerdeReversa.png"));
                break;
            case "Azul":
                this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAzulReversa.png"));
                break;
            default:
                this.imagen = null;
                break;
        }
    }
    
    public ImageIcon getImagen() {
        return imagen;  
    }
    
}
