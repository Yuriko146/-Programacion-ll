/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Circulo2D;

/**
 *
 * @author USUARIO
 */
public class PruebaCirculo2D {
    public static void main(String[] args) {
        // Crear objeto c1 = Circulo2D(2, 0, 1)
        Circulo2D c1 = new Circulo2D(2, 0, 1);
        
        System.out.println("=== PRUEBAS CON CÍRCULO c1 ===");
        System.out.println("Círculo c1: " + c1);
        System.out.printf("Área de c1: %.2f%n", c1.getArea());
        System.out.printf("Perímetro de c1: %.2f%n", c1.getPerimetro());
        
        // Probar contiene(2.5, 0)
        boolean contieneP1 = c1.contiene(2.5, 0);
        System.out.printf("¿c1 contiene el punto (2.5, 0)? %s%n", contieneP1);
        
        // Crear otro círculo para las pruebas
        Circulo2D c2 = new Circulo2D(1.5, 0, 0.3);
        System.out.println("\n=== PRUEBAS CON CÍRCULO c2 ===");
        System.out.println("Círculo c2: " + c2);
        
        // Probar si c1 contiene a c2
        boolean contieneC2 = c1.contiene(c2);
        System.out.printf("¿c1 contiene completamente a c2? %s%n", contieneC2);
        
        // Probar si c1 se sobrepone con c2
        boolean sobreponeC2 = c1.sobrepone(c2);
        System.out.printf("¿c1 se sobrepone con c2? %s%n", sobreponeC2);
        
        // Crear un círculo que no se sobrepone
        Circulo2D c3 = new Circulo2D(5, 0, 1);
        System.out.println("\n=== PRUEBAS CON CÍRCULO c3 ===");
        System.out.println("Círculo c3: " + c3);
        
        boolean sobreponeC3 = c1.sobrepone(c3);
        System.out.printf("¿c1 se sobrepone con c3? %s%n", sobreponeC3);
        
        // Pruebas adicionales según la figura del documento
        System.out.println("\n=== PRUEBAS ADICIONALES ===");
        
        // Prueba punto fuera del círculo
        boolean contieneP2 = c1.contiene(4, 0);
        System.out.printf("¿c1 contiene el punto (4, 0)? %s%n", contieneP2);
        
        // Crear círculo que toca externamente
        Circulo2D c4 = new Circulo2D(4, 0, 1);
        boolean sobreponeC4 = c1.sobrepone(c4);
        System.out.printf("¿c1 se sobrepone con círculo en (4,0) radio 1? %s%n", sobreponeC4);
    }
}

