/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3_1;

/**
 *
 * @author USUARIO
 */
public class JuegoAdivinaImpar extends JuegoAdivinaNumero {
    
    // Constructor
    public JuegoAdivinaImpar(int numeroDeVidas) {
        super(numeroDeVidas);
        System.out.println("¡Juego de adivinar número IMPAR iniciado!");
    }
    
    // Redefine el método validaNumero para validar números impares
    @Override
    public boolean validaNumero(int numero) {
        if (numero < 0 || numero > 10) {
            System.out.println("Error: El número debe estar entre 0 y 10");
            return false;
        }
        if (numero % 2 == 0) {
            System.out.println("Error: El número debe ser IMPAR");
            return false;
        }
        return true;
    }
}
