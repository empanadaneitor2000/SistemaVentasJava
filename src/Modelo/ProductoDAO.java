
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO implements CRUD{
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public List listarTablaProducto() {
        List<Producto> lista =new ArrayList<>();
        String sql="select * from producto";
        try{
          con = cn.Conectar();
          ps = con.prepareStatement(sql);
          rs= ps.executeQuery();
            while (rs.next()) {
                Producto c = new Producto();
               c.setIdProducto(rs.getInt(1));
               c.setImagen(rs.getString(2));
               c.setValor(rs.getInt(3));
               c.setCantidad(rs.getInt(4));
               c.setlinea_idLinea(rs.getInt(5));
               c.setsublinea_idSublinea(rs.getInt(6));
               c.setperfil_idPerfil(rs.getInt(7));
               c.setdescripcion_producto_idDescripcion(rs.getInt(8));
               lista.add(c);
            }
        } catch (Exception e){  
        }
        return lista;
    }
    

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql = "update producto set imagen=?,valor=?,cantidad=?,linea_idLinea=?,sublinea_idSublinea=?,perfil_idPerfil=?,descripcion_producto_idDescripcion=? where idProducto=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            ps.setObject(8, o[7]);
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