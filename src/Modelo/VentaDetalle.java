
package Modelo;


public class VentaDetalle {
    int idDetalle;
    int venta_idVenta;
    int producto_idProducto;
    int cantidad;
    int total;
    
    public VentaDetalle() {
    
    }

    public VentaDetalle(int idDetalle, int venta_idVenta, int producto_idProducto, int cantidad, double total) {
        this.idDetalle = idDetalle;
        this.venta_idVenta = venta_idVenta;
        this.producto_idProducto = producto_idProducto;
        this.cantidad = cantidad;
        this.total = (int) total;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getVenta_idVenta() {
        return venta_idVenta;
    }

    public void setVenta_idVenta(int venta_idVenta) {
        this.venta_idVenta = venta_idVenta;
    }

    public int getProducto_idProducto() {
        return producto_idProducto;
    }

    public void setProducto_idProducto(int producto_idProducto) {
        this.producto_idProducto = producto_idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = (int) total;
    }

    void setidDetalle(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setventa_idVenta(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setproducto_idProducto(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setcantidad(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void settotal(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
