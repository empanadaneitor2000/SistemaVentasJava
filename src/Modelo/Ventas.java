
package Modelo;


public class Ventas {
    int idVenta;
    String fecha;
    int total;
    int metodo_pago_idMetodo;
    int perfil_idPerfil;

    public Ventas() {
    }

    public Ventas(int idVenta, String fecha, int total, int metodo_pago_idMetodo, int perfil_idPerfil) {
        this.idVenta = idVenta;
        this.total = total;
        this.metodo_pago_idMetodo = metodo_pago_idMetodo;
        this.perfil_idPerfil = perfil_idPerfil;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getMetodo_pago_idMetodo() {
        return metodo_pago_idMetodo;
    }

    public void setMetodo_pago_idMetodo(int metodo_pago_idMetodo) {
        this.metodo_pago_idMetodo = metodo_pago_idMetodo;
    }

    public int getPerfil_idPerfil() {
        return perfil_idPerfil;
    }

    public void setPerfil_idPerfil(int perfil_idPerfil) {
        this.perfil_idPerfil = perfil_idPerfil;
    }

    void setidVenta(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setfecha(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void settotal(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setmetodo_pago_idMetodo(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setperfil_idPerfil(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getDni() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
} 
