
package Modelo;


public class Producto {
    int idProducto;
    String imagen;
    int valor;
    int cantidad;
    int linea_idLinea;
    int sublinea_idSublinea;
    int perfil_idPerfil;
    int descripcion_producto_idDescripcion;

    public Producto() {
    }

    public Producto(int idProducto, String imagen, int valor, int cantidad, int linea_idLinea ,int sublinea_idSublinea, int perfil_idPerfil, int descripcion_producto_idDescripcion) {
        this.idProducto = idProducto;
        this.imagen = imagen;
        this.valor = valor;
        this.cantidad = cantidad;
        this.linea_idLinea = linea_idLinea;
        this.sublinea_idSublinea = sublinea_idSublinea;
        this.perfil_idPerfil = perfil_idPerfil;
        this.descripcion_producto_idDescripcion = descripcion_producto_idDescripcion;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getlinea_idLinea() {
        return linea_idLinea;
    }

    public void setlinea_idLinea(int linea_idLinea) {
        this.linea_idLinea = linea_idLinea;
    }

    public int getsublinea_idSublinea() {
        return sublinea_idSublinea;
    }

    public void setsublinea_idSublinea(int sublinea_idSublinea) {
        this.sublinea_idSublinea = sublinea_idSublinea;
    }

    public int getperfil_idPerfil() {
        return perfil_idPerfil;
    }

    public void setperfil_idPerfil(int perfil_idPerfil) {
        this.perfil_idPerfil = perfil_idPerfil;
    }

    public int getdescripcion_producto_idDescripcion() {
        return descripcion_producto_idDescripcion;
    }

    public void setdescripcion_producto_idDescripcion(int descripcion_producto_idDescripcion) {
        this.descripcion_producto_idDescripcion= descripcion_producto_idDescripcion;
    }

    
    
}
