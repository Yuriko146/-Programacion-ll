/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

/**
 *
 * @author USUARIO
 */
public class SistemaVectorial {
    public static void main(String[] args) {
        System.out.println("=== OPERACIONES VECTORIALES ===\n");
        
        // Vectores de ejemplo
        Vector3D a = new Vector3D(3, 4, 0);
        Vector3D b = new Vector3D(-4, 3, 0);
        
        System.out.println("Vector a: " + a);
        System.out.println("Vector b: " + b + "\n");
        
        // Todas las operaciones del enunciado
        System.out.println("OPERACIONES:");
        System.out.println("a) Suma:           a + b = " + a.suma(b));
        System.out.println("b) Escalar:        2 * a = " + a.multiplicarEscalar(2));
        System.out.println("c) Longitud:       |a| = " + String.format("%.2f", a.longitud()));
        System.out.println("d) Unitario:       â = " + a.normal());
        System.out.println("e) Prod. escalar:  a·b = " + a.productoEscalar(b));
        System.out.println("f) Prod. vectorial: a×b = " + a.productoVectorial(b) + "\n");
        
        // Análisis geométrico
        System.out.println("ANÁLISIS:");
        System.out.println("¿Perpendiculares? " + (a.esPerpendicular(b) ? "SÍ" : "NO"));
        System.out.println("¿Forman rectángulo? " + (a.esPerpendicular(b) ? "SÍ" : "NO"));
        System.out.println("Área paralelogramo: " + String.format("%.2f", a.areaParalelogramo(b)));
        
        // Ejemplo adicional
        System.out.println("\n=== EJEMPLO 2 (Vectores 3D) ===");
        Vector3D u = new Vector3D(1, 2, 3);
        Vector3D v = new Vector3D(4, -1, 2);
        
        System.out.println("u = " + u + ", v = " + v);
        System.out.println("u + v = " + u.suma(v));
        System.out.println("u·v = " + u.productoEscalar(v));
        System.out.println("u×v = " + u.productoVectorial(v));
        System.out.println("¿Perpendiculares? " + (u.esPerpendicular(v) ? "SÍ" : "NO"));
    }
}