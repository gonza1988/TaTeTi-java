
package ventanas;

import javax.swing.ImageIcon;
import javax.swing.JButton;


public class VentanaPrincipal extends javax.swing.JFrame {

    private boolean casilla[][] = new boolean [3][3];
    private int matriz[][] = new int[3][3];
    private String turno = "usuario1";
    
    
    public VentanaPrincipal() {
        initComponents();
        setSize(600,600);
        setLocationRelativeTo(null);
        
        llenarCasillas();
        llenarMatriz();
    }
    
    
    private void llenarCasillas() {
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                casilla[i][j] = true;
            }
        }
    }
    
    private void llenarMatriz() {
        
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = 0;
            }
        }
    }
    
    private void reiniciarTablero() {
        
        botonArribaIzquierda.setIcon(null);
        botonArribaCentro.setIcon(null);
        botonArribaDerecha.setIcon(null);
        botonCentroIzquierda.setIcon(null);
        botonCentroCentro.setIcon(null);
        botonCentroDerecha.setIcon(null);
        botonAbajoIzquierda.setIcon(null);
        botonAbajoCentro.setIcon(null);
        botonAbajoDerecha.setIcon(null);
    }
    
    private void dibujarX(JButton boton) {
        boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/cancelar.png")));
    }

    private void dibujarO(JButton boton) {
        boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/circulo.png")));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        botonArribaIzquierda = new javax.swing.JButton();
        botonArribaCentro = new javax.swing.JButton();
        botonArribaDerecha = new javax.swing.JButton();
        botonCentroIzquierda = new javax.swing.JButton();
        botonCentroCentro = new javax.swing.JButton();
        botonCentroDerecha = new javax.swing.JButton();
        botonAbajoIzquierda = new javax.swing.JButton();
        botonAbajoCentro = new javax.swing.JButton();
        botonAbajoDerecha = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuJuego = new javax.swing.JMenu();
        comenzarDeNuevo = new javax.swing.JMenuItem();
        mostrarResultados = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setLayout(new java.awt.GridLayout(3, 3));

        botonArribaIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaIzquierdaActionPerformed(evt);
            }
        });
        panel.add(botonArribaIzquierda);

        botonArribaCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaCentroActionPerformed(evt);
            }
        });
        panel.add(botonArribaCentro);

        botonArribaDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaDerechaActionPerformed(evt);
            }
        });
        panel.add(botonArribaDerecha);

        botonCentroIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCentroIzquierdaActionPerformed(evt);
            }
        });
        panel.add(botonCentroIzquierda);

        botonCentroCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCentroCentroActionPerformed(evt);
            }
        });
        panel.add(botonCentroCentro);

        botonCentroDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCentroDerechaActionPerformed(evt);
            }
        });
        panel.add(botonCentroDerecha);

        botonAbajoIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoIzquierdaActionPerformed(evt);
            }
        });
        panel.add(botonAbajoIzquierda);

        botonAbajoCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoCentroActionPerformed(evt);
            }
        });
        panel.add(botonAbajoCentro);

        botonAbajoDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoDerechaActionPerformed(evt);
            }
        });
        panel.add(botonAbajoDerecha);

        menuJuego.setText("Juego");
        menuJuego.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        comenzarDeNuevo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzarDeNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refresh_189687.png"))); // NOI18N
        comenzarDeNuevo.setText("Comenzar de nuevo");
        menuJuego.add(comenzarDeNuevo);

        mostrarResultados.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mostrarResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/10338408001667541945-24.png"))); // NOI18N
        mostrarResultados.setText("Mostrar tabla de resultados");
        menuJuego.add(mostrarResultados);
        menuJuego.add(jSeparator1);

        salir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/multiply_399274.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menuJuego.add(salir);

        barraMenu.add(menuJuego);

        menuAyuda.setText("Ayuda");
        menuAyuda.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
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

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void botonArribaIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaIzquierdaActionPerformed
        if(casilla[0][0] == true) { //verificando si aun no se ha dado click sobre el boton
            if(turno.equals("usuario1")) { //verificamos el turno
                dibujarX(botonArribaIzquierda);
                matriz[0][0] = 1;
                turno = "usuario2";
            }
            else { //turno usuario 2
                dibujarO(botonArribaIzquierda);
                matriz[0][0] = 2;
                turno = "usuario1";
            }
            
            casilla[0][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonArribaIzquierdaActionPerformed

    private void botonArribaCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaCentroActionPerformed
         if(casilla[0][1] == true) { //verificando si aun no se ha dado click sobre el boton
            if(turno.equals("usuario1")) { //verificamos el turno
                dibujarX(botonArribaCentro);
                matriz[0][1] = 1;
                turno = "usuario2";
            }
            else { //turno usuario 2
                dibujarO(botonArribaCentro);
                matriz[0][1] = 2;
                turno = "usuario1";
            }
            
            casilla[0][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonArribaCentroActionPerformed

    private void botonArribaDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaDerechaActionPerformed
         if(casilla[0][2] == true) { //verificando si aun no se ha dado click sobre el boton
            if(turno.equals("usuario1")) { //verificamos el turno
                dibujarX(botonArribaDerecha);
                matriz[0][2] = 1;
                turno = "usuario2";
            }
            else { //turno usuario 2
                dibujarO(botonArribaDerecha);
                matriz[0][2] = 2;
                turno = "usuario1";
            }
            
            casilla[0][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonArribaDerechaActionPerformed

    private void botonCentroIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCentroIzquierdaActionPerformed
         if(casilla[1][0] == true) { //verificando si aun no se ha dado click sobre el boton
            if(turno.equals("usuario1")) { //verificamos el turno
                dibujarX(botonCentroIzquierda);
                matriz[1][0] = 1;
                turno = "usuario2";
            }
            else { //turno usuario 2
                dibujarO(botonCentroIzquierda);
                matriz[1][0] = 2;
                turno = "usuario1";
            }
            
            casilla[1][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonCentroIzquierdaActionPerformed

    private void botonCentroCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCentroCentroActionPerformed
         if(casilla[1][1] == true) { //verificando si aun no se ha dado click sobre el boton
            if(turno.equals("usuario1")) { //verificamos el turno
                dibujarX(botonCentroCentro);
                matriz[1][1] = 1;
                turno = "usuario2";
            }
            else { //turno usuario 2
                dibujarO(botonCentroCentro);
                matriz[1][1] = 2;
                turno = "usuario1";
            }
            
            casilla[1][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonCentroCentroActionPerformed

    private void botonCentroDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCentroDerechaActionPerformed
         if(casilla[1][2] == true) { //verificando si aun no se ha dado click sobre el boton
            if(turno.equals("usuario1")) { //verificamos el turno
                dibujarX(botonCentroDerecha);
                matriz[1][2] = 1;
                turno = "usuario2";
            }
            else { //turno usuario 2
                dibujarO(botonCentroDerecha);
                matriz[1][2] = 2;
                turno = "usuario1";
            }
            
            casilla[1][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonCentroDerechaActionPerformed

    private void botonAbajoIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoIzquierdaActionPerformed
         if(casilla[2][0] == true) { //verificando si aun no se ha dado click sobre el boton
            if(turno.equals("usuario1")) { //verificamos el turno
                dibujarX(botonAbajoIzquierda);
                matriz[2][0] = 1;
                turno = "usuario2";
            }
            else { //turno usuario 2
                dibujarO(botonAbajoIzquierda);
                matriz[2][0] = 2;
                turno = "usuario1";
            }
            
            casilla[2][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonAbajoIzquierdaActionPerformed

    private void botonAbajoCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoCentroActionPerformed
         if(casilla[2][1] == true) { //verificando si aun no se ha dado click sobre el boton
            if(turno.equals("usuario1")) { //verificamos el turno
                dibujarX(botonAbajoCentro);
                matriz[2][1] = 1;
                turno = "usuario2";
            }
            else { //turno usuario 2
                dibujarO(botonAbajoCentro);
                matriz[2][1] = 2;
                turno = "usuario1";
            }
            
            casilla[2][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonAbajoCentroActionPerformed

    private void botonAbajoDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoDerechaActionPerformed
         if(casilla[2][2] == true) { //verificando si aun no se ha dado click sobre el boton
            if(turno.equals("usuario1")) { //verificamos el turno
                dibujarX(botonAbajoDerecha);
                matriz[2][2] = 1;
                turno = "usuario2";
            }
            else { //turno usuario 2
                dibujarO(botonAbajoDerecha);
                matriz[2][2] = 2;
                turno = "usuario1";
            }
            
            casilla[2][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonAbajoDerechaActionPerformed

    
    private void comprobarGanador() {
        boolean ganador1 = false;
        boolean ganador2 = false;
        
        //comprobamos si el ganador es el jugador 1
        ganador1 = comprobar(1);
        //comprobamos si el ganador es el jugador 2
        ganador2 = comprobar(2);
        
        if(ganador1 == true) {
            System.out.println("El ganador es el usuario 1");
            reiniciarJuego();
        }
        else if(ganador2 == true) {
            System.out.println("El ganador es el usuario 2");
            reiniciarJuego();
        }
    }
    
     private boolean comprobar(int num) {
         boolean ganador = false;
         
         //filas
         if(matriz[0][0] == num && matriz[0][1] == num && matriz[0][2] == num) {
             ganador = true;
         }
         else if(matriz[1][0] == num && matriz[1][1] == num && matriz[1][2] == num) {
             ganador = true;
         }
         else if(matriz[2][0] == num && matriz[2][1] == num && matriz[2][2] == num) {
             ganador = true;
         }
         //columnas
         else if(matriz[0][0] == num && matriz[1][0] == num && matriz[2][0] == num) {
             ganador = true;
         }
         else if(matriz[0][1] == num && matriz[1][1] == num && matriz[2][1] == num) {
             ganador = true;
         }
         else if(matriz[0][2] == num && matriz[1][2] == num && matriz[2][2] == num) {
             ganador = true;
         }
         //diagonales
         else if(matriz[0][0] == num && matriz[1][1] == num && matriz[2][2] == num) {
             ganador = true;
         }
         else if(matriz[0][2] == num && matriz[1][1] == num && matriz[2][0] == num) {
             ganador = true;
         }
         
         return ganador;
     }
    
     private void reiniciarJuego() {
         llenarCasillas();
         llenarMatriz();
         reiniciarTablero();
         
     }

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
    private javax.swing.JButton botonAbajoCentro;
    private javax.swing.JButton botonAbajoDerecha;
    private javax.swing.JButton botonAbajoIzquierda;
    private javax.swing.JButton botonArribaCentro;
    private javax.swing.JButton botonArribaDerecha;
    private javax.swing.JButton botonArribaIzquierda;
    private javax.swing.JButton botonCentroCentro;
    private javax.swing.JButton botonCentroDerecha;
    private javax.swing.JButton botonCentroIzquierda;
    private javax.swing.JMenuItem comenzarDeNuevo;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuJuego;
    private javax.swing.JMenuItem mostrarResultados;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
