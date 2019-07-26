package Servidor;

//***********************************************
//********************no se usa *****************
//***********************************************


public class VentanaServidor extends javax.swing.JFrame {
    private ServidorUno servidor;
    int cantJugadores;
    
    
    public VentanaServidor() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoServidor = new java.awt.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textoServidor, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textoServidor, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaServidor().setVisible(true);
                
            }
        });
    }
    
    public void mostrarEnVentana(String texto){
        textoServidor.append(texto + "\n");
    }
    
    public void comenzarServidor(){
        //servidor = new ServidorUno(this, cantJugadores);
        //servidor.start();
        //servidor.comenzarServidor();
    }
    
    public void setCantJugadores(int cantJugadores){
        this.cantJugadores = cantJugadores;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextArea textoServidor;
    // End of variables declaration//GEN-END:variables
}
