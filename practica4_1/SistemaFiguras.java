/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4_1;

import java.util.Random;

/**
 *
 * @author USUARIO
 */
public class SistemaFiguras {
    public static void main(String[] args) {
        Random random = new Random();
        
        // f) Crear arreglo para cinco figuras
        Figura[] figuras = new Figura[5];
        
        // Generar figuras aleatorias (1-Cuadrado, 2-Círculo)
        String[] colores = {"Rojo", "Azul", "Verde", "Amarillo", "Morado", "Naranja"};
        
        System.out.println("=== GENERACIÓN ALEATORIA DE FIGURAS ===\n");
        
        for (int i = 0; i < figuras.length; i++) {
            int tipoFigura = random.nextInt(2) + 1; // 1 o 2
            String colorAleatorio = colores[random.nextInt(colores.length)];
            
            if (tipoFigura == 1) {
                // Crear Cuadrado
                double lado = random.nextDouble() * 10 + 1; // lado entre 1 y 11
                figuras[i] = new Cuadrado(colorAleatorio, lado);
                System.out.println("Figura " + (i+1) + ": Cuadrado generado");
            } else {
                // Crear Círculo
                double radio = random.nextDouble() * 8 + 1; // radio entre 1 y 9
                figuras[i] = new Circulo(colorAleatorio, radio);
                System.out.println("Figura " + (i+1) + ": Círculo generado");
            }
        }
        
        System.out.println("\n=== INFORMACIÓN DETALLADA DE LAS FIGURAS ===\n");
        
        // g) Mostrar información de cada figura
        for (int i = 0; i < figuras.length; i++) {
            System.out.println("FIGURA " + (i+1) + ":");
            System.out.println(figuras[i].toString());
            
            // Invocar comoColorear si la figura implementa Coloreado
            if (figuras[i] instanceof Coloreado) {
                Coloreado figuraColoreada = (Coloreado) figuras[i];
                System.out.println("  *** " + figuraColoreada.comoColorear() + " ***");
            }
            
            System.out.println("----------------------------------------");
        }
        
        // Estadísticas adicionales
        System.out.println("\n=== ESTADÍSTICAS ===");
        
        double areaTotal = 0;
        double perimetroTotal = 0;
        int cuadrados = 0;
        int circulos = 0;
        
        for (Figura figura : figuras) {
            areaTotal += figura.area();
            perimetroTotal += figura.perimetro();
            
            if (figura instanceof Cuadrado) {
                cuadrados++;
            } else if (figura instanceof Circulo) {
                circulos++;
            }
        }
        
        System.out.println("Total de figuras: " + figuras.length);
        System.out.println("Cuadrados: " + cuadrados);
        System.out.println("Círculos: " + circulos);
        System.out.println("Área total: " + String.format("%.2f", areaTotal));
        System.out.println("Perímetro total: " + String.format("%.2f", perimetroTotal));
        System.out.println("Área promedio: " + String.format("%.2f", areaTotal / figuras.length));
        System.out.println("Perímetro promedio: " + String.format("%.2f", perimetroTotal / figuras.length));
    }
}