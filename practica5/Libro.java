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
public class Libro {
    private String titulo;
    private String isbn;
    private List<Pagina> paginas;
    
    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.paginas = new ArrayList<Pagina>();
    }
    
    public void agregarPagina(int numero, String contenido) {
        paginas.add(new Pagina(numero, contenido));
    }
    
    public void leer() {
        System.out.println("Libro: " + titulo + " (ISBN: " + isbn + ")");
        for (Pagina pagina : paginas) {
            pagina.mostrarHorario();
        }
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getIsbn() {
        return isbn;
    }
}