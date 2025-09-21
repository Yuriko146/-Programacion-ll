/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3_1;

/**
 *
 * @author USUARIO
 */
public class JuegoAdivinaPar extends JuegoAdivinaNumero {
    
    // Constructor
    public JuegoAdivinaPar(int numeroDeVidas) {
        super(numeroDeVidas);
        System.out.println("¡Juego de adivinar número PAR iniciado!");
    }
    
    // Redefine el método validaNumero para validar números pares
    @Override
    public boolean validaNumero(int numero) {
        if (numero < 0 || numero > 10) {
            System.out.println("Error: El número debe estar entre 0 y 10");
            return false;
        }
        if (numero % 2 != 0) {
            System.out.println("Error: El número debe ser PAR");
            return false;
        }
        return true;
    }
}
