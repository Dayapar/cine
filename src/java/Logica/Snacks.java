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
public class Snacks {
    private long idsnacks;
    private long precio;
    private long cantidad;
    private String nombre;

    public Snacks(long id,String nombre, long precio, long cantidad) {
        this.idsnacks = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Snacks(long precio, long cantidad, String nombre) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.nombre = nombre;
    }


    public Snacks() {
        //throw new UnsupportedOperationException("Constructor vacio"); //To change body of generated methods, choose Tools | Templates.
    }

    public long getIdsnacks() {
        return idsnacks;
    }

    public void setIdsnacks(long idsnacks) {
        this.idsnacks = idsnacks;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

}
