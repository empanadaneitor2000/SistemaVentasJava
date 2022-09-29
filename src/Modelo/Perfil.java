
package Modelo;


public class Perfil {
    int idPerfil;
    String nombrePerfil;
    int usurio_idUsuario;
    int rol_idRol;
    int documento;
    String rol;

    public Perfil() {
    }

    public Perfil(int idPerfil, String nombrePerfil, int usurio_idUsuario, int rol_idRol, int documento, String rol) {
        this.idPerfil = idPerfil;
        this.nombrePerfil = nombrePerfil;
        this.usurio_idUsuario = usurio_idUsuario;
        this.rol_idRol = rol_idRol;
        this.documento = documento;
        this.rol = rol;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getNombrePerfil() {
        return nombrePerfil;
    }

    public void setNombrePerfil(String nombrePerfil) {
        this.nombrePerfil = nombrePerfil;
    }

    public int getUsurio_idUsuario() {
        return usurio_idUsuario;
    }

    public void setUsurio_idUsuario(int usurio_idUsuario) {
        this.usurio_idUsuario = usurio_idUsuario;
    }

    public int getRol_idRol() {
        return rol_idRol;
    }

    public void setRol_idRol(int rol_idRol) {
        this.rol_idRol = rol_idRol;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    
    
}
