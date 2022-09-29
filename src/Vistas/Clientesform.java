
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

        jLabel1.setText("NOMBRES");

        jLabel2.setText("APELLIDOS");

        jLabel3.setText("FECHA NACIMIENTO");

        jLabel4.setText("NUMERO DOCUMENTO");

        jLabel5.setText("ESTADO");

        cbotipdoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONAR", "1", "2" }));
        cbotipdoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotipdocActionPerformed(evt);
            }
        });

        cboestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONAR", "1", "2" }));

        btnupd.setText("ACTUALIZAR");
        btnupd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdActionPerformed(evt);
            }
        });

        btnnew.setText("Buscar");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });

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

        jLabel7.setText("COD-USUARIO");

        jLabel8.setText("TIPO DOCUMENTO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcod)
                    .addComponent(txtnombre)
                    .addComponent(txtapellido, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnnew, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 350, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(240, 240, 240)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtfecha)
                                    .addComponent(txtdoc, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(279, 279, 279)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                        .addComponent(btnupd))
                                    .addComponent(cbotipdoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnew)
                    .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtdoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnupd)
                        .addGap(1, 1, 1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(cbotipdoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addContainerGap())
        );

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