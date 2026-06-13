package Vistas;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class VentanaPrincipal extends javax.swing.JFrame {

    private boolean casilla[][] = new boolean[3][3];
    private int matriz[][] = new int[3][3];

    private String turno = "usuario1";

    public VentanaPrincipal() {
        initComponents();
        setSize(600, 600);
        setLocationRelativeTo(null);
        iniciarCasillas();
        iniciarMatriz();
    }

    private void dibujarFiguraX(JButton boton) {
        boton.setIcon(new ImageIcon(getClass().getResource("/Imagenes/x.png")));
    }

    private void dibujarFiguraO(JButton boton) {
        boton.setIcon(new ImageIcon(getClass().getResource("/Imagenes/o.png")));
    }

    // Inicializar toda mis casillas del tablero en TRUE
    private void iniciarCasillas() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                casilla[i][j] = true;
            }
        }
    }

    // Inicializa la matriz de juego con valores vacíos
    private void iniciarMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = 0;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        botonArribaIzquierda = new javax.swing.JButton();
        botonArriba = new javax.swing.JButton();
        botonArribaDerecha = new javax.swing.JButton();
        botonIzquierda = new javax.swing.JButton();
        botonCentro = new javax.swing.JButton();
        botonDerecha = new javax.swing.JButton();
        botonAbajoIzquierda = new javax.swing.JButton();
        botonAbajo = new javax.swing.JButton();
        botonAbajoDerecha = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuJuego = new javax.swing.JMenu();
        menuReiniciarPartida = new javax.swing.JMenuItem();
        menuResultados = new javax.swing.JMenuItem();
        separador = new javax.swing.JPopupMenu.Separator();
        menuSalir = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("3 en Raya");
        setResizable(false);

        panel.setLayout(new java.awt.GridLayout(3, 3));

        botonArribaIzquierda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonArribaIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaIzquierdaActionPerformed(evt);
            }
        });
        panel.add(botonArribaIzquierda);

        botonArriba.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaActionPerformed(evt);
            }
        });
        panel.add(botonArriba);

        botonArribaDerecha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonArribaDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaDerechaActionPerformed(evt);
            }
        });
        panel.add(botonArribaDerecha);

        botonIzquierda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIzquierdaActionPerformed(evt);
            }
        });
        panel.add(botonIzquierda);

        botonCentro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCentroActionPerformed(evt);
            }
        });
        panel.add(botonCentro);

        botonDerecha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDerechaActionPerformed(evt);
            }
        });
        panel.add(botonDerecha);

        botonAbajoIzquierda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonAbajoIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoIzquierdaActionPerformed(evt);
            }
        });
        panel.add(botonAbajoIzquierda);

        botonAbajo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoActionPerformed(evt);
            }
        });
        panel.add(botonAbajo);

        botonAbajoDerecha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonAbajoDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoDerechaActionPerformed(evt);
            }
        });
        panel.add(botonAbajoDerecha);

        barraMenu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        menuJuego.setText("Juego");
        menuJuego.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuJuego.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        menuReiniciarPartida.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        menuReiniciarPartida.setText("Reiniciar partida");
        menuReiniciarPartida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuReiniciarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReiniciarPartidaActionPerformed(evt);
            }
        });
        menuJuego.add(menuReiniciarPartida);

        menuResultados.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        menuResultados.setText("Mostrar resultados");
        menuResultados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuResultadosActionPerformed(evt);
            }
        });
        menuJuego.add(menuResultados);
        menuJuego.add(separador);

        menuSalir.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        menuSalir.setText("Salir");
        menuSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        menuJuego.add(menuSalir);

        barraMenu.add(menuJuego);

        menuAyuda.setText("Ayuda");
        menuAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuAyuda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        barraMenu.add(menuAyuda);

        setJMenuBar(barraMenu);

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

    private void menuReiniciarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReiniciarPartidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuReiniciarPartidaActionPerformed

    private void menuResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuResultadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuResultadosActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSalirActionPerformed

    private void botonArribaIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaIzquierdaActionPerformed
        // Verifica que la casilla no haya sido utilizada previamente
        if (casilla[0][0] == true) {
            // Coloca la ficha del jugador actual y cambia el turno
            if (turno.equals("usuario1")) {
                dibujarFiguraX(botonArribaIzquierda);
                turno = "usuario2";

                // Guarda la jugada del jugador X
                matriz[0][0] = 1;
            } else {
                dibujarFiguraO(botonArribaIzquierda);
                turno = "usuario1";

                // Guarda la jugada del jugador O
                matriz[0][0] = 2;
            }

            // Marca la casilla como ocupada para impedir modificaciones
            casilla[0][0] = false;
        }
    }//GEN-LAST:event_botonArribaIzquierdaActionPerformed

    private void botonArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaActionPerformed
        if (casilla[0][1] == true) {
            if (turno.equals("usuario1")) {
                dibujarFiguraX(botonArriba);
                turno = "usuario2";
                matriz[0][1] = 1;
            } else {
                dibujarFiguraO(botonArriba);
                turno = "usuario1";
                matriz[0][1] = 2;
            }

            casilla[0][1] = false;
        }
    }//GEN-LAST:event_botonArribaActionPerformed

    private void botonArribaDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaDerechaActionPerformed
        if (casilla[0][2] == true) {
            if (turno.equals("usuario1")) {
                dibujarFiguraX(botonArribaDerecha);
                turno = "usuario2";
                matriz[0][2] = 1;
            } else {
                dibujarFiguraO(botonArribaDerecha);
                turno = "usuario1";
                matriz[0][2] = 2;
            }

            casilla[0][2] = false;
        }
    }//GEN-LAST:event_botonArribaDerechaActionPerformed

    private void botonIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIzquierdaActionPerformed
        if (casilla[1][0] == true) {
            if (turno.equals("usuario1")) {
                dibujarFiguraX(botonIzquierda);
                turno = "usuario2";
                matriz[1][0] = 1;
            } else {
                dibujarFiguraO(botonIzquierda);
                turno = "usuario1";
                matriz[1][0] = 2;
            }

            casilla[1][0] = false;
        }
    }//GEN-LAST:event_botonIzquierdaActionPerformed

    private void botonCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCentroActionPerformed
        if (casilla[1][1] == true) {
            if (turno.equals("usuario1")) {
                dibujarFiguraX(botonCentro);
                turno = "usuario2";
                matriz[1][1] = 1;
            } else {
                dibujarFiguraO(botonCentro);
                turno = "usuario1";
                matriz[1][1] = 2;
            }

            casilla[1][1] = false;
        }
    }//GEN-LAST:event_botonCentroActionPerformed

    private void botonDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDerechaActionPerformed
        if (casilla[1][2] == true) {
            if (turno.equals("usuario1")) {
                dibujarFiguraX(botonDerecha);
                turno = "usuario2";
                matriz[1][2] = 1;
            } else {
                dibujarFiguraO(botonDerecha);
                turno = "usuario1";
                matriz[1][2] = 2;
            }

            casilla[1][2] = false;
        }
    }//GEN-LAST:event_botonDerechaActionPerformed

    private void botonAbajoIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoIzquierdaActionPerformed
        if (casilla[2][0] == true) {
            if (turno.equals("usuario1")) {
                dibujarFiguraX(botonAbajoIzquierda);
                turno = "usuario2";
                matriz[2][0] = 1;
            } else {
                dibujarFiguraO(botonAbajoIzquierda);
                turno = "usuario1";
                matriz[2][0] = 2;
            }

            casilla[2][0] = false;
        }
    }//GEN-LAST:event_botonAbajoIzquierdaActionPerformed

    private void botonAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoActionPerformed
        if (casilla[2][1] == true) {
            if (turno.equals("usuario1")) {
                dibujarFiguraX(botonAbajo);
                turno = "usuario2";
                matriz[2][1] = 1;
            } else {
                dibujarFiguraO(botonAbajo);
                turno = "usuario1";
                matriz[2][1] = 2;
            }

            casilla[2][1] = false;
        }
    }//GEN-LAST:event_botonAbajoActionPerformed

    private void botonAbajoDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoDerechaActionPerformed
        if (casilla[2][2] == true) {
            if (turno.equals("usuario1")) {
                dibujarFiguraX(botonAbajoDerecha);
                turno = "usuario2";
                matriz[2][2] = 1;
            } else {
                dibujarFiguraO(botonAbajoDerecha);
                turno = "usuario1";
                matriz[2][2] = 2;
            }

            casilla[2][2] = false;
        }
    }//GEN-LAST:event_botonAbajoDerechaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton botonAbajo;
    private javax.swing.JButton botonAbajoDerecha;
    private javax.swing.JButton botonAbajoIzquierda;
    private javax.swing.JButton botonArriba;
    private javax.swing.JButton botonArribaDerecha;
    private javax.swing.JButton botonArribaIzquierda;
    private javax.swing.JButton botonCentro;
    private javax.swing.JButton botonDerecha;
    private javax.swing.JButton botonIzquierda;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuJuego;
    private javax.swing.JMenuItem menuReiniciarPartida;
    private javax.swing.JMenuItem menuResultados;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JPanel panel;
    private javax.swing.JPopupMenu.Separator separador;
    // End of variables declaration//GEN-END:variables
}
