package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements CRUD{
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        List<Cliente> lista =new ArrayList<>();
        String sql="select * from usuario";
        try{
          con = cn.Conectar();
          ps = con.prepareStatement(sql);
          rs= ps.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
               c.setIdUsuario(rs.getInt(1));
               c.setNombres(rs.getString(2));
               c.setImagen(rs.getString(3));
               c.setApellidos(rs.getString(4));
               c.setFechaNacimiento(rs.getString(5));
               c.setDocumento(rs.getInt(6));
               c.setEstado_idEstado(rs.getInt(7));
               c.setDatos_contacto_idContacto(rs.getInt(8));
               c.setTipo_documento_idDocumento(rs.getInt(9));
               lista.add(c);
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

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql = "update usuario set imagen=?,nombres=?,apellidos=?.fechaNacimiento=?,documento=?,estado_idEstado=?,datos_contacto_idContacto=?,tipo_documento_idDocumento=? where idUsuario=?";
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
    public void eliminar(int idUsuario) {
        String sql = "delete from usuario where idUsuario=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, idUsuario);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public Cliente listarID(String cod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
