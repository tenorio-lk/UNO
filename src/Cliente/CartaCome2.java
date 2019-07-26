package Cliente;

import javax.swing.ImageIcon;

public final class CartaCome2 extends Carta {
    private final ImageIcon imagen;

    public CartaCome2(String color) {
        super("CartaCome2", color, 0);
        switch (color){
            case "Rojo":
                this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaRojaCome2.png"));
                break;
            case "Amarillo":
                this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaCome2.png"));
                break;
            case "Verde":
                this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaVerdeCome2.png"));
                break;
            case "Azul":
                this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAzulCome2.png"));
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
