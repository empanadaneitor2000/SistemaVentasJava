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

    public List listarTablaVenta() {
        List<Ventas> lista =new ArrayList<>();
        String sql="select * from ventas";
        try{
          con = cn.Conectar();
          ps = con.prepareStatement(sql);
          rs= ps.executeQuery();
            while (rs.next()) {
                Ventas c = new Ventas();
               c.setidVenta(rs.getInt(1));
               c.setfecha(rs.getString(2));
               c.settotal(rs.getInt(3));
               c.setmetodo_pago_idMetodo(rs.getInt(4));
               c.setperfil_idPerfil(rs.getInt(5));
               lista.add(c);
            }
        } catch (Exception e){  
        }
        return lista;
    }


    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql = "update ventas set fecha=?,total=?,metodo_pago_idMetodo=?,perfil_idPerfil=?, where idVenta=?";
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
    
    public Ventas listaridVenta(String cod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
