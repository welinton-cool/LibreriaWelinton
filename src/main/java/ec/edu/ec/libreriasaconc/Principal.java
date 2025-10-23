/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ec.libreriasaconc;

import ec.edu.ec.libreriasaconc.bibliografiaSaconC.Autor;
import ec.edu.ec.libreriasaconc.bibliografiaSaconC.Biblioteca;
import ec.edu.ec.libreriasaconc.bibliografiaSaconC.Libros;
import java.util.Scanner;



public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca(); // Instancia de la clase Biblioteca
        int opcion;

        do {
            System.out.println("biblioteca");
            System.out.println("1. Mostrar ");
            System.out.println("2. Agregar libro");
            System.out.println("3. Mostrar todos los libros");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar el buffer

            switch (opcion) {
                case 1:
                    biblioteca.mostrarAutores();
                    break;

                case 2:
                    biblioteca.mostrarAutores();
                    System.out.print("Seleccione el índice del autor: ");
                    int indice = sc.nextInt();
                    sc.nextLine();

                    Autor autor = biblioteca.getAutor(indice);
                    if (autor == null) {
                        System.out.println("⚠️ Autor no válido.");
                        break;
                    }

                    System.out.print("Ingrese el título del libro: ");
                    String titulo = sc.nextLine();

                    System.out.print("Ingrese el género: ");
                    String genero = sc.nextLine();

                    System.out.print("Ingrese el precio: ");
                    double precio = sc.nextDouble();

                    Libros libros = new Libros(titulo, autor, genero, precio);
                {
                   
                 
                }
                    break;


                case 3:
                    biblioteca.mostrarLibros();
                    break;

                case 4:
                    System.out.println("📚 ¡Gracias por usar el sistema de biblioteca!");
                    break;

                default:
                    System.out.println("⚠️ Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);

        sc.close();
    }
}

