
package Modelo;


public class DescripcionProducto {
    int idDescripcion;
    int titulo;
    int descripcion;
    int requisitosMinimos;
    int requisitosRecomendados;
    
    public DescripcionProducto () {
        }

    public DescripcionProducto(int idDescripcion, int titulo, int descripcion, int requisitosMinimos, int requisitosRecomendados) {
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

    public int getTitulo() {
        return titulo;
    }

    public void setTitulo(int titulo) {
        this.titulo = titulo;
    }

    public int getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
    }

    public int getRequisitosMinimos() {
        return requisitosMinimos;
    }

    public void setRequisitosMinimos(int requisitosMinimos) {
        this.requisitosMinimos = requisitosMinimos;
    }

    public int getRequisitosRecomendados() {
        return requisitosRecomendados;
    }

    public void setRequisitosRecomendados(int requisitosRecomendados) {
        this.requisitosRecomendados = requisitosRecomendados;
    }
    
    
}
