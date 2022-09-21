
package Vistas;

import Modelo.EntidadVendedor;
import Modelo.VendedorDAO;
import javax.swing.JOptionPane;


public class LoginForm extends javax.swing.JFrame {

    VendedorDAO vdao =new VendedorDAO();
    EntidadVendedor ev =new EntidadVendedor();
    
    public LoginForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        user.setText("1109223332" );
        pass.setText("vsantana212");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logo version java.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/user.png"))); // NOI18N
        jLabel1.setText("USUARIO");
        jLabel1.setMaximumSize(new java.awt.Dimension(20, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(20, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(562, 512));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 90, 20));

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 220, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/candado.png"))); // NOI18N
        jLabel2.setText("PASSWORD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        pass.setText("jPasswordField1");
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 220, -1));

        jButton1.setBackground(new java.awt.Color(94, 114, 228));
        jButton1.setText("INGRESAR");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 110, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo login.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        validar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed
    public void validar(){
        String doc=user.getText();
        String cont=pass.getText();
        
        if (user.getText().equals("")  ||  pass.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "INGRESE DATOS");
            user.requestFocus();
        }else{
            ev=vdao.Validarvendedor(doc, cont);
            if (ev.getDoc()!= null && ev.getCont()!=null) {
                menu p = new menu();
                p.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(this, "DEBEN SER DATOS VALIDOS");
                user.requestFocus();
            }
        }
    }
    
    public static void main(String argsc[]) {
      
        java.awt.EventQueue.invokeLater(() -> {
            new LoginForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

   
}
