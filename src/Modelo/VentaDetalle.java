
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    
    
}
