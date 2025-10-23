
package ec.edu.ec.libreriasaconc.bibliografiaSaconC;


public class Libros {
    public class Libro {
    private String titulo;
    private Autor autor;     // Asociación con la clase Autor
    private String genero;
    private double precio;

    // Constructor
    public Libro(String titulo, Autor autor, String genero, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.precio = precio;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public double getPrecio() {
        return precio;
    }

    // Método para mostrar datos del libro
    public void mostrarLibro() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor.getNombre());
        System.out.println("Género: " + genero);
        System.out.println("Precio: $" + precio);
        System.out.println("---------------------------");
    }

    @Override
    public String toString() {
        return "Título: " + titulo + " | Autor: " + autor.getNombre() +
               " | Género: " + genero + " | Precio: $" + precio;
    }
}

}
