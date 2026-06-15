package Vistas;

public class VentanaUsuarios extends javax.swing.JFrame {

    private String usuarioUno;
    private String usuarioDos;

    public VentanaUsuarios(String usuarioUno, String usuarioDos) {
        this.usuarioUno = usuarioUno;
        this.usuarioDos = usuarioDos;
        
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaUsuario2 = new javax.swing.JLabel();
        etiquetaUsuario1 = new javax.swing.JLabel();
        etiquetaImagen = new javax.swing.JLabel();
        botonComenzar = new javax.swing.JButton();
        botonRetroceder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Presentación Jugadores");
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTitulo.setText(usuarioUno + " VS " + usuarioDos);
        panel.add(etiquetaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 240, -1));

        etiquetaUsuario2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiquetaUsuario2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaUsuario2.setText(usuarioDos + " con figura O");
        panel.add(etiquetaUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 240, -1));

        etiquetaUsuario1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiquetaUsuario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaUsuario1.setText(usuarioUno + " empieza con figura X");
        panel.add(etiquetaUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 240, -1));

        etiquetaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/3EnRaya.gif"))); // NOI18N
        panel.add(etiquetaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        botonComenzar.setBackground(new java.awt.Color(0, 0, 204));
        botonComenzar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonComenzar.setForeground(new java.awt.Color(255, 255, 255));
        botonComenzar.setText("Comenzar");
        botonComenzar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComenzarActionPerformed(evt);
            }
        });
        panel.add(botonComenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 40));

        botonRetroceder.setBackground(new java.awt.Color(255, 0, 0));
        botonRetroceder.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonRetroceder.setForeground(new java.awt.Color(255, 255, 255));
        botonRetroceder.setText("Retroceder");
        botonRetroceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRetrocederActionPerformed(evt);
            }
        });
        panel.add(botonRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComenzarActionPerformed
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(usuarioUno, usuarioDos);
        ventanaPrincipal.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_botonComenzarActionPerformed

    private void botonRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetrocederActionPerformed
        VentanaInicial ventanaInicial = new VentanaInicial();
        ventanaInicial.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_botonRetrocederActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(VentanaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaUsuarios(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonComenzar;
    private javax.swing.JButton botonRetroceder;
    private javax.swing.JLabel etiquetaImagen;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel etiquetaUsuario1;
    private javax.swing.JLabel etiquetaUsuario2;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
