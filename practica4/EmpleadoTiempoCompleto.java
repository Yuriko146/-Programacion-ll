/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 *
 * @author USUARIO
 */
public class EmpleadoTiempoCompleto extends Empleado {
    private double salario_anual;
    
    // Constructor
    public EmpleadoTiempoCompleto(String nombre, double salario_anual) {
        super(nombre);
        this.salario_anual = salario_anual;
    }
    
    // Implementación del método abstracto
    @Override
    public double CalcularSalarioMensual() {
        return salario_anual / 12.0;
    }
    
    // Sobrescritura del método toString
    @Override
    public String toString() {
        return "Empleado Tiempo Completo: " + nombre + 
               "\nSalario Anual: $" + String.format("%.2f", salario_anual) +
               "\nSalario Mensual: $" + String.format("%.2f", CalcularSalarioMensual());
    }
}