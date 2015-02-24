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
        
       ta.setVisible(false);
      
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
        ta.setText(jugadorplanta.presentar());   
        
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
        btnver = new javax.swing.JButton();
        btnmenu = new javax.swing.JButton();
        btnaddcampos = new javax.swing.JButton();
        txtotro = new javax.swing.JTextField();
        lblotro = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        btnagregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Cantidad");

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnver.setText("Ver");
        btnver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverActionPerformed(evt);
            }
        });

        btnmenu.setText("Menu");
        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
            }
        });

        btnaddcampos.setText("Agregar Campos");
        btnaddcampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddcamposActionPerformed(evt);
            }
        });

        lblotro.setText("Otro:");

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        jLabel3.setText("PLANTAS");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtjugador, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(lblotro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtotro)
                                    .addComponent(txtcantidad))))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnagregar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(jButton1))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnaddcampos)
                        .addGap(174, 174, 174)
                        .addComponent(btnmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtjugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(btnguardar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnver)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtotro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblotro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnagregar)
                                .addGap(33, 33, 33)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnmenu)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnaddcampos)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
      
       agregarElementos();
      //  jugador_planta1.nuevodato(txtcantidad.toString());
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverActionPerformed
     
       ta.setVisible(true);
     
        listasElementos();
        buscarElementos();
        
        jugadorplanta.generar();
        
        try {

        //path del dot.exe,por lo general es la misma, pero depende de donde hayas instalado el paquete de Graphviz

       
        String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";

        //path del archivo creado con el codigo del graphviz que queremos

        String fileInputPath = "C:\\Users\\Gamusa\\Desktop\\archivo.txt";

        //path de salida del grafo, es decir el path de la imagen que vamos a crear con graphviz

        String fileOutputPath = "C:\\Users\\Gamusa\\Desktop\\imagenprueba1.jpg";

        //tipo de imagen de salida, en este caso es jpg

        String tParam = "-Tjpg";

        String tOParam = "-o";

        //concatenamos nuestras direcciones. Lo que hice es crear un vector, para poder editar las direcciones de entrada y salida, usando las variables antes inicializadas

        //recordemos el comando en la consola de windows: C:\Archivos de programa\Graphviz 2.21\bin\dot.exe -Tjpg grafo1.txt -o grafo1.jpg Esto es lo que concatenamos en el vector siguiente:

        String[] cmd = new String[5];
        cmd[0] = dotPath;
        cmd[1] = tParam;
        cmd[2] = fileInputPath;
        cmd[3] = tOParam;
        cmd[4] = fileOutputPath;

        //Invocamos nuestra clase 

        Runtime rt = Runtime.getRuntime();

        //Ahora ejecutamos como lo hacemos en consola

        rt.exec( cmd );
            System.out.println("correcto");
        } catch (Exception ex) {
        ex.printStackTrace();
        }  finally {
       
        }
       
    }//GEN-LAST:event_btnverActionPerformed

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        Principal prc = new Principal();
        prc.setVisible(true);
        prc.setLocationRelativeTo(null);
        this.dispose();
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

      
        jugadorplanta.buscarNodoIndice(0);
        jugadorplanta.generar();
        
        try {

        //path del dot.exe,por lo general es la misma, pero depende de donde hayas instalado el paquete de Graphviz

       
        String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";

        //path del archivo creado con el codigo del graphviz que queremos

        String fileInputPath = "C:\\Users\\Gamusa\\Desktop\\archivo.txt";

        //path de salida del grafo, es decir el path de la imagen que vamos a crear con graphviz

        String fileOutputPath = "C:\\Users\\Gamusa\\Desktop\\imagenprueba1.jpg";

        //tipo de imagen de salida, en este caso es jpg

        String tParam = "-Tjpg";

        String tOParam = "-o";

        //concatenamos nuestras direcciones. Lo que hice es crear un vector, para poder editar las direcciones de entrada y salida, usando las variables antes inicializadas

        //recordemos el comando en la consola de windows: C:\Archivos de programa\Graphviz 2.21\bin\dot.exe -Tjpg grafo1.txt -o grafo1.jpg Esto es lo que concatenamos en el vector siguiente:

        String[] cmd = new String[5];
        cmd[0] = dotPath;
        cmd[1] = tParam;
        cmd[2] = fileInputPath;
        cmd[3] = tOParam;
        cmd[4] = fileOutputPath;

        //Invocamos nuestra clase 

        Runtime rt = Runtime.getRuntime();

        //Ahora ejecutamos como lo hacemos en consola

        rt.exec( cmd );
            System.out.println("correcto");
        } catch (Exception ex) {
        ex.printStackTrace();
        }  finally {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton btnver;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblotro;
    private javax.swing.JTextArea ta;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtjugador;
    private javax.swing.JTextField txtotro;
    // End of variables declaration//GEN-END:variables
}
