
package Vistas;

import Bcrypt.BCrypt;
import Modelo.LoginValidar;
import Modelo.LoginValidarDAO;

import javax.swing.JOptionPane;


public class LoginForm extends javax.swing.JFrame {

    LoginValidarDAO vdao =new LoginValidarDAO();
    LoginValidar lv =new LoginValidar();
    
    public LoginForm() {
        initComponents();
        this.setLocationRelativeTo(null);
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user.setBackground(new java.awt.Color(255, 255, 255));
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 220, -1));

        jLabel2.setFont(new java.awt.Font("Sackbones", 3, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/llave.png"))); // NOI18N
        jLabel2.setText("PASSWORD");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 170, -1));

        pass.setText("jPasswordField1");
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 220, -1));

        jButton1.setBackground(new java.awt.Color(94, 114, 228));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/boton enviar.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 110, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logo version java.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 310, 190));

        jLabel1.setFont(new java.awt.Font("Sackbones", 3, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/guardian.png"))); // NOI18N
        jLabel1.setText("USUARIO");
        jLabel1.setMaximumSize(new java.awt.Dimension(20, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(20, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(562, 512));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 140, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/bglogin.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 440));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/loading-bar-846_128.gif"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 190, 130));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        validar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed
    
    
    
    public void validar(){
        String email=user.getText();//traemos los datos del textfiel del form
        String password =pass.getText();// traemos los datos del textfiel del form
          //System.out.println(lv.getPassword());
        
                    // aca usamos el checkpw de la documentacion de bcrypt pero no imprime ni pasa
       
                    //metodo de autentificacion del login
        if (user.getText().equals("")  ||  pass.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "INGRESE DATOS");
            user.requestFocus();
        }else{
            lv=vdao.Validar(email, password); //instaciamos el loginDAO y el modelo loginvalidar donde estan los contructores
            if (lv.getEmail()!= null && lv.getPassword() !=null) {
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

   
}
