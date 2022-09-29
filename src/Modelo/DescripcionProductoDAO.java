package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DescripcionProductoDAO implements CRUD{
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    //buscador
    public DescripcionProducto listarIDP(int IdDescripcion){
        DescripcionProducto dps = new DescripcionProducto();
        String sql = "select * from descripcion_producto where IdDescripcion=?";     
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, IdDescripcion);
            rs=ps.executeQuery();
            while (rs.next()) {    
                dps.setIdDescripcion(rs.getInt(1));
               dps.setTitulo(rs.getString(2));
               dps.setDescripcion(rs.getString(3));
               dps.setRequisitosMinimos(rs.getString(4));
               dps.setRequisitosRecomendados(rs.getString(5));
     
            }
        } catch (Exception e) {  
        }
         return dps;
    }
     public DescripcionProducto listartitulo(String titulo){
        DescripcionProducto dp = new DescripcionProducto();
        String sql = "select * from descripcion_producto where titulo=?";     
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, titulo);
            rs=ps.executeQuery();
            while (rs.next()) {    
                dp.setIdDescripcion(rs.getInt(1));
               dp.setTitulo(rs.getString(2));
               dp.setDescripcion(rs.getString(3));
               dp.setRequisitosMinimos(rs.getString(4));
               dp.setRequisitosRecomendados(rs.getString(5));
     
            }
        } catch (Exception e) {  
        }
         return dp;
    }
    @Override
    public List listar() {
        List<DescripcionProducto> lista2 =new ArrayList<>();
        String sql="select * from descripcion_producto";
        try{
          con = cn.Conectar();
          ps = con.prepareStatement(sql);
          rs= ps.executeQuery();
            while (rs.next()) {
                DescripcionProducto c = new DescripcionProducto();
               c.setIdDescripcion(rs.getInt(1));
               c.setTitulo(rs.getString(2));
               c.setDescripcion(rs.getString(3));
               c.setRequisitosMinimos(rs.getString(4));
               c.setRequisitosRecomendados(rs.getString(5));
               lista2.add(c);
            }
        } catch (Exception e){  
        }
        return lista2;
    
    }
    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql = "update descripcion_producto set titulo=?,descripcion=?,requisitosMinimos=?,requisitosRecomendados=? where idDescripcion=?";
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
    public void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
   
}