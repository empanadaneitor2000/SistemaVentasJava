package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;


public class VendedorDAO {
    Conexion con=new Conexion();
    Connection acceso;
    PreparedStatement ps;
    ResultSet rs;
    
    public EntidadVendedor Validarvendedor(String doc, String nombres){
        EntidadVendedor ev=new EntidadVendedor();
       String sql="select * from usuario where documento=? and nombres=? ";
        try {
            acceso=con.Conectar();
            
            ps=acceso.prepareStatement(sql);
            ps.setString(1, doc);
            ps.setString(2, nombres);
            rs=ps.executeQuery();
            
           
            while (rs.next()) {                
                ev.setIdU(rs.getInt(1));
                ev.setImg(rs.getString(2));
                ev.setNom(rs.getString(3));
                ev.setApe(rs.getString(4));
                ev.setFechaNacimiento(rs.getString(5));        
                ev.setDoc(rs.getString(6));
                ev.setEstado_idEstado(rs.getInt(7));
                ev.setDatos_contacto_idContcto(rs.getInt(8));
                ev.setTipo_documento_idDocumento(rs.getInt(9));
                
            }
         }catch(Exception e){

                e.printStackTrace(); // para ver qué excepciones saltan y dónde
        }    
        return ev;
    }
}
