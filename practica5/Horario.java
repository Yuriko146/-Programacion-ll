/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica5;

/**
 *
 * @author USUARIO
 */
public class Horario {
    private String diasApertura;
    private String horaApertura;
    private String horaCierre;
    
    public Horario(String diasApertura, String horaApertura, String horaCierre) {
        this.diasApertura = diasApertura;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
    }
    
    public void mostrarHorario() {
        System.out.println("Horario: " + diasApertura + " de " + horaApertura + " a " + horaCierre);
    }
}
