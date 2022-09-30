
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductoDAO implements CRUD{
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    //esto seria el buscador corregir luego
    
    public Producto listarID(int idProducto){
        Producto pd = new Producto();
        String sql = "SELECT "
                + "idProducto,imagen,valor,cantidad,linea,sublinea,descripcion_producto_idDescripcion,"
                + "titulo,descripcion,requisitosMinimos,requisitosRecomendados\n" +
"		\n" +
"		FROM ((((producto \n" +
"                 INNER JOIN linea ON producto.linea_idLinea=linea.idLinea )\n" +
"		INNER JOIN sublinea ON producto.sublinea_idSublinea = sublinea.idSublinea)\n" +
"		INNER JOIN perfil ON producto.perfil_idPerfil = perfil.idPerfil )\n" +
"        RIGHT JOIN descripcion_producto ON producto.descripcion_producto_idDescripcion = descripcion_producto.idDescripcion)"
                + "WHERE idProducto=?;";
       
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, idProducto);
            rs=ps.executeQuery();
            while (rs.next()) {    
                pd.setIdProducto(rs.getInt(1));
                pd.setImagen(rs.getString(2));
                pd.setValor(rs.getInt(3));
                pd.setCantidad(rs.getInt(4));
                pd.setLinea(rs.getString(5));
                pd.setSublinea(rs.getString(6));
                pd.setDescripcion_producto_idDescripcion(rs.getInt(7));
                pd.setTitulo(rs.getString(8));
                pd.setDescripcion(rs.getString(9));
                pd.setRequisitosMinimos(rs.getString(10));
                pd.setRequisitosRecomendados(rs.getString(11));
     
            }
        } catch (Exception e) {  
        }
         return pd;
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
      List<Producto> lista =new ArrayList<>();
        String sql="SELECT "
                + "idProducto,imagen,valor,cantidad,linea,sublinea,descripcion_producto_idDescripcion,"
                + "titulo,descripcion,requisitosMinimos,requisitosRecomendados\n" +
"		\n" +
"		FROM ((((producto \n" +
"                 INNER JOIN linea ON producto.linea_idLinea=linea.idLinea )\n" +
"		INNER JOIN sublinea ON producto.sublinea_idSublinea = sublinea.idSublinea)\n" +
"		INNER JOIN perfil ON producto.perfil_idPerfil = perfil.idPerfil )\n" +
"        RIGHT JOIN descripcion_producto ON producto.descripcion_producto_idDescripcion = descripcion_producto.idDescripcion);";
        
        try{
          con = cn.Conectar();
          ps = con.prepareStatement(sql);
          rs= ps.executeQuery();
            while (rs.next()) {
               Producto pd = new Producto();
               pd.setIdProducto(rs.getInt(1));
               pd.setImagen(rs.getString(2));
               pd.setValor(rs.getInt(3));
               pd.setCantidad(rs.getInt(4));
               pd.setLinea(rs.getString(5));
               pd.setSublinea(rs.getString(6));
               pd.setDescripcion_producto_idDescripcion(rs.getInt(7));
               pd.setTitulo(rs.getString(8));
               pd.setDescripcion(rs.getString(9));
               pd.setRequisitosMinimos(rs.getString(10));
               pd.setRequisitosRecomendados(rs.getString(11));
               lista.add(pd);
            }
        } catch (Exception e){  
        }
         
        return lista;
    } 
    
    
    @Override
    public int add(Object[] o) {
        int r=0;
       String sql = "insert into usuario(idUsuario,imagen,nombres,apellidos.fechaNacimiento,documento,estado_idEstado,datos_contacto_idContacto,tipo_documento_idDocumento)values(?,?,?,?,?,?,?,?,?)";
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
            ps.setObject(9, o[8]);
            
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

   
/*
    @Override
    public List listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
    @Override
    public void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
   
}
