/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libreriaAteneo;

import java.util.Scanner;

/**
 *
 * @author Yarod
 */
public class Main {
    public static void main(String[] args) {
        Catalogo cat = new Catalogo();
        Scanner scan = new Scanner(System.in);
        
        //A este mismo ejercicio podria agregar que cada libro de cada autor se vaya a una lista de libros del autor
        System.out.println("1) AÑADIR LIBRO");
        System.out.println("2) MOSTRAR CATALOGO");
        System.out.println("3) BUSCAR LIBRO POR NOMBRE AUTOR");
        System.out.println("4) ELIMINAR LIBRO POR ISBN");
        System.out.println("5) SALIR");
        System.out.println("");
        System.out.println("SELECCIONA UNA OPCION");
        
        int opcion = scan.nextInt();
        scan.nextLine();
                
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el nombre del autor: ");
                String nombre = scan.nextLine();
                System.out.println("Ingrese el apellido del autor: ");
                String apellido= scan.nextLine();
                System.out.println("Ingrese la nacionalidad del autor: ");
                String nacionalidad = scan.nextLine();
                System.out.println("Ingrese el titulo del libro: ");
                String titulo = scan.nextLine();
                System.out.println("Ingrese el precio del libro: ");
                int precio = scan.nextInt();
                System.out.println("Ingrese el ISBN del libro: ");
                String isbn = scan.nextLine();
                scan.nextLine();
                
                
                Autor autor = new Autor(nombre, apellido, nacionalidad);
                Libro libro = new Libro(titulo, autor, precio, isbn);
                
                cat.agregaLibro(libro);
                break;
            case 2:
                //Mostrar catalogo
                cat.mostrarCatalogo();
                break;
            case 3:
                //Buscar libro por nombre
                System.out.println("Ingrese el nombre del autor a buscar: ");
                String nombreAutor = scan.nextLine();
                cat.buscarLibroNombre(nombreAutor);
                break;
            case 4:
                System.out.println("Ingrese el ISBN del libro a eliminar: ");
                String isbnEliminar = scan.nextLine();
                cat.eliminarLibroIsbn(isbnEliminar);
            case 5:
                System.out.println("Adios!");
                return;
            default:
                throw new AssertionError();
        }

    }
}
