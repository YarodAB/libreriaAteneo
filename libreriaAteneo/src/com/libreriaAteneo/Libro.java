/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libreriaAteneo;

/**
 *
 * @author Yarod
 */
public class Libro {
    
    //Atributos
    private String titulo;
    private Autor autor;
    private int precio;
    private String isbn;

    
    //Constructor Vacio
    public Libro() {
    }

    
    //Constructor con info
    public Libro(String titulo, Autor autor, int precio, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.isbn = isbn;
    }
    
    
    //Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    //Metodos customer
    public void imprimirInfo(){
        System.out.println("Titulo: " +  this.titulo + "\n Autor: " + this.autor + "\n Precio: " +this.precio + "\n ISBN: " + this.isbn);
    }
    
    public double calcularIva(){
       double IVA = 0.19;
       
       return this.precio * IVA;
    
    }
}
