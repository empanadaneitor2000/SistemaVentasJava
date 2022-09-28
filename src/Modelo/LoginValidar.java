/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author 57310
 */
public class LoginValidar {
        int idContacto ;
        int telefono ;
        String direccion;	
        String email; 	
        int ciudad_idCiudad ;
        String password;

    public LoginValidar() {
    }

    public LoginValidar(int idContacto, int telefono, String direccion, String email,  int ciudad_idCiudad, String password) {
        this.idContacto = idContacto;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        
        this.ciudad_idCiudad = ciudad_idCiudad;
        this.password = password;
    }

    public int getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(int idContacto) {
        this.idContacto = idContacto;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCiudad_idCiudad() {
        return ciudad_idCiudad;
    }

    public void setCiudad_idCiudad(int ciudad_idCiudad) {
        this.ciudad_idCiudad = ciudad_idCiudad;
    }

    public String getPassword() {
     return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

}
