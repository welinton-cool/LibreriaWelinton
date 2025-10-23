/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ec.libreriasaconc.bibliografiaSaconC;

import ec.edu.ec.libreriasaconc.bibliografiaSaconC.Libros.Libro;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Biblioteca {
   

    private Autor[] autores;                 // Estructura estática
    private ArrayList<Libro> libros;         // Estructura dinámica

    // Constructor
    public Biblioteca() {
        // Inicializamos 5 autores de manera estática
        autores = new Autor[5];
        autores[0] = new Autor("Welinton Sacon", "Ecuador");
        autores[1] = new Autor("Mario Vargas Llosa", "Perú");
        autores[2] = new Autor("Isabel Allende", "Chile");
        autores[3] = new Autor("Jorge Luis Borges", "Argentina");
        autores[4] = new Autor("Octavio Paz", "México");

        // Inicializamos la lista dinámica de libros
        libros = new ArrayList<>();
    }

    // Método para obtener un autor por índice
    public Autor getAutor(int indice) {
        if (indice >= 0 && indice < autores.length) {
            return autores[indice];
        }
        return null;
    }

    // Método para agregar libro
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("📘 Libro agregado correctamente: " + libro.getTitulo());
    }

    // Mostrar todos los autores
    public void mostrarAutores() {
        System.out.println("\n=== AUTORES DISPONIBLES ===");
        for (int i = 0; i < autores.length; i++) {
            System.out.println(i + ". " + autores[i]);
        }
    }

    // Mostrar todos los libros
    public void mostrarLibros() {
        System.out.println("\n=== CATÁLOGO DE LIBROS ===");
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados aún.");
        } else {
            for (Libro libro : libros) {
                libro.mostrarLibro();
            }
        }
    }
}


