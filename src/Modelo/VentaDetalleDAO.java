package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VentaDetalleDAO implements CRUD{
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
     public List listarTablaDetalleVenta() {
        List<VentaDetalle> lista =new ArrayList<>();
        String sql="select * from ventadetalle";
        try{
          con = cn.Conectar();
          ps = con.prepareStatement(sql);
          rs= ps.executeQuery();
            while (rs.next()) {
                VentaDetalle c = new VentaDetalle();
               c.setidDetalle(rs.getInt(1));
               c.setventa_idVenta(rs.getInt(2));
               c.setproducto_idProducto(rs.getInt(3));
               c.setcantidad(rs.getInt(4));
               c.settotal(rs.getInt(5));
            }
        } catch (Exception e){  
        }
        return lista;
    }


    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql = "update ventadetalle set venta_idVenta=?,producto_idProducto=?,cantidad=?,total=? where idDetalle=?";
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
    public List listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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