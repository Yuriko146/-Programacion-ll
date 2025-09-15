/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

/**
 *
 * @author USUARIO
 */
public class AlgebraVectorial {
    
    // a) Perpendicular: |a + b| = |a - b|
    public static boolean perpendicularA(double[] a, double[] b) {
        double[] suma = sumarVectores(a, b);
        double[] resta = restarVectores(a, b);
        double magnitudSuma = magnitudVector(suma);
        double magnitudResta = magnitudVector(resta);
        
        return Math.abs(magnitudSuma - magnitudResta) < 1e-10;
    }
    
    // b) Perpendicular: |a - b| = |b - a|
    public static boolean perpendicularB(double[] a, double[] b) {
        double[] restaAB = restarVectores(a, b);
        double[] restaBA = restarVectores(b, a);
        double magnitudAB = magnitudVector(restaAB);
        double magnitudBA = magnitudVector(restaBA);
        
        return Math.abs(magnitudAB - magnitudBA) < 1e-10;
    }
    
    // c) Perpendicular: a · b = 0
    public static boolean perpendicularC(double[] a, double[] b) {
        double producto = productoEscalar(a, b);
        return Math.abs(producto) < 1e-10;
    }
    
    // d) Perpendicular: |a + b|² = |a|² + |b|²
    public static boolean perpendicularD(double[] a, double[] b) {
        double[] suma = sumarVectores(a, b);
        double magnitudSumaCuadrado = Math.pow(magnitudVector(suma), 2);
        double magnitudACuadrado = Math.pow(magnitudVector(a), 2);
        double magnitudBCuadrado = Math.pow(magnitudVector(b), 2);
        
        return Math.abs(magnitudSumaCuadrado - (magnitudACuadrado + magnitudBCuadrado)) < 1e-10;
    }
    
    // e) Paralela: a = rb
    public static boolean paralelaE(double[] a, double[] b) {
        if (magnitudVector(b) < 1e-10) {
            return magnitudVector(a) < 1e-10;
        }
        
        double r = 0;
        boolean rEncontrado = false;
        
        for (int i = 0; i < b.length; i++) {
            if (Math.abs(b[i]) > 1e-10) {
                r = a[i] / b[i];
                rEncontrado = true;
                break;
            }
        }
        
        if (!rEncontrado) return false;
        
        for (int i = 0; i < a.length; i++) {
            if (Math.abs(a[i] - r * b[i]) > 1e-10) {
                return false;
            }
        }
        
        return true;
    }
    
    // f) Paralela: a × b = 0
    public static boolean paralelaF(double[] a, double[] b) {
        if (a.length != 3 || b.length != 3) {
            throw new IllegalArgumentException("Requiere vectores 3D");
        }
        
        double[] cruz = productoCruz(a, b);
        return magnitudVector(cruz) < 1e-10;
    }
    
    // g) Proyección: Proy_b(a) = (a·b / |b|²) * b
    public static double[] proyeccionDeASobreB(double[] a, double[] b) {
        double productoAB = productoEscalar(a, b);
        double magnitudBCuadrado = Math.pow(magnitudVector(b), 2);
        
        if (magnitudBCuadrado < 1e-10) {
            throw new IllegalArgumentException("Vector b no puede ser cero");
        }
        
        double escalar = productoAB / magnitudBCuadrado;
        return multiplicarEscalar(b, escalar);
    }
    
    // h) Componente: Comp_b(a) = a·b / |b|
    public static double componenteDeAEnB(double[] a, double[] b) {
        double productoAB = productoEscalar(a, b);
        double magnitudB = magnitudVector(b);
        
        if (magnitudB < 1e-10) {
            throw new IllegalArgumentException("Vector b no puede ser cero");
        }
        
        return productoAB / magnitudB;
    }
    
    // Operaciones auxiliares
    private static double[] sumarVectores(double[] a, double[] b) {
        double[] resultado = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            resultado[i] = a[i] + b[i];
        }
        return resultado;
    }
    
    private static double[] restarVectores(double[] a, double[] b) {
        double[] resultado = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            resultado[i] = a[i] - b[i];
        }
        return resultado;
    }
    
    private static double productoEscalar(double[] a, double[] b) {
        double suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma += a[i] * b[i];
        }
        return suma;
    }
    
    private static double[] productoCruz(double[] a, double[] b) {
        double[] resultado = new double[3];
        resultado[0] = a[1] * b[2] - a[2] * b[1];
        resultado[1] = a[2] * b[0] - a[0] * b[2];
        resultado[2] = a[0] * b[1] - a[1] * b[0];
        return resultado;
    }
    
    private static double magnitudVector(double[] vector) {
        double suma = 0;
        for (double componente : vector) {
            suma += componente * componente;
        }
        return Math.sqrt(suma);
    }
    
    private static double[] multiplicarEscalar(double[] vector, double escalar) {
        double[] resultado = new double[vector.length];
        for (int i = 0; i < vector.length; i++) {
            resultado[i] = vector[i] * escalar;
        }
        return resultado;
    }
    
    public static String vectorAString(double[] vector) {
        StringBuilder resultado = new StringBuilder();
        resultado.append("[]");
        for (int i = 0; i < vector.length; i++) {
            resultado.append(String.format("%.3f", vector[i]));
            if (i < vector.length - 1) {
                resultado.append(", ");
            }
        }
        resultado.append("]");
        return resultado.toString();
    }
    
    // Pruebas
    public static void main(String[] args) {
        double[] vectorA = {3, 4, 0};
        double[] vectorB = {4, -3, 0};
        double[] vectorC = {1, 2, 3};
        double[] vectorD = {2, 4, 6};
        
        System.out.println("=== ALGEBRA VECTORIAL ===");
        System.out.println("Vector A: " + vectorAString(vectorA));
        System.out.println("Vector B: " + vectorAString(vectorB));
        System.out.println("Vector C: " + vectorAString(vectorC));
        System.out.println("Vector D: " + vectorAString(vectorD));
        
        System.out.println("\n--- PERPENDICULARIDAD ---");
        System.out.println("A ⊥ B (método a): " + perpendicularA(vectorA, vectorB));
        System.out.println("A ⊥ B (método b): " + perpendicularB(vectorA, vectorB));
        System.out.println("A ⊥ B (método c): " + perpendicularC(vectorA, vectorB));
        System.out.println("A ⊥ B (método d): " + perpendicularD(vectorA, vectorB));
        
        System.out.println("\n--- PARALELISMO ---");
        System.out.println("C || D (método e): " + paralelaE(vectorC, vectorD));
        System.out.println("C || D (método f): " + paralelaF(vectorC, vectorD));
        
        System.out.println("\n--- PROYECCIÓN Y COMPONENTE ---");
        double[] proyeccion = proyeccionDeASobreB(vectorA, vectorB);
        System.out.println("Proyección A sobre B: " + vectorAString(proyeccion));
        System.out.printf("Componente A en B: %.3f%n", componenteDeAEnB(vectorA, vectorB));
        
        System.out.println("\n--- VERIFICACIONES ADICIONALES ---");
        System.out.println("Magnitud de A: " + String.format("%.3f", magnitudVector(vectorA)));
        System.out.println("Producto escalar A·B: " + String.format("%.3f", productoEscalar(vectorA, vectorB)));
    }
}