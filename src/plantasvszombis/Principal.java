/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantasvszombis;

import javax.swing.JOptionPane;

/**
 *
 * @author Gamusa
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
     ListaJugadores lista = new ListaJugadores();
     CargarPlantas c = new CargarPlantas();
    public Principal() {
        initComponents();
      
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnjugadorplanta = new javax.swing.JButton();
        btnjugadorzombi = new javax.swing.JButton();
        btniniciarjuego = new javax.swing.JButton();
        btneliminardatos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Plantas vrs Zombis");
        setName("Plantas vrs Zombis"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnjugadorplanta.setBackground(new java.awt.Color(0, 0, 0));
        btnjugadorplanta.setForeground(new java.awt.Color(255, 255, 255));
        btnjugadorplanta.setText("Jugador Plantas");
        btnjugadorplanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjugadorplantaActionPerformed(evt);
            }
        });
        getContentPane().add(btnjugadorplanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 127, -1, -1));

        btnjugadorzombi.setBackground(new java.awt.Color(0, 0, 0));
        btnjugadorzombi.setText("Jugador Zombis");
        btnjugadorzombi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjugadorzombiActionPerformed(evt);
            }
        });
        getContentPane().add(btnjugadorzombi, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 170, -1, -1));

        btniniciarjuego.setBackground(new java.awt.Color(0, 0, 0));
        btniniciarjuego.setText("Comenzar Juego");
        btniniciarjuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarjuegoActionPerformed(evt);
            }
        });
        getContentPane().add(btniniciarjuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 213, -1, -1));

        btneliminardatos.setBackground(new java.awt.Color(0, 0, 0));
        btneliminardatos.setText("Eliminar datos");
        getContentPane().add(btneliminardatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 213, -1, -1));

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Plantas vrs Zombis");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 263, 22));

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 264, 76, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnjugadorplantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjugadorplantaActionPerformed
        JugadorPlanta plantas = new JugadorPlanta();
        plantas.setVisible(true);
        plantas.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnjugadorplantaActionPerformed

    private void btnjugadorzombiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjugadorzombiActionPerformed
      
        JugadorZombis jugadorzombis = new JugadorZombis();
        
        jugadorzombis.setVisible(true);
        jugadorzombis.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_btnjugadorzombiActionPerformed

    private void btniniciarjuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarjuegoActionPerformed
       
          if(lista.retornornodosplanta()== null && lista.retornanodos() == null){
        
              JOptionPane.showMessageDialog(null,"debe ingresar los usuarios");
          }
        else if(lista.retornornodosplanta().length()!= 0 && lista.retornanodos().length() != 0){
        
        //CargarPlantas cp = new CargarPlantas();
        c.setVisible(true);
        c.setLocationRelativeTo(null);
        
        this.dispose();
        }
        else
            JOptionPane.showMessageDialog(null,"dotro");
        
    }//GEN-LAST:event_btniniciarjuegoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btneliminardatos;
    private javax.swing.JButton btniniciarjuego;
    private javax.swing.JButton btnjugadorplanta;
    private javax.swing.JButton btnjugadorzombi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
