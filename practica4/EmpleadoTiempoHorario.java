/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 *
 * @author USUARIO
 */
public class EmpleadoTiempoHorario extends Empleado {
    private int horas_trabajadas;
    private double tarifa_por_hora;
    
    // Constructor
    public EmpleadoTiempoHorario(String nombre, int horas_trabajadas, double tarifa_por_hora) {
        super(nombre);
        this.horas_trabajadas = horas_trabajadas;
        this.tarifa_por_hora = tarifa_por_hora;
    }
    
    // Implementación del método abstracto
    @Override
    public double CalcularSalarioMensual() {
        return horas_trabajadas * tarifa_por_hora;
    }
    
    // Sobrescritura del método toString
    @Override
    public String toString() {
        return "Empleado Tiempo Horario: " + nombre + 
               "\nHoras Trabajadas: " + horas_trabajadas +
               "\nTarifa por Hora: $" + String.format("%.2f", tarifa_por_hora) +
               "\nSalario Mensual: $" + String.format("%.2f", CalcularSalarioMensual());
    }
}
