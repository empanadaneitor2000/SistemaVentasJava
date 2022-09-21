
package Modelo;


public class EntidadVendedor {
    int idU;
    String img;
    String nom;
    String ape;
    String fechaNacimiento;
    String cont;
    String doc;
    int estado_idEstado;
    int datos_contacto_idContcto;
    int tipo_documento_idDocumento;

    public EntidadVendedor() {
    }

    public EntidadVendedor(int idU, String img, String nom, String ape, String fechaNacimiento, String cont, String doc, int estado_idEstado, int datos_contacto_idContcto, int tipo_documento_idDocumento) {
        this.idU = idU;
        this.img = img;
        this.nom = nom;
        this.ape = ape;
        this.fechaNacimiento = fechaNacimiento;
        this.cont = cont;
        this.doc = doc;
        this.estado_idEstado = estado_idEstado;
        this.datos_contacto_idContcto = datos_contacto_idContcto;
        this.tipo_documento_idDocumento = tipo_documento_idDocumento;
    }

    public int getIdU() {
        return idU;
    }

    public void setIdU(int idU) {
        this.idU = idU;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public int getEstado_idEstado() {
        return estado_idEstado;
    }

    public void setEstado_idEstado(int estado_idEstado) {
        this.estado_idEstado = estado_idEstado;
    }

    public int getDatos_contacto_idContcto() {
        return datos_contacto_idContcto;
    }

    public void setDatos_contacto_idContcto(int datos_contacto_idContcto) {
        this.datos_contacto_idContcto = datos_contacto_idContcto;
    }

    public int getTipo_documento_idDocumento() {
        return tipo_documento_idDocumento;
    }

    public void setTipo_documento_idDocumento(int tipo_documento_idDocumento) {
        this.tipo_documento_idDocumento = tipo_documento_idDocumento;
    }
    
    
    
    
    

   
   

   
    
    
}
