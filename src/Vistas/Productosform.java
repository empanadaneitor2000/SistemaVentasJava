
package Vistas;

import Modelo.DescripcionProducto;
import Modelo.DescripcionProductoDAO;
import Modelo.Producto;
import Modelo.ProductoDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Productosform extends javax.swing.JInternalFrame {
    
            ProductoDAO dao = new ProductoDAO();
            Producto pd = new Producto();
            DefaultTableModel modelo = new DefaultTableModel();
            
        DescripcionProductoDAO dao2 = new DescripcionProductoDAO();
        DescripcionProducto dp = new DescripcionProducto();
        DefaultTableModel modelo2 = new DefaultTableModel();
   
        
        
        
        
    public Productosform() {
         initComponents();
           listar();
           //consultar();
    }
 
    
    
    //buscador pero 
    void listar(){
       
        List <Producto> lista = dao.listar();
       modelo=(DefaultTableModel)tablaproductos.getModel();
        Object[]pd = new Object[11];
        for (int i = 0; i < lista.size(); i++) {
            pd[0]=lista.get(i).getIdProducto();
            pd[1]=lista.get(i).getImagen();
            pd[2]=lista.get(i).getValor();
            pd[3]=lista.get(i).getCantidad();
            pd[4]=lista.get(i).getLinea();   
            pd[5]=lista.get(i).getSublinea();
            pd[6]=lista.get(i).getDescripcion_producto_idDescripcion();
            pd[7]=lista.get(i).getTitulo();
            pd[8]= lista.get(i).getDescripcion();
            pd[9]=lista.get(i).getRequisitosMinimos();
            pd[10]=lista.get(i).getRequisitosRecomendados();
            
            modelo.addRow(pd);
            }
        tablaproductos.setModel(modelo);
        
    }
            
        /*    
        List <DescripcionProducto> lista2 = dao2.listar();
        modelo2=(DefaultTableModel)tabladescripcion.getModel();
        Object[]p = new Object[5];
        for (int x = 0; x < lista2.size(); x++) {
            p[0]=lista2.get(x).getIdDescripcion();
            p[1]=lista2.get(x).getTitulo();
            p[2]=lista2.get(x).getDescripcion();
            p[3]=lista2.get(x).getRequisitosMinimos();
            p[4]=lista2.get(x).getRequisitosRecomendados();   
            
            
            modelo2.addRow(p);
   
            }
        
            tabladescripcion.setModel(modelo2);
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* esto toca borrarlo cuando funcione el login*/
        java.awt.EventQueue.invokeLater(() -> {
            new menu().setVisible(true);
        });
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIdProducto = new javax.swing.JLabel();
        btnBuscarProducto = new javax.swing.JButton();
        btnBuscarDescripcion = new javax.swing.JButton();
        txtimagen = new javax.swing.JTextField();
        txtProducto = new javax.swing.JLabel();
        txtdescripcion = new javax.swing.JTextField();
        txttitulo = new javax.swing.JTextField();
        txtreqrecm = new javax.swing.JTextField();
        btnActualizarProducto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdDescripcion = new javax.swing.JLabel();
        txtreqmin = new javax.swing.JTextField();
        txtcant = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtcodproducto = new javax.swing.JTextField();
        txtiddescripcion = new javax.swing.JTextField();
        txtvalor = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btniddescrip = new javax.swing.JButton();
        txtcoddescripcion = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaproductos = new javax.swing.JTable();

        setTitle("Formulario Productos");
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);

        txtIdProducto.setText("ID. PRODUCTO:");

        btnBuscarProducto.setText("Buscar");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        btnBuscarDescripcion.setText("Eliminar");
        btnBuscarDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDescripcionActionPerformed(evt);
            }
        });

        txtProducto.setText("ID-DESCRIPCION");

        txtdescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescripcionActionPerformed(evt);
            }
        });

        txttitulo.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                txttituloComponentRemoved(evt);
            }
        });
        txttitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttituloActionPerformed(evt);
            }
        });

        btnActualizarProducto.setText("Actualizar ");
        btnActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProductoActionPerformed(evt);
            }
        });

        jLabel2.setText("REQUISITOS MINIMOS");

        jLabel4.setText("CANTIDAD");

        txtIdDescripcion.setText("TITULO");

        txtreqmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreqminActionPerformed(evt);
            }
        });

        jLabel3.setText("VALOR");

        jLabel5.setText("REQUISITOS RECOMENDADOS");

        jLabel1.setText("IMAGEN");

        txtvalor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalorActionPerformed(evt);
            }
        });

        txtDescripcion.setText("DESCRIPCION:");

        jLabel6.setText("ID-DESCRIPCION");

        btniddescrip.setText("Agregar");
        btniddescrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniddescripActionPerformed(evt);
            }
        });

        tablaproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11"
            }
        ));
        jScrollPane3.setViewportView(tablaproductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtIdProducto)
                        .addGap(4, 4, 4)
                        .addComponent(txtcodproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtiddescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(57, 57, 57)
                                .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addComponent(txtimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtcoddescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtreqmin, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtDescripcion))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(txtreqrecm, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtIdDescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnActualizarProducto)
                        .addGap(18, 18, 18)
                        .addComponent(btniddescrip)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarDescripcion)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(txtIdProducto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcodproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtDescripcion)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtreqmin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtreqrecm, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcoddescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtProducto)
                                    .addComponent(txtiddescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtimagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarProducto)
                    .addComponent(btniddescrip)
                    .addComponent(btnBuscarDescripcion))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtvalorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvalorActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
      BuscarProducto();
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnActualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarProductoActionPerformed

    private void txtdescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescripcionActionPerformed

    private void txttituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttituloActionPerformed

    private void btnBuscarDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDescripcionActionPerformed
        //BuscarTitulo();
    }//GEN-LAST:event_btnBuscarDescripcionActionPerformed

    private void txtreqminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreqminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtreqminActionPerformed

    private void btniddescripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniddescripActionPerformed
        //BuscarDescripcion();
    }//GEN-LAST:event_btniddescripActionPerformed

    private void txttituloComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txttituloComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_txttituloComponentRemoved
    
    void BuscarProducto(){
        
        String cod = txtcodproducto.getText();
        int cod2=Integer.parseInt(cod);
        if(txtcodproducto.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingrear cod producto");
        }else{
            Producto producto =dao.listarID(cod2);
            if (Integer.toString(producto.getIdProducto())!= null) {
                txtvalor.setText(Integer.toString(producto.getValor()));
                txtcant.setText(Integer.toString(producto.getCantidad()));
                txtimagen.setText(producto.getImagen());
                txtcoddescripcion.setText(Integer.toString(producto.getDescripcion_producto_idDescripcion()));
                txttitulo.setText(producto.getTitulo());
                txtdescripcion.setText(producto.getDescripcion());
                txtreqmin.setText(producto.getRequisitosMinimos());
                txtreqrecm.setText(producto.getRequisitosRecomendados());
                
                System.err.println("Error");
            }else{
               JOptionPane.showMessageDialog(this, "Producto no registrado");
                
            }
        }
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarProducto;
    private javax.swing.JButton btnBuscarDescripcion;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btniddescrip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaproductos;
    private javax.swing.JLabel txtDescripcion;
    private javax.swing.JLabel txtIdDescripcion;
    private javax.swing.JLabel txtIdProducto;
    private javax.swing.JLabel txtProducto;
    private javax.swing.JTextField txtcant;
    private javax.swing.JTextField txtcoddescripcion;
    private javax.swing.JTextField txtcodproducto;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtiddescripcion;
    private javax.swing.JTextField txtimagen;
    private javax.swing.JTextField txtreqmin;
    private javax.swing.JTextField txtreqrecm;
    private javax.swing.JTextField txttitulo;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}
