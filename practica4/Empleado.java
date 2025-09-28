/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 *
 * @author USUARIO
 */
public abstract class Empleado {
    protected String nombre;
    
    // Constructor
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    
    // Método abstracto
    public abstract double CalcularSalarioMensual();
    
    // Método toString
    public String toString() {
        return "Empleado: " + nombre + 
               "\nSalario Mensual: $" + String.format("%.2f", CalcularSalarioMensual());
    }
}
