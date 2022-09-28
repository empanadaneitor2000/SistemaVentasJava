
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginValidarDAO {
    Conexion con=new Conexion();
    Connection acceso;
    PreparedStatement ps;
    ResultSet rs;
    
    public LoginValidar Validar(String email, String password){
        LoginValidar lv = new LoginValidar();
        String sql="select * from datos_contacto where email=? and password=? ";
        try {
            acceso=con.Conectar();
            
            ps=acceso.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, password);
            rs=ps.executeQuery();
            
            while (rs.next()){
               lv.setIdContacto(rs.getInt(1));
               lv.setTelefono(rs.getInt(2));
               lv.setDireccion(rs.getString(3));
               lv.setEmail(rs.getString(4));
               lv.setCiudad_idCiudad(rs.getInt(5));
               lv.setPassword(rs.getString(6));
              
               System.out.println(lv.getPassword());
            }
            
        } catch (Exception e) {
        }
        return lv;
    }
    
}
