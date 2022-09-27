package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VentasDAO implements CRUD{
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    
    public Ventas listarIDV(int idVenta){
        Ventas c = new Ventas();
        String sql = "select * from venta where idVenta=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, idVenta);
            rs=ps.executeQuery();
            while (rs.next()) {    
                c.setIdVenta(rs.getInt(1));
                c.setFecha(rs.getString(2));
                c.setTotal(rs.getInt(3));
                c.setMetodo_pago_idMetodo(rs.getInt(4));
                c.setMetodo_pago_idMetodo(rs.getInt(4));
                c.setTotal(rs.getInt(5));
                
     
            }
        } catch (Exception e) {  
        }
         return c;
    }
   @Override
    public List listar() {
        List<Ventas> lista3 =new ArrayList<>();
        String sql="select * from venta";
        try{
          con = cn.Conectar();
          ps = con.prepareStatement(sql);
          rs= ps.executeQuery();
            while (rs.next()) {
                Ventas c = new Ventas();
               c.setIdVenta(rs.getInt(1));
               c.setFecha(rs.getString(2));
               c.setTotal(rs.getInt(3));
               c.setMetodo_pago_idMetodo(rs.getInt(4));
               c.setPerfil_idPerfil(rs.getInt(5));
               lista3.add(c);
            }
        } catch (Exception e){  
        }
        return lista3;    
    }


    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql = "update venta set fecha=?,total=?,metodo_pago_idMetodo=?,perfil_idPerfil=?, where idVenta=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    
    @Override
    public int add(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(int idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
   
}
