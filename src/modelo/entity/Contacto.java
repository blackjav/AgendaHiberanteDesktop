/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.entity;

/**
 *
 * @author javs
 */
public class Contacto {
    
    //Atributos
    private int id;
    private String nombre;
    private String apellido;
    private String numero;
    private String descripcion;

    public Contacto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Contacto{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", numero=" + numero + ", descripcion=" + descripcion + '}';
    }
    
    
}