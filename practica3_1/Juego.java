/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3_1;

/**
 *
 * @author USUARIO
 */
public class Juego {
    // Atributos
    private int numeroDeVidas;
    private int record;
    
    // Constructor
    public Juego(int numeroDeVidas, int record) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = record;
    }
    
    // Métodos getter y setter
    public int getNumeroDeVidas() {
        return numeroDeVidas;
    }
    
    public void setNumeroDeVidas(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
    }
    
    public int getRecord() {
        return record;
    }
    
    public void setRecord(int record) {
        this.record = record;
    }
    
    // Método reiniciaPartida
    public void reiniciaPartida() {
        System.out.println("Partida reiniciada");
    }
    
    // Método actualizaRecord
    public void actualizaRecord() {
        System.out.println("Record actualizado");
    }
    
    // Método quitaVida
    public void quitaVida() {
        if (numeroDeVidas > 0) {
            numeroDeVidas--;
            System.out.println("Vida perdida. Vidas restantes: " + numeroDeVidas);
        } else {
            System.out.println("No quedan vidas");
        }
    }
    
    // Método toString para mostrar información
    @Override
    public String toString() {
        return "Vidas: " + numeroDeVidas + ", Record: " + record;
    }
}
