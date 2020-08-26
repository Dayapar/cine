/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Mizaki
 */
public class Usuario {
    private long idusuario;
    private String nombre;
    private String apellido;
    private String d_identificacion; 
    private long telefono;
    private String email;
    private String f_nacimiento;

    public Usuario(long idusuario, String nombre, String apellido, String d_identificacion, long telefono, String email, String f_nacimiento) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.d_identificacion = d_identificacion;
        this.telefono = telefono;
        this.email = email;
        this.f_nacimiento = f_nacimiento;
    }

    public Usuario() {
    }
    
    public long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(long idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getD_identificacion() {
        return d_identificacion;
    }

    public void setD_identificacion(String d_identificacion) {
        this.d_identificacion = d_identificacion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(String f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }
   
    public int get(int DATE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
