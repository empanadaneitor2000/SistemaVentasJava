
package Vistas;
import Modelo.VentaDetalle;
import Modelo.VentaDetalleDAO;
import Modelo.Ventas;
import Modelo.VentasDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class Ventasform extends javax.swing.JInternalFrame {

    VentasDAO dao3 = new VentasDAO();
    Ventas vs = new Ventas();
    DefaultTableModel modelo3 = new DefaultTableModel();
    
    VentaDetalleDAO dao4 = new VentaDetalleDAO();
    VentaDetalle vds = new VentaDetalle();
    public Ventasform() {
        initComponents();
           listar();
    }
    void listar(){
        List <Ventas> lista3 = dao3.listar();
        modelo3=(DefaultTableModel)tablaventas.getModel();
        Object[]vt = new Object[5];
        for (int a = 0; a < lista3.size(); a++) {
            vt[0]=lista3.get(a).getIdVenta();
            vt[1]=lista3.get(a).getFecha();
            vt[2]=lista3.get(a).getTotal();
            vt[3]=lista3.get(a).getMetodo_pago_idMetodo();
            vt[4]=lista3.get(a).getPerfil_idPerfil();   
            
            modelo3.addRow(vt);
        }
            tablaventas.setModel(modelo3);
            
        List <VentaDetalle> lista = dao3.listar();
        modelo3=(DefaultTableModel)TablaDetalleVenta.getModel();
        Object[]o = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            o[0]=lista.get(i).getIdDetalle();
            o[1]=lista.get(i).getVenta_idVenta();
            o[2]=lista.get(i).getProducto_idProducto();
            o[3]=lista.get(i).getCantidad();
            o[4]=lista.get(i).getTotal();   
            
            modelo3.addRow(o);
        }
            TablaDetalleVenta.setModel(modelo3);
            
            
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }
    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCodVenta = new javax.swing.JLabel();
        txtventaid = new javax.swing.JTextField();
        btnventa = new javax.swing.JButton();
        txtFechaVenta = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtTotalVenta = new javax.swing.JLabel();
        txtmp = new javax.swing.JTextField();
        txtDetalleVenta = new javax.swing.JLabel();
        txtPerfil = new javax.swing.JTextField();
        txtMetodoPago = new javax.swing.JLabel();
        txtPerfilVenta = new javax.swing.JLabel();
        btnDetalle = new javax.swing.JTextField();
        txtIdVenta = new javax.swing.JLabel();
        txtProductoVenta = new javax.swing.JLabel();
        txtCantidadVenta = new javax.swing.JLabel();
        btnIdVenta = new javax.swing.JTextField();
        btnProducto = new javax.swing.JTextField();
        btnCantidad = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaventas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaDetalleVenta = new javax.swing.JTable();

        setTitle("Reportes de Ventas");

        txtCodVenta.setText("COD.VENTA:");

        txtventaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtventaidActionPerformed(evt);
            }
        });

        btnventa.setText("Buscar");
        btnventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnventaActionPerformed(evt);
            }
        });

        txtFechaVenta.setText("FECHA:");

        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        txtTotalVenta.setText("TOTAL:");

        txtDetalleVenta.setText("ID DETALLE:");

        txtPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerfilActionPerformed(evt);
            }
        });

        txtMetodoPago.setText("ID METODO PAGO:");

        txtPerfilVenta.setText("ID PERFIL:");

        btnDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalleActionPerformed(evt);
            }
        });

        txtIdVenta.setText("ID VENTA:");

        txtProductoVenta.setText("ID PRODUCTO:");

        txtCantidadVenta.setText("CANTIDAD:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCodVenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtventaid, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFechaVenta)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMetodoPago)
                                .addComponent(txtTotalVenta))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtmp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtPerfilVenta))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDetalleVenta)
                            .addComponent(txtIdVenta)
                            .addComponent(txtProductoVenta)
                            .addComponent(txtCantidadVenta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(btnProducto)
                            .addComponent(btnDetalle)
                            .addComponent(btnIdVenta)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnventa)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodVenta)
                    .addComponent(txtventaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnventa))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaVenta)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDetalleVenta)
                    .addComponent(btnDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalVenta)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdVenta)
                    .addComponent(btnIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMetodoPago)
                    .addComponent(txtmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductoVenta)
                    .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPerfilVenta)
                    .addComponent(txtPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidadVenta)
                    .addComponent(btnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID VENTA", "FECHA", "TOTAL", "ID METODO DE PAGO", "ID PERFIL"
            }
        ));
        jScrollPane1.setViewportView(tablaventas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        TablaDetalleVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID DETALLE", "ID VENTA", "ID PRODUCTO", "CANTIDAD"
            }
        ));
        jScrollPane2.setViewportView(TablaDetalleVenta);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnventaActionPerformed
        BuscarVenta();
    }//GEN-LAST:event_btnventaActionPerformed

    void BuscarVenta() {
        
          String cod = txtventaid.getText();
        int cod2=Integer.parseInt(cod);
        if(txtventaid.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingrear cod producto");
        }else{
            Ventas Ventas=dao3.listarIDV(cod2);
            if (Integer.toString(Ventas.getIdVenta())!= null) {
                txtFecha.setText(Ventas.getFecha());
               txtTotal.setText(Integer.toString(Ventas.getTotal()));
                txtmp.setText(Integer.toString(Ventas.getMetodo_pago_idMetodo()));
                txtPerfil.setText(Integer.toString(Ventas.getPerfil_idPerfil()));
                System.err.println("Error");
            }else{
               JOptionPane.showMessageDialog(this, "Producto no registrado");
                
            }
        }
    }
            
    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerfilActionPerformed

    private void btnDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDetalleActionPerformed

    private void txtventaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtventaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtventaidActionPerformed
  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDetalleVenta;
    private javax.swing.JTextField btnCantidad;
    private javax.swing.JTextField btnDetalle;
    private javax.swing.JTextField btnIdVenta;
    private javax.swing.JTextField btnProducto;
    private javax.swing.JButton btnventa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaventas;
    private javax.swing.JLabel txtCantidadVenta;
    private javax.swing.JLabel txtCodVenta;
    private javax.swing.JLabel txtDetalleVenta;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JLabel txtFechaVenta;
    private javax.swing.JLabel txtIdVenta;
    private javax.swing.JLabel txtMetodoPago;
    private javax.swing.JTextField txtPerfil;
    private javax.swing.JLabel txtPerfilVenta;
    private javax.swing.JLabel txtProductoVenta;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JLabel txtTotalVenta;
    private javax.swing.JTextField txtmp;
    private javax.swing.JTextField txtventaid;
    // End of variables declaration//GEN-END:variables

    private void buscarVenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
