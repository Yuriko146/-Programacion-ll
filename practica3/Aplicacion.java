/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

/**
 *
 * @author USUARIO
 */
public class Aplicacion {
    public static void main(String[] args) {
        // Crea una instancia de JuegoAdivinaNumero con el número de vidas deseado
        JuegoAdivinaNumero juego = new JuegoAdivinaNumero(3);
        
        // Llama al método juega para iniciar el juego
        juego.juega();
        
        System.out.println("\n¡Gracias por jugar!");
    }
}