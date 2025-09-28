/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 *
 * @author USUARIO
 */
public class SistemaEmpleados {
    public static void main(String[] args) {
        // Crear arreglo de empleados (polimorfismo)
        Empleado[] empleados = new Empleado[5];
        
        // Crear 3 empleados a tiempo completo
        empleados[0] = new EmpleadoTiempoCompleto("Ana García", 60000.0);
        empleados[1] = new EmpleadoTiempoCompleto("Carlos López", 75000.0);
        empleados[2] = new EmpleadoTiempoCompleto("María Rodríguez", 55000.0);
        
        // Crear 2 empleados de tiempo horario
        empleados[3] = new EmpleadoTiempoHorario("Pedro Martínez", 160, 25.0);
        empleados[4] = new EmpleadoTiempoHorario("Laura Sánchez", 120, 30.0);
        
        // Mostrar información de todos los empleados
        System.out.println("=== INFORMACIÓN DE EMPLEADOS ===\n");
        
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("EMPLEADO " + (i + 1) + ":");
            System.out.println(empleados[i].toString());
            System.out.println("----------------------------------------");
        }
        
        // Calcular y mostrar salario total
        double salarioTotal = 0;
        for (Empleado emp : empleados) {
            salarioTotal += emp.CalcularSalarioMensual();
        }
        
        System.out.println("\nRESUMEN:");
        System.out.println("Total de empleados: " + empleados.length);
        System.out.println("Salario total mensual: $" + String.format("%.2f", salarioTotal));
        System.out.println("Salario promedio mensual: $" + String.format("%.2f", salarioTotal / empleados.length));
    }
}