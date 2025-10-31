/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica5;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author USUARIO
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> librosDisponibles;
    private List<Autor> autoresRegistrados;
    private List<Prestamo> prestamosActivos;
    private Horario horarioAtencion;
    
    public Biblioteca(String nombre, String dias, String horaApertura, String horaCierre) {
        this.nombre = nombre;
        this.librosDisponibles = new ArrayList<>();
        this.autoresRegistrados = new ArrayList<>();
        this.prestamosActivos = new ArrayList<>();
        this.horarioAtencion = new Horario(dias, horaApertura, horaCierre);
    }
    
    public void agregarLibro(Libro libro) {
        librosDisponibles.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }
    
    public void agregarAutor(Autor autor) {
        autoresRegistrados.add(autor);
        System.out.println("Autor registrado: " + autor.getNombre());
    }
    
    public void prestarLibro(Estudiante estudiante, Libro libro, String fechaPrestamo, String fechaDevolucion) {
        Prestamo prestamo = new Prestamo(estudiante, libro, fechaPrestamo, fechaDevolucion);
        prestamosActivos.add(prestamo);
        System.out.println("Prestamo creado para " + estudiante.getNombre());
    }
    
    public void mostrarEstado() {
        System.out.println("\n========================================");
        System.out.println("BIBLIOTECA: " + nombre);
        System.out.println("========================================");
        
        System.out.println("\n--- HORARIO DE ATENCION ---");
        horarioAtencion.mostrarHorario();
        
        System.out.println("\n--- LIBROS DISPONIBLES ---");
        for (Libro libro : librosDisponibles) {
            System.out.println("- " + libro.getTitulo() + " (ISBN: " + libro.getIsbn() + ")");
        }
        
        System.out.println("\n--- AUTORES REGISTRADOS ---");
        for (Autor autor : autoresRegistrados) {
            autor.mostrarInfo();
        }
        
        System.out.println("\n--- PRESTAMOS ACTIVOS ---");
        for (Prestamo prestamo : prestamosActivos) {
            prestamo.mostrarInfo();
        }
    }
    
    public void cerrarBiblioteca() {
        System.out.println("\nCERRANDO BIBLIOTECA: " + nombre);
        System.out.println("El horario desaparece (COMPOSICION)");
        System.out.println("Los libros, autores y estudiantes siguen existiendo (AGREGACION)");
    }
}

