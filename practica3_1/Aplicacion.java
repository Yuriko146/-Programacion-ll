/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3_1;

/**
 *
 * @author USUARIO
 */
public class Aplicacion {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE JUEGOS ===\n");
        
        // Crear una instancia de cada uno de los tres juegos con 3 vidas cada uno
        JuegoAdivinaNumero juegoNumero = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juegoImpar = new JuegoAdivinaImpar(3);
        
        // Llamar al método juega de cada una de las tres instancias
        System.out.println("\n--- JUEGO 1: ADIVINAR CUALQUIER NÚMERO ---");
        juegoNumero.juega();
        
        System.out.println("\n--- JUEGO 2: ADIVINAR NÚMERO PAR ---");
        juegoPar.juega();
        
        System.out.println("\n--- JUEGO 3: ADIVINAR NÚMERO IMPAR ---");
        juegoImpar.juega();
        
        System.out.println("\n¡Gracias por jugar a todos los juegos!");
    }
}