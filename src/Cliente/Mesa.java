package Cliente;


import java.awt.Color;
import java.util.ArrayList;
import javax.swing.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

public class Mesa extends javax.swing.JFrame {
    
    private       Jugador           jugador;
    private final ArrayList<JLabel> arylblMisCartas;
    private final ArrayList<JLabel> arylblCartasJugador2;
    private final ArrayList<JLabel> arylblCartasJugador3;
    private final ArrayList<JLabel> arylblCartasJugador4;
    
    
    public Mesa() {
            arylblMisCartas      = new ArrayList<>();
            arylblCartasJugador2 = new ArrayList<>();
            arylblCartasJugador3 = new ArrayList<>();
            arylblCartasJugador4 = new ArrayList<>();
            initComponents();        
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPartida = new javax.swing.JPanel();
        btnSalto = new javax.swing.JButton();
        lblTurnoJugador2 = new javax.swing.JLabel();
        lblTurnoJugador3 = new javax.swing.JLabel();
        lblTurnoMio = new javax.swing.JLabel();
        lblTurnoJugador4 = new javax.swing.JLabel();
        pnlJugador = new javax.swing.JPanel();
        lblMisCartas = new javax.swing.JLabel();
        lblMisCartas1 = new javax.swing.JLabel();
        lblMisCartas2 = new javax.swing.JLabel();
        lblMisCartas3 = new javax.swing.JLabel();
        lblMisCartas4 = new javax.swing.JLabel();
        lblMisCartas5 = new javax.swing.JLabel();
        lblMisCartas6 = new javax.swing.JLabel();
        lblMisCartas7 = new javax.swing.JLabel();
        lblMisCartas8 = new javax.swing.JLabel();
        lblMisCartas9 = new javax.swing.JLabel();
        lblMisCartas10 = new javax.swing.JLabel();
        lblMisCartas11 = new javax.swing.JLabel();
        lblMisCartas12 = new javax.swing.JLabel();
        lblMisCartas13 = new javax.swing.JLabel();
        lblMisCartas14 = new javax.swing.JLabel();
        lblMisCartas15 = new javax.swing.JLabel();
        lblMisCartas16 = new javax.swing.JLabel();
        lblMisCartas17 = new javax.swing.JLabel();
        lblMisCartas18 = new javax.swing.JLabel();
        lblMisCartas19 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        btnMasoComer = new javax.swing.JLabel();
        lblCartasJugador2n = new javax.swing.JLabel();
        lblCartasJugador2n1 = new javax.swing.JLabel();
        lblCartasJugador2n2 = new javax.swing.JLabel();
        lblCartasJugador2n3 = new javax.swing.JLabel();
        lblCartasJugador2n4 = new javax.swing.JLabel();
        lblCartasJugador2n5 = new javax.swing.JLabel();
        lblCartasJugador2n6 = new javax.swing.JLabel();
        lblCartasJugador2n7 = new javax.swing.JLabel();
        lblCartasJugador2n8 = new javax.swing.JLabel();
        lblCartasJugador2n9 = new javax.swing.JLabel();
        lblCartasJugador2n10 = new javax.swing.JLabel();
        lblCartasJugador2n11 = new javax.swing.JLabel();
        lblCartasJugador2n12 = new javax.swing.JLabel();
        lblCartasJugador2n13 = new javax.swing.JLabel();
        lblCartasJugador2n14 = new javax.swing.JLabel();
        lblCartasJugador2n15 = new javax.swing.JLabel();
        lblCartasJugador2n16 = new javax.swing.JLabel();
        lblCartasJugador2n17 = new javax.swing.JLabel();
        lblCartasJugador2n18 = new javax.swing.JLabel();
        lblCartasJugador2n19 = new javax.swing.JLabel();
        lblCartasJugador3n = new javax.swing.JLabel();
        lblCartasJugador3n1 = new javax.swing.JLabel();
        lblCartasJugador3n2 = new javax.swing.JLabel();
        lblCartasJugador3n3 = new javax.swing.JLabel();
        lblCartasJugador3n4 = new javax.swing.JLabel();
        lblCartasJugador3n5 = new javax.swing.JLabel();
        lblCartasJugador3n6 = new javax.swing.JLabel();
        lblCartasJugador3n7 = new javax.swing.JLabel();
        lblCartasJugador3n8 = new javax.swing.JLabel();
        lblCartasJugador3n9 = new javax.swing.JLabel();
        lblCartasJugador3n10 = new javax.swing.JLabel();
        lblCartasJugador3n11 = new javax.swing.JLabel();
        lblCartasJugador3n12 = new javax.swing.JLabel();
        lblCartasJugador3n13 = new javax.swing.JLabel();
        lblCartasJugador3n14 = new javax.swing.JLabel();
        lblCartasJugador3n15 = new javax.swing.JLabel();
        lblCartasJugador3n16 = new javax.swing.JLabel();
        lblCartasJugador3n17 = new javax.swing.JLabel();
        lblCartasJugador3n18 = new javax.swing.JLabel();
        lblCartasJugador3n19 = new javax.swing.JLabel();
        lblCartasJugador4n = new javax.swing.JLabel();
        lblCartasJugador4n1 = new javax.swing.JLabel();
        lblCartasJugador4n2 = new javax.swing.JLabel();
        lblCartasJugador4n3 = new javax.swing.JLabel();
        lblCartasJugador4n4 = new javax.swing.JLabel();
        lblCartasJugador4n5 = new javax.swing.JLabel();
        lblCartasJugador4n6 = new javax.swing.JLabel();
        lblCartasJugador4n7 = new javax.swing.JLabel();
        lblCartasJugador4n8 = new javax.swing.JLabel();
        lblCartasJugador4n9 = new javax.swing.JLabel();
        lblCartasJugador4n10 = new javax.swing.JLabel();
        lblCartasJugador4n11 = new javax.swing.JLabel();
        lblCartasJugador4n12 = new javax.swing.JLabel();
        lblCartasJugador4n13 = new javax.swing.JLabel();
        lblCartasJugador4n14 = new javax.swing.JLabel();
        lblCartasJugador4n15 = new javax.swing.JLabel();
        lblCartasJugador4n16 = new javax.swing.JLabel();
        lblCartasJugador4n17 = new javax.swing.JLabel();
        lblCartasJugador4n18 = new javax.swing.JLabel();
        lblCartasJugador4n19 = new javax.swing.JLabel();
        lblCartaActual = new javax.swing.JLabel();
        lblMaso = new javax.swing.JLabel();
        lblDescarte = new javax.swing.JLabel();
        labelJugadores = new javax.swing.JLabel();
        srpRegistroDeEventos = new javax.swing.JScrollPane();
        txpRegistroDeEventos = new javax.swing.JTextPane();
        lblMiNombre = new javax.swing.JLabel();
        lblNombre4 = new javax.swing.JLabel();
        lblNombre3 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        lblFondoPrincipal = new javax.swing.JLabel();
        labelJugador = new javax.swing.JLabel();
        btnUNO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1147, 643));
        setPreferredSize(new java.awt.Dimension(1163, 682));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlPartida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnSalto.png"))); // NOI18N
        btnSalto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaltoActionPerformed(evt);
            }
        });
        pnlPartida.add(btnSalto, new org.netbeans.lib.awtextra.AbsoluteConstraints(934, 554, 162, 56));

        lblTurnoJugador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnLuzApagada.png"))); // NOI18N
        lblTurnoJugador2.setText("jLabel1");
        pnlPartida.add(lblTurnoJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 130, 100));

        lblTurnoJugador3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnLuzApagada.png"))); // NOI18N
        lblTurnoJugador3.setText("jLabel1");
        pnlPartida.add(lblTurnoJugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 120, 130, 100));

        lblTurnoMio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnLuzAzul.png"))); // NOI18N
        lblTurnoMio.setText("jLabel1");
        pnlPartida.add(lblTurnoMio, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 130, 100));

        lblTurnoJugador4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnLuzApagada.png"))); // NOI18N
        lblTurnoJugador4.setText("jLabel1");
        pnlPartida.add(lblTurnoJugador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 130, 100));

        pnlJugador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMisCartas.setBackground(new java.awt.Color(0, 204, 153));
        lblMisCartas.setForeground(new java.awt.Color(0, 204, 255));
        lblMisCartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral9.png"))); // NOI18N
        lblMisCartas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMisCartas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMisCartasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMisCartasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMisCartasMouseExited(evt);
            }
        });
        pnlJugador.add(lblMisCartas, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 90, 130));

        lblMisCartas1.setBackground(new java.awt.Color(0, 204, 153));
        lblMisCartas1.setForeground(new java.awt.Color(0, 204, 255));
        lblMisCartas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral9.png"))); // NOI18N
        lblMisCartas1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMisCartas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMisCartas1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMisCartas1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMisCartas1MouseExited(evt);
            }
        });
        pnlJugador.add(lblMisCartas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 90, 130));

        lblMisCartas2.setBackground(new java.awt.Color(0, 204, 153));
        lblMisCartas2.setForeground(new java.awt.Color(0, 204, 255));
        lblMisCartas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral9.png"))); // NOI18N
        lblMisCartas2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMisCartas2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMisCartas2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMisCartas2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMisCartas2MouseExited(evt);
            }
        });
        pnlJugador.add(lblMisCartas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 90, 130));

        lblMisCartas3.setBackground(new java.awt.Color(0, 204, 153));
        lblMisCartas3.setForeground(new java.awt.Color(0, 204, 255));
        lblMisCartas3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral9.png"))); // NOI18N
        lblMisCartas3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMisCartas3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMisCartas3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMisCartas3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMisCartas3MouseExited(evt);
            }
        });
        pnlJugador.add(lblMisCartas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 90, 130));

        lblMisCartas4.setBackground(new java.awt.Color(0, 204, 153));
        lblMisCartas4.setForeground(new java.awt.Color(0, 204, 255));
        lblMisCartas4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral9.png"))); // NOI18N
        lblMisCartas4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMisCartas4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMisCartas4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMisCartas4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMisCartas4MouseExited(evt);
            }
        });
        pnlJugador.add(lblMisCartas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 90, 130));

        lblMisCartas5.setBackground(new java.awt.Color(0, 204, 153));
        lblMisCartas5.setForeground(new java.awt.Color(0, 204, 255));
        lblMisCartas5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral9.png"))); // NOI18N
        lblMisCartas5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMisCartas5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMisCartas5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMisCartas5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMisCartas5MouseExited(evt);
            }
        });
        pnlJugador.add(lblMisCartas5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 90, 130));

        lblMisCartas6.setBackground(new java.awt.Color(0, 204, 153));
        lblMisCartas6.setForeground(new java.awt.Color(0, 204, 255));
        lblMisCartas6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral9.png"))); // NOI18N
        lblMisCartas6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMisCartas6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMisCartas6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMisCartas6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMisCartas6MouseExited(evt);
            }
        });
        pnlJugador.add(lblMisCartas6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 90, 130));

        lblMisCartas7.setBackground(new java.awt.Color(0, 204, 153));
        lblMisCartas7.setForeground(new java.awt.Color(0, 204, 255));
        lblMisCartas7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral9.png"))); // NOI18N
        lblMisCartas7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMisCartas7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMisCartas7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMisCartas7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMisCartas7MouseExited(evt);
            }
        });
        pnlJugador.add(lblMisCartas7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 90, 130));

        lblMisCartas8.setBackground(new java.awt.Color(0, 204, 153));
        lblMisCartas8.setForeground(new java.awt.Color(0, 204, 255));
        lblMisCartas8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral9.png"))); // NOI18N
        lblMisCartas8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMisCartas8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMisCartas8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMisCartas8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMisCartas8MouseExited(evt);
            }
        });
        pnlJugador.add(lblMisCartas8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 90, 130));

        lblMisCartas9.setBackground(new java.awt.Color(0, 204, 153));
        lblMisCartas9.setForeground(new java.awt.Color(0, 204, 255));
        lblMisCartas9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral9.png"))); // NOI18N
        lblMisCartas9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMisCartas9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMisCartas9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMisCartas9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMisCartas9MouseExited(evt);
            }
        });
        pnlJugador.add(lblMisCartas9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 90, 130));

        lblMisCartas10.setBackground(new java.awt.Color(0, 204, 153));
        lblMisCartas10.setForeground(new java.awt.Color(0, 204, 255));
        lblMisCartas10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral9.png"))); // NOI18N
        lblMisCartas10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMisCartas10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMisCartas10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMisCartas10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMisCartas10MouseExited(evt);
            }
        });
        pnlJugador.add(lblMisCartas10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 90, 130));

        lblMisCartas11.setBackground(new java.awt.Color(0, 204, 153));
        lblMisCartas11.setForeground(new java.awt.Color(0, 204, 255));
        lblMisCartas11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral9.png"))); // NOI18N
        lblMisCartas11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMisCartas11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMisCartas11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMisCartas11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMisCartas11MouseExited(evt);
            }
        });
        pnlJugador.add(lblMisCartas11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 90, 130));

        lblMisCartas12.setBackground(new java.awt.Color(0, 204, 153));
        lblMisCartas12.setForeground(new java.awt.Color(0, 204, 255));
        lblMisCartas12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral9.png"))); // NOI18N
        lblMisCartas12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMisCartas12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMisCartas12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMisCartas12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMisCartas12MouseExited(evt);
            }
        });
        pnlJugador.add(lblMisCartas12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 90, 130));

        lblMisCartas13.setBackground(new java.awt.Color(0, 204, 153));
        lblMisCartas13.setForeground(new java.awt.Color(0, 204, 255));
        lblMisCartas13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral9.png"))); // NOI18N
        lblMisCartas13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMisCartas13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMisCartas13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMisCartas13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMisCartas13MouseExited(evt);
            }
        });
        pnlJugador.add(lblMisCartas13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 90, 130));

        lblMisCartas14.setBackground(new java.awt.Color(0, 204, 153));
        lblMisCartas14.setForeground(new java.awt.Color(0, 204, 255));
        lblMisCartas14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral9.png"))); // NOI18N
        lblMisCartas14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMisCartas14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMisCartas14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMisCartas14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMisCartas14MouseExited(evt);
            }
        });
        pnlJugador.add(lblMisCartas14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 90, 130));

        lblMisCartas15.setBackground(new java.awt.Color(0, 204, 153));
        lblMisCartas15.setForeground(new java.awt.Color(0, 204, 255));
        lblMisCartas15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral9.png"))); // NOI18N
        lblMisCartas15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMisCartas15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMisCartas15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMisCartas15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMisCartas15MouseExited(evt);
            }
        });
        pnlJugador.add(lblMisCartas15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 90, 130));

        lblMisCartas16.setBackground(new java.awt.Color(0, 204, 153));
        lblMisCartas16.setForeground(new java.awt.Color(0, 204, 255));
        lblMisCartas16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral9.png"))); // NOI18N
        lblMisCartas16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMisCartas16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMisCartas16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMisCartas16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMisCartas16MouseExited(evt);
            }
        });
        pnlJugador.add(lblMisCartas16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 90, 130));

        lblMisCartas17.setBackground(new java.awt.Color(0, 204, 153));
        lblMisCartas17.setForeground(new java.awt.Color(0, 204, 255));
        lblMisCartas17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral9.png"))); // NOI18N
        lblMisCartas17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMisCartas17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMisCartas17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMisCartas17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMisCartas17MouseExited(evt);
            }
        });
        pnlJugador.add(lblMisCartas17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 90, 130));

        lblMisCartas18.setBackground(new java.awt.Color(0, 204, 153));
        lblMisCartas18.setForeground(new java.awt.Color(0, 204, 255));
        lblMisCartas18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral9.png"))); // NOI18N
        lblMisCartas18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMisCartas18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMisCartas18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMisCartas18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMisCartas18MouseExited(evt);
            }
        });
        pnlJugador.add(lblMisCartas18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 90, 130));

        lblMisCartas19.setBackground(new java.awt.Color(0, 204, 153));
        lblMisCartas19.setForeground(new java.awt.Color(0, 204, 255));
        lblMisCartas19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAmarillaNumeral9.png"))); // NOI18N
        lblMisCartas19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMisCartas19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMisCartas19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMisCartas19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMisCartas19MouseExited(evt);
            }
        });
        pnlJugador.add(lblMisCartas19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 90, 130));

        lblFondo.setBackground(new java.awt.Color(0, 204, 153));
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoJugador.png"))); // NOI18N
        lblFondo.setText("Tenorio");
        pnlJugador.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 678, 174));

        pnlPartida.add(pnlJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 469, 678, 174));

        btnMasoComer.setBackground(new java.awt.Color(0, 204, 153));
        btnMasoComer.setForeground(new java.awt.Color(0, 204, 255));
        btnMasoComer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnMasoComer.png"))); // NOI18N
        btnMasoComer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMasoComer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMasoComerMouseClicked(evt);
            }
        });
        pnlPartida.add(btnMasoComer, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 84, 129));

        lblCartasJugador2n.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador2n.setForeground(new java.awt.Color(0, 204, 255));
        lblCartasJugador2n.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaJugador2.png"))); // NOI18N
        pnlPartida.add(lblCartasJugador2n, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 65, 100));

        lblCartasJugador2n1.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador2n1.setForeground(new java.awt.Color(0, 204, 255));
        lblCartasJugador2n1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaJugador2.png"))); // NOI18N
        pnlPartida.add(lblCartasJugador2n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 20, 65, 100));

        lblCartasJugador2n2.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador2n2.setForeground(new java.awt.Color(0, 204, 255));
        lblCartasJugador2n2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaJugador2.png"))); // NOI18N
        pnlPartida.add(lblCartasJugador2n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 20, 65, 100));

        lblCartasJugador2n3.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador2n3.setForeground(new java.awt.Color(0, 204, 255));
        lblCartasJugador2n3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaJugador2.png"))); // NOI18N
        pnlPartida.add(lblCartasJugador2n3, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 20, 65, 100));

        lblCartasJugador2n4.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador2n4.setForeground(new java.awt.Color(0, 204, 255));
        lblCartasJugador2n4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaJugador2.png"))); // NOI18N
        pnlPartida.add(lblCartasJugador2n4, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 20, 65, 100));

        lblCartasJugador2n5.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador2n5.setForeground(new java.awt.Color(0, 204, 255));
        lblCartasJugador2n5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaJugador2.png"))); // NOI18N
        pnlPartida.add(lblCartasJugador2n5, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 20, 65, 100));

        lblCartasJugador2n6.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador2n6.setForeground(new java.awt.Color(0, 204, 255));
        lblCartasJugador2n6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaJugador2.png"))); // NOI18N
        pnlPartida.add(lblCartasJugador2n6, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 20, 65, 100));

        lblCartasJugador2n7.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador2n7.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador2n7, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 20, 65, 100));

        lblCartasJugador2n8.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador2n8.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador2n8, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 20, 65, 100));

        lblCartasJugador2n9.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador2n9.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador2n9, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 20, 65, 100));

        lblCartasJugador2n10.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador2n10.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador2n10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 65, 100));

        lblCartasJugador2n11.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador2n11.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador2n11, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 20, 65, 100));

        lblCartasJugador2n12.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador2n12.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador2n12, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 20, 65, 100));

        lblCartasJugador2n13.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador2n13.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador2n13, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 20, 65, 100));

        lblCartasJugador2n14.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador2n14.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador2n14, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 20, 65, 100));

        lblCartasJugador2n15.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador2n15.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador2n15, new org.netbeans.lib.awtextra.AbsoluteConstraints(665, 20, 65, 100));

        lblCartasJugador2n16.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador2n16.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador2n16, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 20, 65, 100));

        lblCartasJugador2n17.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador2n17.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador2n17, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 65, 100));

        lblCartasJugador2n18.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador2n18.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador2n18, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 20, 65, 100));

        lblCartasJugador2n19.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador2n19.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador2n19, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 20, 65, 100));

        lblCartasJugador3n.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador3n.setForeground(new java.awt.Color(0, 204, 255));
        lblCartasJugador3n.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaJugador3.png"))); // NOI18N
        pnlPartida.add(lblCartasJugador3n, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 135, 98, 66));

        lblCartasJugador3n1.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador3n1.setForeground(new java.awt.Color(0, 204, 255));
        lblCartasJugador3n1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaJugador3.png"))); // NOI18N
        pnlPartida.add(lblCartasJugador3n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 152, 98, 66));

        lblCartasJugador3n2.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador3n2.setForeground(new java.awt.Color(0, 204, 255));
        lblCartasJugador3n2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaJugador3.png"))); // NOI18N
        pnlPartida.add(lblCartasJugador3n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 169, 98, 66));

        lblCartasJugador3n3.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador3n3.setForeground(new java.awt.Color(0, 204, 255));
        lblCartasJugador3n3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaJugador3.png"))); // NOI18N
        pnlPartida.add(lblCartasJugador3n3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 186, 98, 66));

        lblCartasJugador3n4.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador3n4.setForeground(new java.awt.Color(0, 204, 255));
        lblCartasJugador3n4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaJugador3.png"))); // NOI18N
        pnlPartida.add(lblCartasJugador3n4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 203, 98, 66));

        lblCartasJugador3n5.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador3n5.setForeground(new java.awt.Color(0, 204, 255));
        lblCartasJugador3n5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaJugador3.png"))); // NOI18N
        pnlPartida.add(lblCartasJugador3n5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 220, 98, 66));

        lblCartasJugador3n6.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador3n6.setForeground(new java.awt.Color(0, 204, 255));
        lblCartasJugador3n6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaJugador3.png"))); // NOI18N
        pnlPartida.add(lblCartasJugador3n6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 237, 98, 66));

        lblCartasJugador3n7.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador3n7.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador3n7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 254, 98, 66));

        lblCartasJugador3n8.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador3n8.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador3n8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 271, 98, 66));

        lblCartasJugador3n9.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador3n9.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador3n9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 288, 98, 66));

        lblCartasJugador3n10.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador3n10.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador3n10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 305, 98, 66));

        lblCartasJugador3n11.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador3n11.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador3n11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 322, 98, 66));

        lblCartasJugador3n12.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador3n12.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador3n12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 339, 98, 66));

        lblCartasJugador3n13.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador3n13.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador3n13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 356, 98, 66));

        lblCartasJugador3n14.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador3n14.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador3n14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 373, 98, 66));

        lblCartasJugador3n15.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador3n15.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador3n15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 390, 98, 66));

        lblCartasJugador3n16.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador3n16.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador3n16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 407, 98, 66));

        lblCartasJugador3n17.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador3n17.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador3n17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 424, 98, 66));

        lblCartasJugador3n18.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador3n18.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador3n18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 441, 98, 66));

        lblCartasJugador3n19.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador3n19.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador3n19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 458, 98, 66));

        lblCartasJugador4n.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador4n.setForeground(new java.awt.Color(0, 204, 255));
        lblCartasJugador4n.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaJugador4.png"))); // NOI18N
        pnlPartida.add(lblCartasJugador4n, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 135, 98, 66));

        lblCartasJugador4n1.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador4n1.setForeground(new java.awt.Color(0, 204, 255));
        lblCartasJugador4n1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaJugador4.png"))); // NOI18N
        pnlPartida.add(lblCartasJugador4n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 152, 98, 66));

        lblCartasJugador4n2.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador4n2.setForeground(new java.awt.Color(0, 204, 255));
        lblCartasJugador4n2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaJugador4.png"))); // NOI18N
        pnlPartida.add(lblCartasJugador4n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 169, 98, 66));

        lblCartasJugador4n3.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador4n3.setForeground(new java.awt.Color(0, 204, 255));
        lblCartasJugador4n3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaJugador4.png"))); // NOI18N
        pnlPartida.add(lblCartasJugador4n3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 186, 98, 66));

        lblCartasJugador4n4.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador4n4.setForeground(new java.awt.Color(0, 204, 255));
        lblCartasJugador4n4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaJugador4.png"))); // NOI18N
        pnlPartida.add(lblCartasJugador4n4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 203, 98, 66));

        lblCartasJugador4n5.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador4n5.setForeground(new java.awt.Color(0, 204, 255));
        lblCartasJugador4n5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaJugador4.png"))); // NOI18N
        pnlPartida.add(lblCartasJugador4n5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 98, 66));

        lblCartasJugador4n6.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador4n6.setForeground(new java.awt.Color(0, 204, 255));
        lblCartasJugador4n6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaJugador4.png"))); // NOI18N
        pnlPartida.add(lblCartasJugador4n6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 237, 98, 66));

        lblCartasJugador4n7.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador4n7.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador4n7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 254, 98, 66));

        lblCartasJugador4n8.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador4n8.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador4n8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 271, 98, 66));

        lblCartasJugador4n9.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador4n9.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador4n9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 288, 98, 66));

        lblCartasJugador4n10.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador4n10.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador4n10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 305, 98, 66));

        lblCartasJugador4n11.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador4n11.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador4n11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 322, 98, 66));

        lblCartasJugador4n12.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador4n12.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador4n12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 339, 98, 66));

        lblCartasJugador4n13.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador4n13.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador4n13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 356, 98, 66));

        lblCartasJugador4n14.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador4n14.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador4n14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 373, 98, 66));

        lblCartasJugador4n15.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador4n15.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador4n15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 98, 66));

        lblCartasJugador4n16.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador4n16.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador4n16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 407, 98, 66));

        lblCartasJugador4n17.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador4n17.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador4n17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 424, 98, 66));

        lblCartasJugador4n18.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador4n18.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador4n18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 441, 98, 66));

        lblCartasJugador4n19.setBackground(new java.awt.Color(0, 204, 153));
        lblCartasJugador4n19.setForeground(new java.awt.Color(0, 204, 255));
        pnlPartida.add(lblCartasJugador4n19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 458, 98, 66));

        lblCartaActual.setBackground(new java.awt.Color(0, 204, 153));
        lblCartaActual.setForeground(new java.awt.Color(0, 204, 255));
        lblCartaActual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaAzulNumeral1.png"))); // NOI18N
        pnlPartida.add(lblCartaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 250, 90, 130));

        lblMaso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/masoUna.png"))); // NOI18N
        lblMaso.setText("jLabel2");
        pnlPartida.add(lblMaso, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 177, -1, -1));

        lblDescarte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/descarteDos.png"))); // NOI18N
        pnlPartida.add(lblDescarte, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 177, -1, -1));

        labelJugadores.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        labelJugadores.setForeground(new java.awt.Color(0, 153, 153));
        pnlPartida.add(labelJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 90, 140));

        srpRegistroDeEventos.setBackground(new java.awt.Color(0, 0, 0));
        srpRegistroDeEventos.setBorder(null);
        srpRegistroDeEventos.setOpaque(false);

        txpRegistroDeEventos.setBackground(new java.awt.Color(153, 153, 153));
        txpRegistroDeEventos.setBorder(null);
        txpRegistroDeEventos.setFont(new java.awt.Font("Kristen ITC", 1, 11)); // NOI18N
        txpRegistroDeEventos.setForeground(new java.awt.Color(0, 204, 204));
        srpRegistroDeEventos.setViewportView(txpRegistroDeEventos);

        pnlPartida.add(srpRegistroDeEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 8, 340, 100));

        lblMiNombre.setFont(new java.awt.Font("Kristen ITC", 1, 11)); // NOI18N
        lblMiNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMiNombre.setToolTipText("");
        pnlPartida.add(lblMiNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 450, 140, 20));

        lblNombre4.setFont(new java.awt.Font("Kristen ITC", 1, 11)); // NOI18N
        lblNombre4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre4.setToolTipText("");
        pnlPartida.add(lblNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 140, 20));

        lblNombre3.setFont(new java.awt.Font("Kristen ITC", 1, 11)); // NOI18N
        lblNombre3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre3.setToolTipText("");
        pnlPartida.add(lblNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 210, 140, 20));

        lblNombre2.setFont(new java.awt.Font("Kristen ITC", 1, 11)); // NOI18N
        lblNombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre2.setToolTipText("");
        pnlPartida.add(lblNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 146, 139, 20));

        lblFondoPrincipal.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        lblFondoPrincipal.setForeground(new java.awt.Color(0, 153, 153));
        lblFondoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoPrincipal.png"))); // NOI18N
        pnlPartida.add(lblFondoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        labelJugador.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        labelJugador.setForeground(new java.awt.Color(0, 153, 153));
        pnlPartida.add(labelJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 270, 40));

        btnUNO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnCrearPartida.png"))); // NOI18N
        btnUNO.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUNOActionPerformed(evt);
            }
        });
        pnlPartida.add(btnUNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 554, 161, 55));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUNOActionPerformed
        //iniciarPartida();
    }//GEN-LAST:event_btnUNOActionPerformed

    private void btnSaltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaltoActionPerformed
        try {
            if (jugador.isJugadorActual())
                jugador.salida.writeInt(7);
        } catch (IOException ex) {
            Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaltoActionPerformed

    private void lblMisCartasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartasMouseEntered
        lblMisCartas.setLocation(lblMisCartas.getX(), 0);
    }//GEN-LAST:event_lblMisCartasMouseEntered

    private void lblMisCartasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartasMouseExited
        
        lblMisCartas.setLocation(lblMisCartas.getX(), 30);
    }//GEN-LAST:event_lblMisCartasMouseExited

    private void lblMisCartas1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas1MouseEntered
        
        lblMisCartas1.setLocation(lblMisCartas1.getX(),0);
    }//GEN-LAST:event_lblMisCartas1MouseEntered

    private void lblMisCartas1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas1MouseExited
        
        lblMisCartas1.setLocation(lblMisCartas1.getX(), 30);
    }//GEN-LAST:event_lblMisCartas1MouseExited

    private void lblMisCartas3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas3MouseEntered
        
        lblMisCartas3.setLocation(lblMisCartas3.getX(), 0);
    }//GEN-LAST:event_lblMisCartas3MouseEntered

    private void lblMisCartas3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas3MouseExited
        
        lblMisCartas3.setLocation(lblMisCartas3.getX(), 30);
    }//GEN-LAST:event_lblMisCartas3MouseExited

    private void lblMisCartas4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas4MouseEntered
        
        lblMisCartas4.setLocation(lblMisCartas4.getX(), 0);
    }//GEN-LAST:event_lblMisCartas4MouseEntered

    private void lblMisCartas4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas4MouseExited
        
        lblMisCartas4.setLocation(lblMisCartas4.getX(), 30);
    }//GEN-LAST:event_lblMisCartas4MouseExited

    private void lblMisCartas5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas5MouseEntered
        
        lblMisCartas5.setLocation(lblMisCartas5.getX(), 0);
    }//GEN-LAST:event_lblMisCartas5MouseEntered

    private void lblMisCartas5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas5MouseExited
        
        lblMisCartas5.setLocation(lblMisCartas5.getX(), 30);
    }//GEN-LAST:event_lblMisCartas5MouseExited

    private void lblMisCartas6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas6MouseEntered
        
        lblMisCartas6.setLocation(lblMisCartas6.getX(), 0);
    }//GEN-LAST:event_lblMisCartas6MouseEntered

    private void lblMisCartas6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas6MouseExited
        
        lblMisCartas6.setLocation(lblMisCartas6.getX(), 30);
    }//GEN-LAST:event_lblMisCartas6MouseExited

    private void lblMisCartas7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas7MouseEntered
        
        lblMisCartas7.setLocation(lblMisCartas7.getX(), 0);
    }//GEN-LAST:event_lblMisCartas7MouseEntered

    private void lblMisCartas7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas7MouseExited
        
        lblMisCartas7.setLocation(lblMisCartas7.getX(), 30);
    }//GEN-LAST:event_lblMisCartas7MouseExited

    private void lblMisCartas8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas8MouseEntered
        
        lblMisCartas8.setLocation(lblMisCartas8.getX(), 0);
    }//GEN-LAST:event_lblMisCartas8MouseEntered

    private void lblMisCartas8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas8MouseExited
        
        lblMisCartas8.setLocation(lblMisCartas8.getX(), 30);
    }//GEN-LAST:event_lblMisCartas8MouseExited

    private void lblMisCartas9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas9MouseEntered
        
        lblMisCartas9.setLocation(lblMisCartas9.getX(), 0);
    }//GEN-LAST:event_lblMisCartas9MouseEntered

    private void lblMisCartas9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas9MouseExited
        
        lblMisCartas9.setLocation(lblMisCartas9.getX(), 30);
    }//GEN-LAST:event_lblMisCartas9MouseExited

    private void lblMisCartas10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas10MouseEntered
        
        lblMisCartas10.setLocation(lblMisCartas10.getX(), 0);
    }//GEN-LAST:event_lblMisCartas10MouseEntered

    private void lblMisCartas10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas10MouseExited
        
        lblMisCartas10.setLocation(lblMisCartas10.getX(), 30);
    }//GEN-LAST:event_lblMisCartas10MouseExited

    private void lblMisCartas11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas11MouseEntered
        
        lblMisCartas11.setLocation(lblMisCartas11.getX(), 0);
    }//GEN-LAST:event_lblMisCartas11MouseEntered

    private void lblMisCartas11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas11MouseExited
        
        lblMisCartas11.setLocation(lblMisCartas11.getX(), 30);
    }//GEN-LAST:event_lblMisCartas11MouseExited

    private void lblMisCartas12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas12MouseEntered
        
        lblMisCartas12.setLocation(lblMisCartas12.getX(), 0);
    }//GEN-LAST:event_lblMisCartas12MouseEntered

    private void lblMisCartas12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas12MouseExited
        
        lblMisCartas12.setLocation(lblMisCartas12.getX(), 30);
    }//GEN-LAST:event_lblMisCartas12MouseExited

    private void lblMisCartas13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas13MouseEntered
        
        lblMisCartas13.setLocation(lblMisCartas13.getX(), 0);
    }//GEN-LAST:event_lblMisCartas13MouseEntered

    private void lblMisCartas13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas13MouseExited
        
        lblMisCartas13.setLocation(lblMisCartas13.getX(), 30);
    }//GEN-LAST:event_lblMisCartas13MouseExited

    private void lblMisCartas14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas14MouseEntered
        
        lblMisCartas14.setLocation(lblMisCartas14.getX(), 0);
    }//GEN-LAST:event_lblMisCartas14MouseEntered

    private void lblMisCartas14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas14MouseExited
        
        lblMisCartas14.setLocation(lblMisCartas14.getX(), 30);
    }//GEN-LAST:event_lblMisCartas14MouseExited

    private void lblMisCartas15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas15MouseEntered
        
        lblMisCartas15.setLocation(lblMisCartas15.getX(), 0);
    }//GEN-LAST:event_lblMisCartas15MouseEntered

    private void lblMisCartas15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas15MouseExited
        
        lblMisCartas15.setLocation(lblMisCartas15.getX(), 30);
    }//GEN-LAST:event_lblMisCartas15MouseExited

    private void lblMisCartas16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas16MouseEntered
        
        lblMisCartas16.setLocation(lblMisCartas16.getX(), 0);
    }//GEN-LAST:event_lblMisCartas16MouseEntered

    private void lblMisCartas16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas16MouseExited
        
        lblMisCartas16.setLocation(lblMisCartas16.getX(), 30);
    }//GEN-LAST:event_lblMisCartas16MouseExited

    private void lblMisCartas17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas17MouseEntered
        
        lblMisCartas17.setLocation(lblMisCartas17.getX(), 0);
    }//GEN-LAST:event_lblMisCartas17MouseEntered

    private void lblMisCartas17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas17MouseExited
        
        lblMisCartas17.setLocation(lblMisCartas17.getX(), 30);
    }//GEN-LAST:event_lblMisCartas17MouseExited

    private void lblMisCartas18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas18MouseEntered
        
        lblMisCartas18.setLocation(lblMisCartas18.getX(), 0);
    }//GEN-LAST:event_lblMisCartas18MouseEntered

    private void lblMisCartas18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas18MouseExited
        
        lblMisCartas18.setLocation(lblMisCartas18.getX(), 30);
    }//GEN-LAST:event_lblMisCartas18MouseExited

    private void lblMisCartas19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas19MouseEntered
        
        lblMisCartas19.setLocation(lblMisCartas19.getX(), 0);
    }//GEN-LAST:event_lblMisCartas19MouseEntered

    private void lblMisCartas19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas19MouseExited
       
        lblMisCartas19.setLocation(lblMisCartas19.getX(), 30);
    }//GEN-LAST:event_lblMisCartas19MouseExited

    private void lblMisCartas2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas2MouseEntered
        
        lblMisCartas2.setLocation(lblMisCartas2.getX(), 0);
    }//GEN-LAST:event_lblMisCartas2MouseEntered

    private void lblMisCartas2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas2MouseExited
        
        lblMisCartas2.setLocation(lblMisCartas2.getX(), 30);
    }//GEN-LAST:event_lblMisCartas2MouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        
        arylblMisCartas.add(lblMisCartas);
        arylblMisCartas.add(lblMisCartas1);
        arylblMisCartas.add(lblMisCartas2);
        arylblMisCartas.add(lblMisCartas3);
        arylblMisCartas.add(lblMisCartas4);
        arylblMisCartas.add(lblMisCartas5);
        arylblMisCartas.add(lblMisCartas6);
        arylblMisCartas.add(lblMisCartas7);
        arylblMisCartas.add(lblMisCartas8);
        arylblMisCartas.add(lblMisCartas9);
        arylblMisCartas.add(lblMisCartas10);
        arylblMisCartas.add(lblMisCartas11);
        arylblMisCartas.add(lblMisCartas12);
        arylblMisCartas.add(lblMisCartas13);
        arylblMisCartas.add(lblMisCartas14);
        arylblMisCartas.add(lblMisCartas15);
        arylblMisCartas.add(lblMisCartas16);
        arylblMisCartas.add(lblMisCartas17);
        arylblMisCartas.add(lblMisCartas18);
        arylblMisCartas.add(lblMisCartas19);
        
        arylblCartasJugador2.add(lblCartasJugador2n);
        arylblCartasJugador2.add(lblCartasJugador2n1);
        arylblCartasJugador2.add(lblCartasJugador2n2);
        arylblCartasJugador2.add(lblCartasJugador2n3);
        arylblCartasJugador2.add(lblCartasJugador2n4);
        arylblCartasJugador2.add(lblCartasJugador2n5);
        arylblCartasJugador2.add(lblCartasJugador2n6);
        arylblCartasJugador2.add(lblCartasJugador2n7);
        arylblCartasJugador2.add(lblCartasJugador2n8);
        arylblCartasJugador2.add(lblCartasJugador2n9);
        arylblCartasJugador2.add(lblCartasJugador2n10);
        arylblCartasJugador2.add(lblCartasJugador2n11);
        arylblCartasJugador2.add(lblCartasJugador2n12);
        arylblCartasJugador2.add(lblCartasJugador2n13);
        arylblCartasJugador2.add(lblCartasJugador2n14);
        arylblCartasJugador2.add(lblCartasJugador2n15);
        arylblCartasJugador2.add(lblCartasJugador2n16);
        arylblCartasJugador2.add(lblCartasJugador2n17);
        arylblCartasJugador2.add(lblCartasJugador2n18);
        arylblCartasJugador2.add(lblCartasJugador2n19);
        
        arylblCartasJugador3.add(lblCartasJugador3n);
        arylblCartasJugador3.add(lblCartasJugador3n1);
        arylblCartasJugador3.add(lblCartasJugador3n2);
        arylblCartasJugador3.add(lblCartasJugador3n3);
        arylblCartasJugador3.add(lblCartasJugador3n4);
        arylblCartasJugador3.add(lblCartasJugador3n5);
        arylblCartasJugador3.add(lblCartasJugador3n6);
        arylblCartasJugador3.add(lblCartasJugador3n7);
        arylblCartasJugador3.add(lblCartasJugador3n8);
        arylblCartasJugador3.add(lblCartasJugador3n9);
        arylblCartasJugador3.add(lblCartasJugador3n10);
        arylblCartasJugador3.add(lblCartasJugador3n11);
        arylblCartasJugador3.add(lblCartasJugador3n12);
        arylblCartasJugador3.add(lblCartasJugador3n13);
        arylblCartasJugador3.add(lblCartasJugador3n14);
        arylblCartasJugador3.add(lblCartasJugador3n15);
        arylblCartasJugador3.add(lblCartasJugador3n16);
        arylblCartasJugador3.add(lblCartasJugador3n17);
        arylblCartasJugador3.add(lblCartasJugador3n18);
        arylblCartasJugador3.add(lblCartasJugador3n19);
        
        arylblCartasJugador4.add(lblCartasJugador4n);
        arylblCartasJugador4.add(lblCartasJugador4n1);
        arylblCartasJugador4.add(lblCartasJugador4n2);
        arylblCartasJugador4.add(lblCartasJugador4n3);
        arylblCartasJugador4.add(lblCartasJugador4n4);
        arylblCartasJugador4.add(lblCartasJugador4n5);
        arylblCartasJugador4.add(lblCartasJugador4n6);
        arylblCartasJugador4.add(lblCartasJugador4n7);
        arylblCartasJugador4.add(lblCartasJugador4n8);
        arylblCartasJugador4.add(lblCartasJugador4n9);
        arylblCartasJugador4.add(lblCartasJugador4n10);
        arylblCartasJugador4.add(lblCartasJugador4n11);
        arylblCartasJugador4.add(lblCartasJugador4n12);
        arylblCartasJugador4.add(lblCartasJugador4n13);
        arylblCartasJugador4.add(lblCartasJugador4n14);
        arylblCartasJugador4.add(lblCartasJugador4n15);
        arylblCartasJugador4.add(lblCartasJugador4n16);
        arylblCartasJugador4.add(lblCartasJugador4n17);
        arylblCartasJugador4.add(lblCartasJugador4n18);
        arylblCartasJugador4.add(lblCartasJugador4n19);
        
        /*arylblMisCartas.stream().forEach((cartas) -> {
            cartas.setIcon(null);
        });*/
        
        /*arylblCartasJugador2.stream().forEach((cartas) -> {
            cartas.setIcon(null);
        });
        
        arylblCartasJugador3.stream().forEach((cartas) -> {
            cartas.setIcon(null);
            
        });
        
        arylblCartasJugador4.stream().forEach((cartas) -> {
            cartas.setIcon(null);
        });*//*
        btnMasoComer.setIcon(null);
        lblMaso.setIcon(ponerIcono("masoVacio"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) { }
        lblMaso.setIcon(ponerIcono("masoUna"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) { }
        lblMaso.setIcon(ponerIcono("masoDos"));*/
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/icono.png")));
        lblDescarte.setIcon(null);
        lblCartaActual.setIcon(null);
        
        //Creación del jugador al abrirse una ventana del UNO
        jugador = new Jugador("Apagada",this);
        try {
            jugador.conexion();
        } catch (IOException ex) {
            System.err.println("errror en jugador");
            Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnMasoComerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasoComerMouseClicked
       
           try {
               if (jugador.isJugadorActual())
                   this.jugador.salida.writeInt(5);
           } catch (IOException ex) {
               Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
           }
       
    }//GEN-LAST:event_btnMasoComerMouseClicked
//*****************************eventos cuando se da clic en una carta mia **********************************************
    private void lblMisCartasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartasMouseClicked
        //envento de seleccionar carta
        
        if (lblMisCartas.getIcon() != null && jugador.isJugadorActual()){//si es null se descarta porque no hay carta en ella
            if(this.jugador.getJuegoActivado()){
                System.out.println("Entró al evento");
                if(this.jugador.getJuegoMano() == false){
                    try {
                        this.jugador.salida.writeInt(2);
                        this.jugador.salida.writeInt(0);
                        this.jugador.setJuegoMaso(false);
                        this.jugador.salida.writeInt(4);
                    } catch (IOException ex) {
                        Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                }
            }
        }
        
        
    }//GEN-LAST:event_lblMisCartasMouseClicked

    private void lblMisCartas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas1MouseClicked
        //envento de seleccionar carta
        if (lblMisCartas1.getIcon() != null && jugador.isJugadorActual()){//si es null se descarta porque no hay carta en ella
          if(this.jugador.getJuegoActivado()){
                    try {
                        this.jugador.salida.writeInt(2);
                        this.jugador.salida.writeInt(1);
                        this.jugador.setJuegoMaso(false);
                    } catch (IOException ex) {
                        Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                
            }   
        }
    }//GEN-LAST:event_lblMisCartas1MouseClicked

    private void lblMisCartas3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas3MouseClicked
        //envento de seleccionar carta
        if (lblMisCartas3.getIcon() != null && jugador.isJugadorActual()){//si es null se descarta porque no hay carta en ella
            if(this.jugador.getJuegoActivado()){
                
                    try {
                        this.jugador.salida.writeInt(2);
                        this.jugador.salida.writeInt(3);
                        this.jugador.setJuegoMaso(false);
                    } catch (IOException ex) {
                        Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                
            }
        }
    }//GEN-LAST:event_lblMisCartas3MouseClicked

    private void lblMisCartas2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas2MouseClicked
        //envento de seleccionar carta
        if (lblMisCartas2.getIcon() != null && jugador.isJugadorActual()){//si es null se descarta porque no hay carta en ella
            if(this.jugador.getJuegoActivado()){
                
                    try {
                        this.jugador.salida.writeInt(2);
                        this.jugador.salida.writeInt(2);
                        this.jugador.setJuegoMaso(false);
                    } catch (IOException ex) {
                        Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                
            }
        }
    }//GEN-LAST:event_lblMisCartas2MouseClicked

    private void lblMisCartas4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas4MouseClicked
        //envento de seleccionar carta
        if (lblMisCartas4.getIcon() != null && jugador.isJugadorActual()){//si es null se descarta porque no hay carta en ella
            if(this.jugador.getJuegoActivado()){
                
                    try {
                        this.jugador.salida.writeInt(2);
                        this.jugador.salida.writeInt(4);
                        this.jugador.setJuegoMaso(false);
                    } catch (IOException ex) {
                        Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                
            }
        }
    }//GEN-LAST:event_lblMisCartas4MouseClicked

    private void lblMisCartas5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas5MouseClicked
        //envento de seleccionar carta
        if (lblMisCartas5.getIcon() != null && jugador.isJugadorActual()){//si es null se descarta porque no hay carta en ella
            if(this.jugador.getJuegoActivado()){
                
                    try {
                        this.jugador.salida.writeInt(2);
                        this.jugador.salida.writeInt(5);
                        this.jugador.setJuegoMaso(false);
                    } catch (IOException ex) {
                        Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                
            }
        }
    }//GEN-LAST:event_lblMisCartas5MouseClicked

    private void lblMisCartas6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas6MouseClicked
        //envento de seleccionar carta
        if (lblMisCartas6.getIcon() != null && jugador.isJugadorActual()){//si es null se descarta porque no hay carta en ella
            if(this.jugador.getJuegoActivado()){
                
                    try {
                        this.jugador.salida.writeInt(2);
                        this.jugador.salida.writeInt(6);
                        this.jugador.setJuegoMaso(false);
                    } catch (IOException ex) {
                        Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                
            }
        }
    }//GEN-LAST:event_lblMisCartas6MouseClicked

    private void lblMisCartas7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas7MouseClicked
        //envento de seleccionar carta
        if (lblMisCartas7.getIcon() != null && jugador.isJugadorActual()){//si es null se descarta porque no hay carta en ella
            if(this.jugador.getJuegoActivado()){
                
                    try {
                        this.jugador.salida.writeInt(2);
                        this.jugador.salida.writeInt(7);
                        this.jugador.setJuegoMaso(false);
                    } catch (IOException ex) {
                        Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                
            }
        }
    }//GEN-LAST:event_lblMisCartas7MouseClicked

    private void lblMisCartas8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas8MouseClicked
        //envento de seleccionar carta
        if (lblMisCartas8.getIcon() != null && jugador.isJugadorActual()){//si es null se descarta porque no hay carta en ella
            if(this.jugador.getJuegoActivado()){
                
                    try {
                        this.jugador.salida.writeInt(2);
                        this.jugador.salida.writeInt(8);
                        this.jugador.setJuegoMaso(false);
                    } catch (IOException ex) {
                        Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                
            }
        }
    }//GEN-LAST:event_lblMisCartas8MouseClicked

    private void lblMisCartas9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas9MouseClicked
        //envento de seleccionar carta
        if (lblMisCartas9.getIcon() != null && jugador.isJugadorActual()){//si es null se descarta porque no hay carta en ella
            if(this.jugador.getJuegoActivado()){
                
                    try {
                        this.jugador.salida.writeInt(2);
                        this.jugador.salida.writeInt(9);
                        this.jugador.setJuegoMaso(false);
                    } catch (IOException ex) {
                        Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                
            }
        }
    }//GEN-LAST:event_lblMisCartas9MouseClicked

    private void lblMisCartas10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas10MouseClicked
        //envento de seleccionar carta
        if (lblMisCartas10.getIcon() != null && jugador.isJugadorActual()){//si es null se descarta porque no hay carta en ella
            if(this.jugador.getJuegoActivado()){
                
                    try {
                        this.jugador.salida.writeInt(2);
                        this.jugador.salida.writeInt(10);
                        this.jugador.setJuegoMaso(false);
                    } catch (IOException ex) {
                        Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                
            }
        }
    }//GEN-LAST:event_lblMisCartas10MouseClicked

    private void lblMisCartas11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas11MouseClicked
        //envento de seleccionar carta
        if (lblMisCartas11.getIcon() != null && jugador.isJugadorActual()){//si es null se descarta porque no hay carta en ella
            if(this.jugador.getJuegoActivado()){
                
                    try {
                        this.jugador.salida.writeInt(2);
                        this.jugador.salida.writeInt(11);
                        this.jugador.setJuegoMaso(false);
                    } catch (IOException ex) {
                        Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                
            }
        }
    }//GEN-LAST:event_lblMisCartas11MouseClicked

    private void lblMisCartas12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas12MouseClicked
        //envento de seleccionar carta
        if (lblMisCartas12.getIcon() != null && jugador.isJugadorActual()){//si es null se descarta porque no hay carta en ella
            if(this.jugador.getJuegoActivado()){
                
                    try {
                        this.jugador.salida.writeInt(2);
                        this.jugador.salida.writeInt(12);
                        this.jugador.setJuegoMaso(false);
                    } catch (IOException ex) {
                        Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                
            }
        }
    }//GEN-LAST:event_lblMisCartas12MouseClicked

    private void lblMisCartas13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas13MouseClicked
        //envento de seleccionar carta
        if (lblMisCartas13.getIcon() != null && jugador.isJugadorActual()){//si es null se descarta porque no hay carta en ella
            if(this.jugador.getJuegoActivado()){
                
                    try {
                        this.jugador.salida.writeInt(2);
                        this.jugador.salida.writeInt(13);
                        this.jugador.setJuegoMaso(false);
                    } catch (IOException ex) {
                        Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                
            }
        }
    }//GEN-LAST:event_lblMisCartas13MouseClicked

    private void lblMisCartas14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas14MouseClicked
        //envento de seleccionar carta
        if (lblMisCartas14.getIcon() != null && jugador.isJugadorActual()){//si es null se descarta porque no hay carta en ella
            if(this.jugador.getJuegoActivado()){
                
                    try {
                        this.jugador.salida.writeInt(2);
                        this.jugador.salida.writeInt(14);
                        this.jugador.setJuegoMaso(false);
                    } catch (IOException ex) {
                        Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                
            }
        }
    }//GEN-LAST:event_lblMisCartas14MouseClicked

    private void lblMisCartas15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas15MouseClicked
        //envento de seleccionar carta
        if (lblMisCartas15.getIcon() != null && jugador.isJugadorActual()){//si es null se descarta porque no hay carta en ella
            if(this.jugador.getJuegoActivado()){
                
                    try {
                        this.jugador.salida.writeInt(2);
                        this.jugador.salida.writeInt(15);
                        this.jugador.setJuegoMaso(false);
                    } catch (IOException ex) {
                        Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                
            }
        }
    }//GEN-LAST:event_lblMisCartas15MouseClicked

    private void lblMisCartas16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas16MouseClicked
        //envento de seleccionar carta
        if (lblMisCartas16.getIcon() != null && jugador.isJugadorActual()){//si es null se descarta porque no hay carta en ella
            if(this.jugador.getJuegoActivado()){
                
                    try {
                        this.jugador.salida.writeInt(2);
                        this.jugador.salida.writeInt(16);
                        this.jugador.setJuegoMaso(false);
                    } catch (IOException ex) {
                        Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                
            }
        }
    }//GEN-LAST:event_lblMisCartas16MouseClicked

    private void lblMisCartas17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas17MouseClicked
        //envento de seleccionar carta
        if (lblMisCartas17.getIcon() != null && jugador.isJugadorActual()){//si es null se descarta porque no hay carta en ella
            if(this.jugador.getJuegoActivado()){
                
                    try {
                        this.jugador.salida.writeInt(2);
                        this.jugador.salida.writeInt(17);
                        this.jugador.setJuegoMaso(false);
                    } catch (IOException ex) {
                        Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
        }
    }//GEN-LAST:event_lblMisCartas17MouseClicked

    private void lblMisCartas18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas18MouseClicked
        //envento de seleccionar carta
        if (lblMisCartas18.getIcon() != null && jugador.isJugadorActual()){//si es null se descarta porque no hay carta en ella
            if(this.jugador.getJuegoActivado()){
                
                    try {
                        this.jugador.salida.writeInt(2);
                        this.jugador.salida.writeInt(18);
                        this.jugador.setJuegoMaso(false);
                    } catch (IOException ex) {
                        Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
        }
    }//GEN-LAST:event_lblMisCartas18MouseClicked

    private void lblMisCartas19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMisCartas19MouseClicked
        //envento de seleccionar carta
        if (lblMisCartas19.getIcon() != null && jugador.isJugadorActual()){//si es null se descarta porque no hay carta en ella
            if(this.jugador.getJuegoActivado()){
                
                    try {
                        this.jugador.salida.writeInt(2);
                        this.jugador.salida.writeInt(19);
                        this.jugador.setJuegoMaso(false);
                    } catch (IOException ex) {
                        Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
        }
    }//GEN-LAST:event_lblMisCartas19MouseClicked

   
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Mesa mesa = new Mesa();
                mesa.setLocationRelativeTo(null);
                mesa.setVisible(true);
            }
        });
    }
    
    public ImageIcon ponerIcono (String nombreImg){
        return new javax.swing.ImageIcon(getClass().getResource("/imagenes/" + nombreImg + ".png"));
    }
    
    public String obtenerDireccionIcono (String nombreImg){
        return getClass().getResource("/imagenes/" + nombreImg + ".png") + "";
    }
    
    public void actualizarJugador (int oponente, int cantidadCartas, int cantidadJugadores){
        if (cantidadJugadores == 2){
                for (JLabel cartasJugador: arylblCartasJugador2){
                    cartasJugador.setIcon(null);
                }
                for (int i = 0; i < cantidadCartas; i++){
                    arylblCartasJugador2.get(i).setIcon(ponerIcono("cartaJugador2"));
                }
        }
        else{
            if (oponente == 1){
                for (JLabel cartasJugador: arylblCartasJugador3){
                    cartasJugador.setIcon(null);
                }
                for (int i = 0; i < cantidadCartas; i++){
                    arylblCartasJugador3.get(i).setIcon(ponerIcono("cartaJugador3"));
                }
            }
            else if (oponente == 2){
                for (JLabel cartasJugador: arylblCartasJugador2){
                    cartasJugador.setIcon(null);
                }
                for (int i = 0; i < cantidadCartas; i++){
                    arylblCartasJugador2.get(i).setIcon(ponerIcono("cartaJugador2"));
                }
            }
            else if (oponente == 3){
                for (JLabel cartasJugador: arylblCartasJugador4){
                    cartasJugador.setIcon(null);
                }
                for (int i = 0; i < cantidadCartas; i++){
                    arylblCartasJugador4.get(i).setIcon(ponerIcono("cartaJugador4"));
                }
            }
            System.out.println("se actualizaron las cartas del jugador: " + oponente + " el cual posee: " + cantidadCartas + " cartas");
        }
    }
    
    public void actualizarTurno(int jugadorActual, String color, int cantidadJugadores){
        if (cantidadJugadores == 2){
            if (jugadorActual == 0){
                lblTurnoMio.setIcon(ponerIcono("btnLuzApagada"));
                lblTurnoMio.setIcon(ponerIcono("btnLuz"+color));
                lblTurnoJugador2.setIcon(ponerIcono("btnLuzApagada"));
            }
            else{
                lblTurnoJugador2.setIcon(ponerIcono("btnLuz"+color));
            }
        }
        else{
            if (jugadorActual == 0){
                lblTurnoMio.setIcon(ponerIcono("btnLuz"+color));
                lblTurnoJugador2.setIcon(ponerIcono("btnLuzApagada"));
                lblTurnoJugador3.setIcon(ponerIcono("btnLuzApagada"));
                lblTurnoJugador4.setIcon(ponerIcono("btnLuzApagada"));
            }
            else if (jugadorActual == 3){
                lblTurnoJugador4.setIcon(ponerIcono("btnLuz"+color));
                lblTurnoMio.setIcon(ponerIcono("btnLuzApagada"));
                lblTurnoJugador2.setIcon(ponerIcono("btnLuzApagada"));
                lblTurnoJugador3.setIcon(ponerIcono("btnLuzApagada"));
            }
            else if (jugadorActual == 1){
                lblTurnoJugador3.setIcon(ponerIcono("btnLuz"+color));
                lblTurnoMio.setIcon(ponerIcono("btnLuzApagada"));
                lblTurnoJugador2.setIcon(ponerIcono("btnLuzApagada"));
                lblTurnoJugador4.setIcon(ponerIcono("btnLuzApagada"));
            }
            else if (jugadorActual == 2){
                lblTurnoJugador2.setIcon(ponerIcono("btnLuz"+color));
                lblTurnoMio.setIcon(ponerIcono("btnLuzApagada"));
                lblTurnoJugador3.setIcon(ponerIcono("btnLuzApagada"));
                lblTurnoJugador4.setIcon(ponerIcono("btnLuzApagada"));
            }
        }
        
    }
    
    public void actualizarMisCartas(ArrayList<Carta> mano){
        
        for (JLabel Cartas: arylblMisCartas){
            Cartas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            Cartas.setIcon(null);
        }
        for (int i = 0; i < mano.size(); i++){
            arylblMisCartas.get(i).setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            arylblMisCartas.get(i).setIcon(mano.get(i).getImagen());
        }
    }
    
    public void actualizarCartaActual(Carta cartaActual){
        if (lblDescarte.getIcon() == null){
            lblCartaActual.setIcon(cartaActual.getImagen());
            lblDescarte.setIcon(ponerIcono("descarteVacio"));
        }
        else if (lblDescarte.getIcon().toString().equals(obtenerDireccionIcono("descarteVacio"))){
            lblDescarte.setIcon(ponerIcono("descarteDos"));
            lblCartaActual.setIcon(cartaActual.getImagen());
        }
        else{
            lblCartaActual.setIcon(cartaActual.getImagen());
        }
        
    }
    
    public void actualizarNombres(String nombre, int jugadorActual, int cantidadJugadores){
         if (cantidadJugadores == 2){
            if (jugadorActual == 0)
                lblMiNombre.setText(nombre);
            else
                lblNombre2.setText(nombre);
        }
        else{
            if (jugadorActual == 0)
                lblMiNombre.setText(nombre);
            else if (jugadorActual == 1)
                lblNombre3.setText(nombre);
            else if (jugadorActual == 2)
                lblNombre2.setText(nombre);
            else if (jugadorActual == 3)
                lblNombre4.setText(nombre);
         }
    }
    
    public void mandarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje, "Información", 1);
    }
    
    public void mandarMensajeError(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje, "Culo", 0);
    }

    public void actualizarJugadorActual(String jugador){
        labelJugador.setText(jugador);
        System.out.println(jugador);
        //actualizarTurno(1, this.jugador.getColorDelJugador());
        System.out.println("Termino de asignar");
    }
    
    public void EscogerColorComodin () throws IOException{
        String[] options = new String[] {"Rojo", "Amarillo", "Verde", "Azul"};
        int color = JOptionPane.showOptionDialog(null, "Escoja el nuevo color a jugar:", "Comodin",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        jugador.salida.writeInt(9);//solo reanuda el threadServidor
        jugador.salida.writeInt(3);
        switch (color){
            case 0:
                jugador.salida.writeUTF("Rojo");
                break;
            case 1:
                jugador.salida.writeUTF("Amarillo");
                break;
            case 2:
                jugador.salida.writeUTF("Verde");
                break;
            case 3:
                jugador.salida.writeUTF("Azul");
                break;
            default:
                break;
                
        }
    }
    
    public void mostrarRegistroDeEventos(String nombre, String mensaje, String color){
        Color fuente;
        if (color.equals("Roja"))
            fuente = Color.RED;
        else if (color.equals("Amarilla"))
            fuente = Color.ORANGE;
        else if (color.equals("Verde"))
            fuente = Color.GREEN;
        else if (color.equals("Azul"))
            fuente = Color.BLUE;
        else
            fuente = Color.CYAN;
        annadirAJPane(txpRegistroDeEventos, "\n" + nombre, fuente);
        annadirAJPane(txpRegistroDeEventos, mensaje, Color.BLACK);
    }
    
    private void annadirAJPane(JTextPane tp, String msg, Color color)
    {
        StyleContext sc = StyleContext.getDefaultStyleContext();
        javax.swing.text.AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, color);

        aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Kristen ITC");
        aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);
        int len = tp.getDocument().getLength();
        tp.setCaretPosition(len);
        tp.setCharacterAttributes(aset, false);
        tp.replaceSelection(msg);
    }
    
    public void iniciarPartida() {
        try {
            this.jugador.salida.writeInt(1);
        } catch (IOException ex) {
            Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Jugador getJugador(){
        return jugador;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnMasoComer;
    private javax.swing.JButton btnSalto;
    private javax.swing.JButton btnUNO;
    private javax.swing.JLabel labelJugador;
    private javax.swing.JLabel labelJugadores;
    private javax.swing.JLabel lblCartaActual;
    private javax.swing.JLabel lblCartasJugador2n;
    private javax.swing.JLabel lblCartasJugador2n1;
    private javax.swing.JLabel lblCartasJugador2n10;
    private javax.swing.JLabel lblCartasJugador2n11;
    private javax.swing.JLabel lblCartasJugador2n12;
    private javax.swing.JLabel lblCartasJugador2n13;
    private javax.swing.JLabel lblCartasJugador2n14;
    private javax.swing.JLabel lblCartasJugador2n15;
    private javax.swing.JLabel lblCartasJugador2n16;
    private javax.swing.JLabel lblCartasJugador2n17;
    private javax.swing.JLabel lblCartasJugador2n18;
    private javax.swing.JLabel lblCartasJugador2n19;
    private javax.swing.JLabel lblCartasJugador2n2;
    private javax.swing.JLabel lblCartasJugador2n3;
    private javax.swing.JLabel lblCartasJugador2n4;
    private javax.swing.JLabel lblCartasJugador2n5;
    private javax.swing.JLabel lblCartasJugador2n6;
    private javax.swing.JLabel lblCartasJugador2n7;
    private javax.swing.JLabel lblCartasJugador2n8;
    private javax.swing.JLabel lblCartasJugador2n9;
    private javax.swing.JLabel lblCartasJugador3n;
    private javax.swing.JLabel lblCartasJugador3n1;
    private javax.swing.JLabel lblCartasJugador3n10;
    private javax.swing.JLabel lblCartasJugador3n11;
    private javax.swing.JLabel lblCartasJugador3n12;
    private javax.swing.JLabel lblCartasJugador3n13;
    private javax.swing.JLabel lblCartasJugador3n14;
    private javax.swing.JLabel lblCartasJugador3n15;
    private javax.swing.JLabel lblCartasJugador3n16;
    private javax.swing.JLabel lblCartasJugador3n17;
    private javax.swing.JLabel lblCartasJugador3n18;
    private javax.swing.JLabel lblCartasJugador3n19;
    private javax.swing.JLabel lblCartasJugador3n2;
    private javax.swing.JLabel lblCartasJugador3n3;
    private javax.swing.JLabel lblCartasJugador3n4;
    private javax.swing.JLabel lblCartasJugador3n5;
    private javax.swing.JLabel lblCartasJugador3n6;
    private javax.swing.JLabel lblCartasJugador3n7;
    private javax.swing.JLabel lblCartasJugador3n8;
    private javax.swing.JLabel lblCartasJugador3n9;
    private javax.swing.JLabel lblCartasJugador4n;
    private javax.swing.JLabel lblCartasJugador4n1;
    private javax.swing.JLabel lblCartasJugador4n10;
    private javax.swing.JLabel lblCartasJugador4n11;
    private javax.swing.JLabel lblCartasJugador4n12;
    private javax.swing.JLabel lblCartasJugador4n13;
    private javax.swing.JLabel lblCartasJugador4n14;
    private javax.swing.JLabel lblCartasJugador4n15;
    private javax.swing.JLabel lblCartasJugador4n16;
    private javax.swing.JLabel lblCartasJugador4n17;
    private javax.swing.JLabel lblCartasJugador4n18;
    private javax.swing.JLabel lblCartasJugador4n19;
    private javax.swing.JLabel lblCartasJugador4n2;
    private javax.swing.JLabel lblCartasJugador4n3;
    private javax.swing.JLabel lblCartasJugador4n4;
    private javax.swing.JLabel lblCartasJugador4n5;
    private javax.swing.JLabel lblCartasJugador4n6;
    private javax.swing.JLabel lblCartasJugador4n7;
    private javax.swing.JLabel lblCartasJugador4n8;
    private javax.swing.JLabel lblCartasJugador4n9;
    private javax.swing.JLabel lblDescarte;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblFondoPrincipal;
    private javax.swing.JLabel lblMaso;
    private javax.swing.JLabel lblMiNombre;
    private javax.swing.JLabel lblMisCartas;
    private javax.swing.JLabel lblMisCartas1;
    private javax.swing.JLabel lblMisCartas10;
    private javax.swing.JLabel lblMisCartas11;
    private javax.swing.JLabel lblMisCartas12;
    private javax.swing.JLabel lblMisCartas13;
    private javax.swing.JLabel lblMisCartas14;
    private javax.swing.JLabel lblMisCartas15;
    private javax.swing.JLabel lblMisCartas16;
    private javax.swing.JLabel lblMisCartas17;
    private javax.swing.JLabel lblMisCartas18;
    private javax.swing.JLabel lblMisCartas19;
    private javax.swing.JLabel lblMisCartas2;
    private javax.swing.JLabel lblMisCartas3;
    private javax.swing.JLabel lblMisCartas4;
    private javax.swing.JLabel lblMisCartas5;
    private javax.swing.JLabel lblMisCartas6;
    private javax.swing.JLabel lblMisCartas7;
    private javax.swing.JLabel lblMisCartas8;
    private javax.swing.JLabel lblMisCartas9;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblNombre4;
    private javax.swing.JLabel lblTurnoJugador2;
    private javax.swing.JLabel lblTurnoJugador3;
    private javax.swing.JLabel lblTurnoJugador4;
    private javax.swing.JLabel lblTurnoMio;
    private javax.swing.JPanel pnlJugador;
    private javax.swing.JPanel pnlPartida;
    private javax.swing.JScrollPane srpRegistroDeEventos;
    private javax.swing.JTextPane txpRegistroDeEventos;
    // End of variables declaration//GEN-END:variables

}
