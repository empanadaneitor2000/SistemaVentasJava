
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class PerfilDAO implements CRUD{
     Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        List <Perfil> lista = new ArrayList<>();
        String sql = "SELECT \n" +
        "idPerfil,nombrePerfil,usuario_idUsuario,rol_idRol,\n" +
        "	usuario.documento,\n" +
        "    rol.rol\n" +
        "FROM ((perfil \n" +
        "                INNER JOIN usuario ON perfil.usuario_idUsuario=usuario.idUsuario )\n" +
        "				INNER JOIN rol ON perfil.rol_idRol = rol.idRol);";
        try {
            con = cn.Conectar();
          ps = con.prepareStatement(sql);
          rs= ps.executeQuery();
            while (rs.next()) {
                Perfil p = new Perfil();
                p.setIdPerfil(rs.getInt(1));
                p.setNombrePerfil(rs.getString(2));
                p.setUsurio_idUsuario(rs.getInt(3));
                p.setRol_idRol(rs.getInt(4));
                p.setDocumento(rs.getInt(5));
                p.setRol(rs.getString(6));
                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizar(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
