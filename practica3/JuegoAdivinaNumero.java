/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

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
        System.out.println("¡Juego iniciado! Adivina el número entre 0 y 10");
    }
    
    // Getter para numeroAAdivinar
    public int getNumeroAAdivinar() {
        return numeroAAdivinar;
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
                    // Si el método quitaVida devuelve true, significa que aún le quedan vidas
                    if (numeroUsuario < numeroAAdivinar) {
                        System.out.println("El número es mayor");
                    } else {
                        System.out.println("El número es menor");
                    }
                    System.out.println("Intenta de nuevo");
                } else {
                    // Si el método quitaVida devuelve false, significa que ya no le quedan más vidas
                    System.out.println("¡Game Over! El número era: " + numeroAAdivinar);
                    juegoTerminado = true;
                }
            }
        }
    }
}
