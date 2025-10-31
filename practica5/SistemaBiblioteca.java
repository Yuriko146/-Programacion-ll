/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica5;

/**
 *
 * @author USUARIO
 */
public class SistemaBiblioteca {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("SISTEMA DE BIBLIOTECA UNIVERSITARIA");
        System.out.println("Universidad Mayor de San Andres");
        System.out.println("========================================\n");
        
        // Crear biblioteca (CLASE PRINCIPAL)
        System.out.println("Creando biblioteca...");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central UMSA", "Lunes a Viernes", "08:00", "20:00");
        
        // Crear libros
        System.out.println("\nCreando libros...");
        Libro libro1 = new Libro("Programacion en Java", "978-1234567890");
        libro1.agregarPagina(1, "Introduccion a Java");
        libro1.agregarPagina(2, "Clases y Objetos");
        libro1.agregarPagina(3, "Herencia y Polimorfismo");
        
        Libro libro2 = new Libro("Estructuras de Datos", "978-0987654321");
        libro2.agregarPagina(1, "Listas enlazadas");
        libro2.agregarPagina(2, "Arboles binarios");
        
        // Agregar libros a biblioteca (AGREGACION)
        System.out.println("\nAgregando libros a biblioteca (AGREGACION)...");
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        
        // Crear autores
        System.out.println("\nCreando autores...");
        Autor autor1 = new Autor("Carlos Perez", "Boliviano");
        Autor autor2 = new Autor("Maria Gonzalez", "Argentina");
        
        // Agregar autores a biblioteca (AGREGACION)
        System.out.println("\nRegistrando autores (AGREGACION)...");
        biblioteca.agregarAutor(autor1);
        biblioteca.agregarAutor(autor2);
        
        // Crear estudiantes
        System.out.println("\nCreando estudiantes...");
        Estudiante est1 = new Estudiante("EST001", "Juan Quispe");
        Estudiante est2 = new Estudiante("EST002", "Ana Mamani");
        
        // Crear prestamos (ASOCIACION)
        System.out.println("\nCreando prestamos (ASOCIACION)...");
        biblioteca.prestarLibro(est1, libro1, "28/10/2025", "04/11/2025");
        biblioteca.prestarLibro(est2, libro2, "28/10/2025", "11/11/2025");
        
        // Mostrar estado de biblioteca
        biblioteca.mostrarEstado();
        
        // Leer libro
        System.out.println("\n========================================");
        System.out.println("LEYENDO UN LIBRO");
        System.out.println("========================================");
        libro1.leer();
        
        // Explicacion de relaciones
        System.out.println("\n========================================");
        System.out.println("TIPOS DE RELACIONES");
        System.out.println("========================================");
        
        System.out.println("\n1. COMPOSICION:");
        System.out.println("   Biblioteca -> Horario");
        System.out.println("   Libro -> Pagina");
        System.out.println("   (Si se destruye el todo, se destruyen las partes)");
        
        System.out.println("\n2. AGREGACION:");
        System.out.println("   Biblioteca -> Libro");
        System.out.println("   Biblioteca -> Autor");
        System.out.println("   (Las partes pueden existir sin el todo)");
        
        System.out.println("\n3. ASOCIACION:");
        System.out.println("   Prestamo -> Estudiante");
        System.out.println("   Prestamo -> Libro");
        System.out.println("   (Relacion temporal entre objetos)");
        
        // Cerrar biblioteca
        System.out.println("\n========================================");
        biblioteca.cerrarBiblioteca();
        
        System.out.println("\nDespues de cerrar biblioteca:");
        System.out.println("Los estudiantes siguen existiendo:");
        est1.mostrarInfo();
        est2.mostrarInfo();
        
        System.out.println("\nLos libros siguen existiendo:");
        System.out.println("- " + libro1.getTitulo());
        System.out.println("- " + libro2.getTitulo());
        
        System.out.println("\nLos autores siguen existiendo:");
        autor1.mostrarInfo();
        autor2.mostrarInfo();
    }
}
