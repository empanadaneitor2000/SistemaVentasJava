
package Modelo;


public class DescripcionProducto {
    int idDescripcion;
    String titulo;
    String descripcion;
    String requisitosMinimos;
    String requisitosRecomendados;
    
    public DescripcionProducto () {
        }

    public DescripcionProducto(int idDescripcion, String titulo, String descripcion, String requisitosMinimos, String requisitosRecomendados) {
        this.idDescripcion = idDescripcion;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.requisitosMinimos = requisitosMinimos;
        this.requisitosRecomendados = requisitosRecomendados;
    }

    public int getIdDescripcion() {
        return idDescripcion;
    }

    public void setIdDescripcion(int idDescripcion) {
        this.idDescripcion = idDescripcion;
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
