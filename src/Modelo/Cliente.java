
package Modelo;


public class Cliente {
    int idUsuario;
    String imagen;
    String nombres;
    String apellidos;
    String fechaNacimiento;
    int documento;
    int estado_idEstado;
    int datos_contacto_idContacto;
    int tipo_documento_idDocumento;

    public Cliente() {
    }

    public Cliente(int idUsuario, String imagen, String nombres, String fechaNacimiento, int documento, int estado_idEstado, int datos_contacto_idContacto, int tipo_documento_idDocumento) {
        this.idUsuario = idUsuario;
        this.imagen = imagen;
        this.nombres = nombres;
        this.fechaNacimiento = fechaNacimiento;
        this.documento = documento;
        this.estado_idEstado = estado_idEstado;
        this.datos_contacto_idContacto = datos_contacto_idContacto;
        this.tipo_documento_idDocumento = tipo_documento_idDocumento;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getEstado_idEstado() {
        return estado_idEstado;
    }

    public void setEstado_idEstado(int estado_idEstado) {
        this.estado_idEstado = estado_idEstado;
    }

    public int getDatos_contacto_idContacto() {
        return datos_contacto_idContacto;
    }

    public void setDatos_contacto_idContacto(int datos_contacto_idContacto) {
        this.datos_contacto_idContacto = datos_contacto_idContacto;
    }

    public int getTipo_documento_idDocumento() {
        return tipo_documento_idDocumento;
    }

    public void setTipo_documento_idDocumento(int tipo_documento_idDocumento) {
        this.tipo_documento_idDocumento = tipo_documento_idDocumento;
    }
    
    
    
}
