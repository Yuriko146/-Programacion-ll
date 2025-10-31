/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica5;

/**
 *
 * @author USUARIO
 */
public class Pagina {
    private int numeroPagina;
    private String contenido;
    
    public Pagina(int numeroPagina, String contenido) {
        this.numeroPagina = numeroPagina;
        this.contenido = contenido;
    }
    
    public void mostrarHorario() {
        System.out.println("  Pagina " + numeroPagina + ": " + contenido);
    }
}
