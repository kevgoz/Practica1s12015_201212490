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
public class JugadorPlanta extends javax.swing.JFrame {

    /**
     * Creates new form JugadorPlanta
     */
    
       Usuarios jugador_planta = new Usuarios();
       ListaJugadores jugadorplanta = new ListaJugadores();
      // Usuarios jugador_planta1 = new Usuarios();
       
       static String jugador1;
       
        public JugadorPlanta() {
        initComponents();
        
      
      
       lblotro.setVisible(false);
       txtotro.setVisible(false);
       btnagregar.setVisible(false);
       jTextField1.setVisible(false);
        
    }
    
    
    public void agregarElementos(){
        String otro = "otro";
        int cant = Integer.parseInt(txtcantidad.getText());
        Usuarios c=new Usuarios(txtjugador.getText(),txtcantidad.getText());
        jugadorplanta.insertar(c);
       
        
    }
    
     public void agregarElementosnuevo(){
        
        int cant = Integer.parseInt(txtcantidad.getText());
        String a="";
        Usuarios c=new Usuarios(txtotro.getText(),jTextField1.getText());
        jugadorplanta.insertaFin(c);
       
        
    }
    
     public void limpiar(){
        txtcantidad.setText(null);
        txtjugador.setText(null);
      
    }
     
      public void listasElementos(){
     //   ta.setText(jugadorplanta.presentar());   
        
    }
      
       public void buscarElementos(){
      
           int indice =0;
        //a.buscarNodoIndice(resp).dato
           Object ob = jugadorplanta.buscarNodoIndice(indice).getDato();
          //JOptionPane.showMessageDialog(null,jugadorplanta.buscarNodoIndice(indice).datos);
           System.out.println(jugadorplanta.buscarNodoIndice(indice).getDato());
           
          jugador1 = ob.toString();
           
           
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtjugador = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnmenu = new javax.swing.JButton();
        btnaddcampos = new javax.swing.JButton();
        txtotro = new javax.swing.JTextField();
        lblotro = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnagregar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtjugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, -1));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cantidad");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidadKeyTyped(evt);
            }
        });
        getContentPane().add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 103, -1));

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        btnmenu.setText("Menu");
        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 84, -1));

        btnaddcampos.setText("Agregar Campos");
        btnaddcampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddcamposActionPerformed(evt);
            }
        });
        getContentPane().add(btnaddcampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 110, -1));
        getContentPane().add(txtotro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 103, -1));

        lblotro.setForeground(new java.awt.Color(0, 0, 0));
        lblotro.setText("Otro:");
        getContentPane().add(lblotro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("PLANTAS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 150, -1));

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 103, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plantas.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 344));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
      
       agregarElementos();
      //  jugador_planta1.nuevodato(txtcantidad.toString());
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        Principal prc = new Principal();
        prc.setVisible(true);
        prc.setLocationRelativeTo(null);
        this.dispose();
        
        jugadorplanta.retornornodosplanta();
       // jugadorplanta.retornanodos();
        //jugadorplanta.generararchivo1();
       // jugadorplanta.generarimagen1();
       // jugadorplanta.generarimagen2();
        
        
        
    }//GEN-LAST:event_btnmenuActionPerformed

    private void btnaddcamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddcamposActionPerformed
        
        txtotro.setVisible(true);
        lblotro.setVisible(true);
        btnagregar.setVisible(true);
        jTextField1.setVisible(true);
        txtotro.setText("");
        jTextField1.setText("");
        
    }//GEN-LAST:event_btnaddcamposActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
       
        agregarElementosnuevo();
        
      
        
        
        
        
    }//GEN-LAST:event_btnagregarActionPerformed

    private void txtcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyTyped
       
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
            java.util.logging.Logger.getLogger(JugadorPlanta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JugadorPlanta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JugadorPlanta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JugadorPlanta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JugadorPlanta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddcampos;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblotro;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtjugador;
    private javax.swing.JTextField txtotro;
    // End of variables declaration//GEN-END:variables
}
