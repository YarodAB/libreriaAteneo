/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libreriaAteneo;
import java.util.ArrayList;
/**
 *
 * @author Yarod
 */
public class Catalogo {
    private ArrayList<Libro> catalogo;

    public Catalogo() {
        this.catalogo = new ArrayList<>();
    }

    public ArrayList<Libro> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList<Libro> catalogo) {
        this.catalogo = catalogo;
    }
    
    //Metodo
    
    public boolean agregaLibro(Libro libro){
        return this.catalogo.add(libro);
    }
    
    public void mostrarCatalogo(){
        for (Libro libro : catalogo) {
            libro.imprimirInfo();
        }
    }
    
    
    public boolean eliminarLibroIsbn(String isbn){
        for (Libro libro : catalogo) {
            if(libro.getIsbn().equalsIgnoreCase(isbn)){
                System.out.println("Libro con ISBN " + isbn + " Eliminado con exito" );
                return this.catalogo.remove(libro);
            }
        }        
        
        System.out.println("ISBN no encontrado");
        return false;
    }
    
    public boolean buscarLibroNombre(String nombre){
        for (Libro libro : catalogo) {
            if(libro.getAutor().getNombre().equalsIgnoreCase(nombre)){
               libro.imprimirInfo();
               System.out.println("------------------------");
               return true;
            }
        }        
        
        System.out.println("Autor no encontrado o no posee libros");
        return false;
        
    }    
}
