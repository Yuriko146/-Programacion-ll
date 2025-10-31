/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica5;

/**
 *
 * @author USUARIO
 */
public class Prestamo {
    private String fechaPrestamo;
    private String fechaDevolucion;
    private Estudiante estudiante;
    private Libro libro;
    
    public Prestamo(Estudiante estudiante, Libro libro, String fechaPrestamo, String fechaDevolucion) {
        this.estudiante = estudiante;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }
    
    public void mostrarInfo() {
        System.out.println("\nPRESTAMO:");
        System.out.println("  Estudiante: " + estudiante.getNombre() + " (" + estudiante.getCodigo() + ")");
        System.out.println("  Libro: " + libro.getTitulo());
        System.out.println("  Fecha prestamo: " + fechaPrestamo);
        System.out.println("  Fecha devolucion: " + fechaDevolucion);
    }
}
