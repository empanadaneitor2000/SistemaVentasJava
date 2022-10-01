
package Vistas;

import Modelo.Cliente;
import Modelo.ClienteDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Clientesform extends javax.swing.JInternalFrame {
    int idProducto;
    ClienteDAO dao = new ClienteDAO();
    Cliente cl = new Cliente();
    DefaultTableModel modelo = new DefaultTableModel();
    public Clientesform() {
        initComponents();
        listar();
    }
    
    void listar(){
        List <Cliente> lista = dao.listar();
        modelo=(DefaultTableModel)tabla.getModel();
        Object[]ob = new Object[8];
        for (int i = 0; i < lista.size(); i++) {
            ob[0]=lista.get(i).getIdUsuario();
            ob[1]=lista.get(i).getImagen();
            ob[2]=lista.get(i).getNombres();
            ob[3]=lista.get(i).getApellidos();
            ob[4]=lista.get(i).getFechaNacimiento();   
            ob[5]=lista.get(i).getDocumento();
            ob[6]=lista.get(i).getEstado_idEstado();
            
            ob[7]=lista.get(i).getTipo_documento_idDocumento();
            modelo.addRow(ob);
        }
            tabla.setModel(modelo);
   
    }
    
     public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbotipdoc = new javax.swing.JComboBox();
        cboestado = new javax.swing.JComboBox();
        btnupd = new javax.swing.JButton();
        btnnew = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        txtdoc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setTitle("Formulario Usuario");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("NOMBRES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 139, -1, -1));

        jLabel2.setText("APELLIDOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 171, -1, -1));

        jLabel3.setText("FECHA NACIMIENTO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 136, -1, -1));

        jLabel4.setText("NUMERO DOCUMENTO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 175, -1, 21));

        jLabel5.setText("ESTADO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 239, -1, 21));

        cbotipdoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONAR", "1", "2" }));
        cbotipdoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotipdocActionPerformed(evt);
            }
        });
        getContentPane().add(cbotipdoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 278, -1, -1));

        cboestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONAR", "1", "2" }));
        getContentPane().add(cboestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 239, -1, -1));

        btnupd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/btnactualizar.png"))); // NOI18N
        btnupd.setText("Actualizar");
        btnupd.setContentAreaFilled(false);
        btnupd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdActionPerformed(evt);
            }
        });
        getContentPane().add(btnupd, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 160, -1));

        btnnew.setFont(new java.awt.Font("Sackbones", 3, 18)); // NOI18N
        btnnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/btnbuscar.png"))); // NOI18N
        btnnew.setText("Buscar");
        btnnew.setContentAreaFilled(false);
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });
        getContentPane().add(btnnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 30, 160, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombres", "ima", "Apellidos", "Fecha de nacimiento", "Documento", "Estado", "Tipo de documento"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 316, 742, 170));

        jLabel7.setText("COD-USUARIO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 54, -1, 17));

        txtcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodActionPerformed(evt);
            }
        });
        getContentPane().add(txtcod, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 52, 56, -1));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 136, 172, -1));
        getContentPane().add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 168, 172, -1));
        getContentPane().add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 133, 167, -1));
        getContentPane().add(txtdoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 171, 167, -1));

        jLabel8.setText("TIPO DOCUMENTO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 278, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdActionPerformed
        actualizar();
    }//GEN-LAST:event_btnupdActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        buscarid();
    }//GEN-LAST:event_btnnewActionPerformed
    void buscarid(){
         String cod = txtcod.getText();
        
        if(txtcod.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingrear cod Usuario");
        }else{
            int cod2=Integer.parseInt(cod); 
            Cliente Cliente=dao.listarID(cod2);
            if (Integer.toString(Cliente.getIdUsuario())!= null) {
                txtnombre.setText(Cliente.getNombres());
                txtapellido.setText(Cliente.getApellidos());
                txtfecha.setText(Cliente.getFechaNacimiento());
                txtdoc.setText(Integer.toString(Cliente.getDocumento()));
                
                cboestado.setSelectedItem(Integer.toString(Cliente.getEstado_idEstado()));
                cbotipdoc.setSelectedItem(Integer.toString(Cliente.getTipo_documento_idDocumento()));
               
            }else{
               JOptionPane.showMessageDialog(this, "Producto no registrado");
                
            }
        }
    }
     void actualizar(){
          int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccionar fila ");
            
        }else{
             String nombre = txtnombre.getText();
            String apellido = txtapellido.getText();
            String fecha = txtfecha.getText();
            String ndoc = txtdoc.getText();
            String es = cboestado.getSelectedItem().toString();
            String tdoc = cbotipdoc.getSelectedItem().toString();
            
            
            
            
            Object [] obj = new Object[7];
            obj [0] = nombre;
            obj [1] = apellido;
            obj [2] = fecha;
            obj [3] = ndoc;
            obj [4] = es;
            obj [5] = tdoc;
            obj [6] = idProducto;
            dao.actualizar(obj);
            
         }
        }
           
   
    /*    }*/    
    private void cbotipdocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipdocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbotipdocActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccionar fila ");
            
        }else{
            int idProducto = Integer.parseInt(tabla.getValueAt(fila, 0).toString()) ;
            String nombre = tabla.getValueAt(fila, 1).toString();
            String apellido = tabla.getValueAt(fila, 3).toString();
            String fecha = tabla.getValueAt(fila, 4).toString();
            String ndoc = tabla.getValueAt(fila, 5).toString();
            String es = tabla.getValueAt(fila, 6).toString();
            String tdoc = tabla.getValueAt(fila, 7).toString();
            txtnombre.setText(nombre);
            txtapellido.setText(apellido);
            txtfecha.setText(fecha);
            txtdoc.setText(ndoc);
            cboestado.setSelectedItem(es);
            cbotipdoc.setSelectedItem(tdoc);
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void txtcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodActionPerformed
/*}*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnupd;
    private javax.swing.JComboBox cboestado;
    private javax.swing.JComboBox cbotipdoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextField txtdoc;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables

}