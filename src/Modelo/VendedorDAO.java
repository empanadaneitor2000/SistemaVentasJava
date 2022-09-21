/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

/**
 *
 * @author 57310
 */
public class VendedorDAO {
    Conexion con=new Conexion();
    Connection acceso;
    PreparedStatement ps;
    ResultSet rs;
    
    public EntidadVendedor Validarvendedor(String doc, String cont){
        EntidadVendedor ev=new EntidadVendedor();
       String sql="select * from usuario where documento=? and contrasena=? ";
        try {
            acceso=con.Conectar();
            
            ps=acceso.prepareStatement(sql);
            ps.setString(1, doc);
            ps.setString(2, cont);
            rs=ps.executeQuery();
            
           
            while (rs.next()) {                
                ev.setIdU(rs.getInt(1));
                ev.setImg(rs.getString(2));
                ev.setNom(rs.getString(3));
                ev.setApe(rs.getString(4));
                ev.setFechaNacimiento(rs.getString(5));
                ev.setCont(rs.getString(6));
                ev.setDoc(rs.getString(7));
                ev.setEstado_idEstado(rs.getInt(8));
                ev.setDatos_contacto_idContcto(rs.getInt(9));
                ev.setTipo_documento_idDocumento(rs.getInt(10));
                
            }
         }catch(Exception e){

                e.printStackTrace(); // para ver qué excepciones saltan y dónde
        }    
        return ev;
    }
}
