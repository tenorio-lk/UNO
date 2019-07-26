package Cliente;

import javax.swing.ImageIcon;

public final class CartaSalto extends Carta{
    private final ImageIcon imagen;

    public CartaSalto(String color) {
        super("CartaSalto", color, 0);
        switch (color){
            case "Rojo":
                this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaRojaSalto.png"));
                break;
            case "Amarillo":
                this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaSalto.png"));
                break;
            case "Verde":
                this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaVerdeSalto.png"));
                break;
            case "Azul":
                this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAzulSalto.png"));
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
