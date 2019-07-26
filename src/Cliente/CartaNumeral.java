package Cliente;

import javax.swing.ImageIcon;

public final class CartaNumeral extends Carta{
    private ImageIcon imagen;

    public CartaNumeral(String tipo, String color, int numero) {
        super(tipo, color, numero);
        switch (color){
            case "Rojo":
                switch (numero){
                    case 0:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaRojaNumeral0.png"));
                        break;
                    case 1:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaRojaNumeral1.png"));
                        break;
                    case 2:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaRojaNumeral2.png"));
                        break;
                    case 3:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaRojaNumeral3.png"));
                        break;
                    case 4:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaRojaNumeral4.png"));
                        break;
                    case 5:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaRojaNumeral5.png"));
                        break;
                    case 6:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaRojaNumeral6.png"));
                        break;
                    case 7:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaRojaNumeral7.png"));
                        break;
                    case 8:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaRojaNumeral8.png"));
                        break;
                    case 9:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaRojaNumeral9.png"));
                        break;
                }
                break;
            case "Amarillo":
                switch (numero){
                    case 0:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral0.png"));
                        break;
                    case 1:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral1.png"));
                        break;
                    case 2:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral2.png"));
                        break;
                    case 3:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral3.png"));
                        break;
                    case 4:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral4.png"));
                        break;
                    case 5:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral5.png"));
                        break;
                    case 6:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral6.png"));
                        break;
                    case 7:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral7.png"));
                        break;
                    case 8:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral8.png"));
                        break;
                    case 9:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral9.png"));
                        break;
                }
                break;
            case "Verde":
                switch (numero){
                    case 0:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaVerdeNumeral0.png"));
                        break;
                    case 1:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaVerdeNumeral1.png"));
                        break;
                    case 2:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaVerdeNumeral2.png"));
                        break;
                    case 3:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaVerdeNumeral3.png"));
                        break;
                    case 4:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaVerdeNumeral4.png"));
                        break;
                    case 5:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaVerdeNumeral5.png"));
                        break;
                    case 6:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaVerdeNumeral6.png"));
                        break;
                    case 7:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaVerdeNumeral7.png"));
                        break;
                    case 8:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaVerdeNumeral8.png"));
                        break;
                    case 9:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaVerdeNumeral9.png"));
                        break;
                }
                break;
            case "Azul":
                switch (numero){
                    case 0:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAzulNumeral0.png"));
                        break;
                    case 1:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAzulNumeral1.png"));
                        break;
                    case 2:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAzulNumeral2.png"));
                        break;
                    case 3:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAzulNumeral3.png"));
                        break;
                    case 4:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAzulNumeral4.png"));
                        break;
                    case 5:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAzulNumeral5.png"));
                        break;
                    case 6:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAzulNumeral6.png"));
                        break;
                    case 7:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAzulNumeral7.png"));
                        break;
                    case 8:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAzulNumeral8.png"));
                        break;
                    case 9:
                        this.imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAzulNumeral9.png"));
                        break;
                }
                break;
        }
    }   
    
    public ImageIcon getImagen() {
        return imagen;
    }
}
