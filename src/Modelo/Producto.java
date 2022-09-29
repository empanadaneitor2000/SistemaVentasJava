
package Modelo;


public class Producto {
    int idProducto;
    String imagen;
    int valor;
    int cantidad;
    String linea;
    String sublinea; 
    int descripcion_producto_idDescripcion;
    String titulo;
    String descripcion;
    String requisitosMinimos;
    String requisitosRecomendados;

    public Producto() {
    }

    public Producto(int idProducto, String imagen, int valor, int cantidad, String linea, String sublinea, int descripcion_producto_idDescripcion, String titulo, String descripcion, String requisitosMinimos, String requisitosRecomendados) {
        this.idProducto = idProducto;
        this.imagen = imagen;
        this.valor = valor;
        this.cantidad = cantidad;
        this.linea = linea;
        this.sublinea = sublinea;
        this.descripcion_producto_idDescripcion = descripcion_producto_idDescripcion;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.requisitosMinimos = requisitosMinimos;
        this.requisitosRecomendados = requisitosRecomendados;
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

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getSublinea() {
        return sublinea;
    }

    public void setSublinea(String sublinea) {
        this.sublinea = sublinea;
    }

    public int getDescripcion_producto_idDescripcion() {
        return descripcion_producto_idDescripcion;
    }

    public void setDescripcion_producto_idDescripcion(int descripcion_producto_idDescripcion) {
        this.descripcion_producto_idDescripcion = descripcion_producto_idDescripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRequisitosMinimos() {
        return requisitosMinimos;
    }

    public void setRequisitosMinimos(String requisitosMinimos) {
        this.requisitosMinimos = requisitosMinimos;
    }

    public String getRequisitosRecomendados() {
        return requisitosRecomendados;
    }

    public void setRequisitosRecomendados(String requisitosRecomendados) {
        this.requisitosRecomendados = requisitosRecomendados;
    }
    

   
    
}
