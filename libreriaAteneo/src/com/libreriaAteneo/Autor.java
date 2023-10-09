/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libreriaAteneo;

/**
 *
 * @author Yarod
 */
public class Autor {
    
    //Atributos
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private String rut;
    
    
    //Constructores
    public Autor() {
    }

    public Autor(String nombre, String apellido, String nacionalidad, String rut) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.rut = rut;
    }
    
    
    //Getters y Setters
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    
    //Customer
    
    public void mostrarInfo(){
        System.out.println("Nombre: " +  this.nombre + "\n Apellido: " + this.apellido + "\n Nacionalidad: " +this.nacionalidad + "\n RUT: " + this.rut);
    }
    
    
}
