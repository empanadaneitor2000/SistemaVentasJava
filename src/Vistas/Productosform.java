
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

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtcant = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JLabel();
        txtiddescripcion = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        txtcodproducto = new javax.swing.JTextField();
        txtIdProducto = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaproductos = new javax.swing.JTable();
        txtcoddescripcion = new javax.swing.JTextField();
        btnBuscarDescripcion = new javax.swing.JButton();
        txtimagen = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        txttitulo = new javax.swing.JTextField();
        txtreqrecm = new javax.swing.JTextField();
        btnActualizarProducto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtIdDescripcion = new javax.swing.JLabel();
        txtreqmin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtvalor = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JLabel();
        btniddescrip = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setTitle("Formulario Productos");
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(152, 104, 227));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Sackbones", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CANTIDAD");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 90, -1));
        jPanel1.add(txtcant, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 140, -1));

        jLabel6.setFont(new java.awt.Font("Sackbones", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID-DESCRIPCION");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 130, -1));

        txtProducto.setFont(new java.awt.Font("Sackbones", 3, 18)); // NOI18N
        txtProducto.setForeground(new java.awt.Color(255, 255, 255));
        txtProducto.setText("ID-DESCRIPCION");
        jPanel1.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 130, -1));
        jPanel1.add(txtiddescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 140, -1));

        btnBuscarProducto.setFont(new java.awt.Font("Sackbones", 2, 18)); // NOI18N
        btnBuscarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/btnbuscar.png"))); // NOI18N
        btnBuscarProducto.setText("Buscar");
        btnBuscarProducto.setContentAreaFilled(false);
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        txtcodproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodproductoActionPerformed(evt);
            }
        });
        jPanel1.add(txtcodproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 100, -1));

        txtIdProducto.setFont(new java.awt.Font("Sackbones", 3, 18)); // NOI18N
        txtIdProducto.setForeground(new java.awt.Color(255, 255, 255));
        txtIdProducto.setText("ID. PRODUCTO:");
        jPanel1.add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        tablaproductos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaproductos.setFont(new java.awt.Font("Sackbones", 0, 12)); // NOI18N
        tablaproductos.setForeground(new java.awt.Color(152, 104, 227));
        tablaproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID-P", "IMG", "VALOR", "STOCK", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11"
            }
        ));
        tablaproductos.setGridColor(new java.awt.Color(152, 104, 227));
        tablaproductos.setSelectionBackground(new java.awt.Color(138, 227, 70));
        jScrollPane3.setViewportView(tablaproductos);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 1251, 200));

        txtcoddescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcoddescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(txtcoddescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 140, -1));

        btnBuscarDescripcion.setFont(new java.awt.Font("Sackbones", 2, 18)); // NOI18N
        btnBuscarDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarDescripcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/btnc.png"))); // NOI18N
        btnBuscarDescripcion.setText("Eliminar");
        btnBuscarDescripcion.setContentAreaFilled(false);
        btnBuscarDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnBuscarDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));
        jPanel1.add(txtimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 380, -1));

        txtdescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 380, 43));

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
        jPanel1.add(txttitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 380, 40));
        jPanel1.add(txtreqrecm, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 230, 390, 42));

        btnActualizarProducto.setFont(new java.awt.Font("Sackbones", 2, 18)); // NOI18N
        btnActualizarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/btnactualizar.png"))); // NOI18N
        btnActualizarProducto.setText("Actualizar ");
        btnActualizarProducto.setContentAreaFilled(false);
        btnActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sackbones", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REQUISITOS MINIMOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, 170, 30));

        txtIdDescripcion.setFont(new java.awt.Font("Sackbones", 3, 18)); // NOI18N
        txtIdDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtIdDescripcion.setText("TITULO");
        jPanel1.add(txtIdDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 60, 23));

        txtreqmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreqminActionPerformed(evt);
            }
        });
        jPanel1.add(txtreqmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, 390, 40));

        jLabel3.setFont(new java.awt.Font("Sackbones", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("VALOR");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sackbones", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("REQUISITOS RECOMENDADOS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 200, 220, -1));

        jLabel1.setFont(new java.awt.Font("Sackbones", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("IMAGEN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 90, -1));

        txtvalor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalorActionPerformed(evt);
            }
        });
        jPanel1.add(txtvalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 140, -1));

        txtDescripcion.setFont(new java.awt.Font("Sackbones", 3, 18)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setText("DESCRIPCION:");
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, 20));

        btniddescrip.setFont(new java.awt.Font("Sackbones", 2, 18)); // NOI18N
        btniddescrip.setForeground(new java.awt.Color(255, 255, 255));
        btniddescrip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/btnsubir.png"))); // NOI18N
        btniddescrip.setText("Agregar");
        btniddescrip.setContentAreaFilled(false);
        btniddescrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniddescripActionPerformed(evt);
            }
        });
        jPanel1.add(btniddescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        jLabel8.setBackground(new java.awt.Color(153, 255, 153));
        jLabel8.setForeground(new java.awt.Color(153, 255, 153));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 680, 80));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/bg3.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1340, 430));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 510));

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

    private void txtcodproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodproductoActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void txtcoddescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcoddescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcoddescripcionActionPerformed
    
    void BuscarProducto(){
        
        String cod = txtcodproducto.getText();
        if(txtcodproducto.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingrear cod producto");
        }else{
            int cod2=Integer.parseInt(cod);
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
                txtiddescripcion.setText(Integer.toString(producto.getDescripcion_producto_idDescripcion()));
                
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
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
