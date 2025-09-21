/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3_1;

/**
 *
 * @author USUARIO
 */
public class JuegoAdivinaNumero extends Juego {
    // Atributo específico de la clase hija
    private int numeroAAdivinar;
    
    // Constructor que recibe el número de vidas
    public JuegoAdivinaNumero(int numeroDeVidas) {
        // Llama al constructor de la clase padre con vidas y record=0
        super(numeroDeVidas, 0);
        // Genera un número aleatorio entre 0 y 10
        this.numeroAAdivinar = (int)(Math.random() * 11);
        System.out.println("¡Juego de adivinar número iniciado! Adivina el número entre 0 y 10");
    }
    
    // Getter para numeroAAdivinar
    public int getNumeroAAdivinar() {
        return numeroAAdivinar;
    }
    
    // Método validaNumero - valida si el número está entre 0 y 10
    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }
    
    // Método juega que implementa la lógica del juego
    public void juega() {
        // Llama al método reiniciaPartida heredado
        reiniciaPartida();
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        boolean juegoTerminado = false;
        
        while (!juegoTerminado && getNumeroDeVidas() > 0) {
            System.out.print("Introduce un número entre 0 y 10: ");
            int numeroUsuario = scanner.nextInt();
            
            // Utiliza validaNumero para validar la entrada
            if (!validaNumero(numeroUsuario)) {
                System.out.println("Número inválido. Debe estar entre 0 y 10.");
                continue;
            }
            
            // Lee el número del usuario y lo compara con el número generado
            if (numeroUsuario == numeroAAdivinar) {
                // Si es igual, muestra "Acertaste!!" y llama a actualizaRecord
                System.out.println("¡¡Acertaste!!");
                actualizaRecord();
                juegoTerminado = true;
            } else {
                // Si es diferente, llama al método quitaVida heredado
                quitaVida();
                
                if (getNumeroDeVidas() > 0) {
                    if (numeroUsuario < numeroAAdivinar) {
                        System.out.println("El número es mayor");
                    } else {
                        System.out.println("El número es menor");
                    }
                    System.out.println("Intenta de nuevo");
                } else {
                    System.out.println("¡Game Over! El número era: " + numeroAAdivinar);
                    juegoTerminado = true;
                }
            }
        }
    }
}