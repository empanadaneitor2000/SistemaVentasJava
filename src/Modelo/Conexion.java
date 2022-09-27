package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class Conexion {
  
    Connection con;
    public Connection Conectar(){
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto-formativo","root","");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error");

        }
        return con;
    }
    public static void main(String[] args) {
        Conexion cn = new Conexion();
        Statement st;
        ResultSet rs;
        
        try {
            st=cn.con.createStatement();
            rs=st.executeQuery("select * from usuario");
            while (rs.next()) {                
                System.out.println(rs.getInt("idUsuario")+" "+ rs.getString("imagen")+" "+ rs.getString("nombres")+" "+ rs.getString("apellidos")+" "+ rs.getString("fechaNacimiento"));
            //idUsuario,imagen,nombres,apellidos.fechaNacimiento,contrasena,documento,estado_idEstado,datos_contacto_idContacto,tipo_documento_idDocumento
            }
            
            cn.con.close();
        } catch (Exception e) {
        }
    }
}

