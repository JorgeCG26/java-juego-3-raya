package Vistas;

import javax.swing.JOptionPane;

public class VentanaInicial extends javax.swing.JFrame {

    private String usuarioUno;
    private String usuarioDos;

    public VentanaInicial() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaUsuario1 = new javax.swing.JLabel();
        etiquetaUsuario2 = new javax.swing.JLabel();
        campoUsuario1 = new javax.swing.JTextField();
        campoUsuario2 = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("3 en Raya");

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setToolTipText("3 en Raya");

        etiquetaTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTitulo.setText("JUEGO 3 EN RAYA");

        etiquetaUsuario1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaUsuario1.setText("Nombre usuario 1:");

        etiquetaUsuario2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiquetaUsuario2.setText("Nombre usuario 2:");

        campoUsuario1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        campoUsuario2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        botonGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonGuardar.setText("GUARDAR JUGADORES");
        botonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiquetaTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(etiquetaUsuario2)
                        .addComponent(etiquetaUsuario1)
                        .addComponent(campoUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(etiquetaTitulo)
                .addGap(18, 18, 18)
                .addComponent(etiquetaUsuario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiquetaUsuario2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        usuarioUno = campoUsuario1.getText().trim();
        usuarioDos = campoUsuario2.getText().trim();

        if (usuarioUno.isEmpty() || usuarioDos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese bien los nombre de los jugadores", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            VentanaUsuarios ventanaUsuario = new VentanaUsuarios(usuarioUno, usuarioDos);
            ventanaUsuario.setVisible(true);

            dispose();
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField campoUsuario1;
    private javax.swing.JTextField campoUsuario2;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel etiquetaUsuario1;
    private javax.swing.JLabel etiquetaUsuario2;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
