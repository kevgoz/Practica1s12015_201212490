
package plantasvszombis;



public class JugadorZombis extends javax.swing.JFrame {

   
       //Usuarios jugador_planta = new Usuarios();
       ListaJugadores jugadorplanta = new ListaJugadores();
       Graficas g = new Graficas();
       
    static String jugador2;
    
    public JugadorZombis() {
        initComponents();
        
        //ta.setVisible(false);
      
       lblotro.setVisible(false);
       txtotro.setVisible(false);
       btnaddnewcampos.setVisible(false);
       txtotro2.setVisible(false);
    }
    
    
    
    public void agregarElementos(){
        String otro = "otro";
        int cant = Integer.parseInt(txtcantidad.getText());
        Usuarios2 c=new Usuarios2(txtnombre.getText(),txtcantidad.getText());
        jugadorplanta.insertarzombi(c);
      
        
      
    }
    
     public void agregarElementosnuevo(){
        String otro = "otro";
        int cant = Integer.parseInt(txtcantidad.getText());
        String a="";
        Usuarios2 c=new Usuarios2(txtotro.getText(),txtotro2.getText());
        jugadorplanta.insertaFinzombi(c);
       
        
    }
    
     public void limpiar(){
        txtcantidad.setText(null);
        txtnombre.setText(null);
      
    }
     
//      public void listasElementos(){
//        ta.setText(jugadorplanta.presentar());   
//        
//    }
      
       public void listasElementoszombi(){
      //  ta.setText(jugadorplanta.presentarzombi());   
        
    }


      
       public void buscarElementos(){
      
           int indice =0;
        //a.buscarNodoIndice(resp).dato
        Object ob  =  jugadorplanta.buscarNodoIndice(indice).getDato();
         // JOptionPane.showMessageDialog(null,jugadorplanta.buscarNodoIndice(indice).datos);
           System.out.println(jugadorplanta.buscarNodoIndice(indice).getDato());
           
           jugador2 = ob.toString();
           
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblotro = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        txtotro = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnaddnewcampos = new javax.swing.JButton();
        btnaddcampos = new javax.swing.JButton();
        btnmenu = new javax.swing.JButton();
        txtotro2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ZOMBI");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 130, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cantidad:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        lblotro.setForeground(new java.awt.Color(0, 0, 0));
        lblotro.setText("Otro:");
        getContentPane().add(lblotro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 20));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 130, -1));

        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidadKeyTyped(evt);
            }
        });
        getContentPane().add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 128, -1));
        getContentPane().add(txtotro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 128, -1));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        btnaddnewcampos.setText("Agregar");
        btnaddnewcampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddnewcamposActionPerformed(evt);
            }
        });
        getContentPane().add(btnaddnewcampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        btnaddcampos.setText("Agregar campos");
        btnaddcampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddcamposActionPerformed(evt);
            }
        });
        getContentPane().add(btnaddcampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        btnmenu.setText("Menu");
        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 97, 30));
        getContentPane().add(txtotro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 128, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zombi.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 401, 354));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
       Principal p = new Principal();
       
       p.setVisible(true);
       p.setLocationRelativeTo(null);
       this.dispose();
       
       jugadorplanta.retornanodos();
       jugadorplanta.generararchivo1();
       jugadorplanta.generarimagen1();
       
      
       
       
    }//GEN-LAST:event_btnmenuActionPerformed

    private void btnaddcamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddcamposActionPerformed
        lblotro.setVisible(true);
        txtotro.setVisible(true);
//        ta.setVisible(true);
        btnaddnewcampos.setVisible(true);
        
        txtotro2.setVisible(true);
        
        
       
    }//GEN-LAST:event_btnaddcamposActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       agregarElementos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnaddnewcamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddnewcamposActionPerformed
        agregarElementosnuevo();
    }//GEN-LAST:event_btnaddnewcamposActionPerformed

    private void txtcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyTyped
        // TODO add your handling code here:
         char car = evt.getKeyChar();
        if((car<'0' || car>'9')) evt.consume();
        
    }//GEN-LAST:event_txtcantidadKeyTyped

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
            java.util.logging.Logger.getLogger(JugadorZombis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JugadorZombis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JugadorZombis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JugadorZombis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JugadorZombis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddcampos;
    private javax.swing.JButton btnaddnewcampos;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblotro;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtotro;
    private javax.swing.JTextField txtotro2;
    // End of variables declaration//GEN-END:variables
}
