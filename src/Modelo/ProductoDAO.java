
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.List;

public class ProductoDAO implements CRUD{
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    //esto seria el buscador 
    public Producto listarID(int idProducto){
        Producto c = new Producto();
        String sql = "select * from producto where idProducto=?";
       
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, idProducto);
            rs=ps.executeQuery();
            while (rs.next()) {    
                c.setIdProducto(rs.getInt(1));
                c.setImagen(rs.getString(2));
                c.setValor(rs.getInt(3));
                c.setCantidad(rs.getInt(4));
                c.setlinea_idLinea(rs.getInt(5));
                c.setsublinea_idSublinea(rs.getInt(6));
                c.setperfil_idPerfil(rs.getInt(7));
                c.setdescripcion_producto_idDescripcion(rs.getInt(8));
     
            }
        } catch (Exception e) {  
        }
         return c;
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

/*    @Override
    public List listar() {
      
        String sql="SELECT idProducto,imagen,valor,cantidad,linea,sublinea,descripcion_producto_idDescripcion,"
                + "titulo,descripcion,requisitosMinimos,requisitosRecomendados\n" +
"		\n" +
"		FROM ((((producto \n" +
"                 INNER JOIN linea ON producto.linea_idLinea=linea.idLinea )\n" +
"		INNER JOIN sublinea ON producto.sublinea_idSublinea = sublinea.idSublinea)\n" +
"		INNER JOIN perfil ON producto.perfil_idPerfil = perfil.idPerfil )\n" +
"        RIGHT JOIN descripcion_producto ON producto.descripcion_producto_idDescripcion = descripcion_producto.idDescripcion)"
                + "where idProducto=?;"
                
                ;
        String data[] = new String [11];
        try{
          con = cn.Conectar();
          ps = con.prepareStatement(sql);
          rs= ps.executeQuery();
            while (rs.next()) {
               data[0]= rs.getString("idProducto");
               data[1]= rs.getString("imagen");
               data[2]= rs.getString("valor");
               data[3]= rs.getString("cantidad");
               data[4]= rs.getString("linea");
               data[5]= rs.getString("sublinea");
               data[6]= rs.getString("descripcion_producto_idDescripcion");
               data[7]= rs.getString("titulo");
               data[8]= rs.getString("descripcion");
               data[9]= rs.getString("requisitosMinimos");
               data[10]= rs.getString("requisitosRecomendados");
              
               
            }
        } catch (Exception e){  
        }
         
        return ;
    } 
    
    */
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

    @Override
    public void eliminar(int idProducto) {
         String sql = "delete from producto where idProducto=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, idProducto);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
/*
    @Override
    public List listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/

    @Override
    public List listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
   
}
