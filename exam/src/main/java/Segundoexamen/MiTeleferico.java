/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Segundoexamen;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class MiTeleferico {
    private Linea[] lineas;
    private float cantidadIngresos;
    private int cantidadLineas;
    
    public MiTeleferico() {
        this.lineas = new Linea[10]; // Tamaño inicial
        this.cantidadIngresos = 0;
        this.cantidadLineas = 0;
    }
    
    public void agregarPersonaFila(Persona p, String linea) {
        // Método del diagrama
    }
    
    public void agregarCabina(String linea, Cabina cab) {
        // Método del diagrama
        for (int i = 0; i < cantidadLineas; i++) {
            if (lineas[i] != null && lineas[i].getColor().equals(linea)) {
                lineas[i].agregarCabina(cab);
                break;
            }
        }
    }
    
    public void agregarLinea(Linea linea) {
        if (cantidadLineas < lineas.length) {
            lineas[cantidadLineas] = linea;
            cantidadLineas++;
        }
    }
    
    // b) Verificar que todas las cabinas cumplan las reglas de abordo
    public boolean verificarReglasAbordo() {
        System.out.println("\n=== VERIFICACIÓN DE REGLAS DE ABORDO ===");
        boolean todasCumplen = true;
        
        for (int i = 0; i < cantidadLineas; i++) {
            if (lineas[i] != null) {
                System.out.println("\nLínea " + lineas[i].getColor() + ":");
                Cabina[] cabinasLinea = lineas[i].getCabinas();
                
                for (int j = 0; j < lineas[i].getCantidadCabinas(); j++) {
                    if (cabinasLinea[j] != null) {
                        float pesoTotal = cabinasLinea[j].calcularPesoTotal();
                        
                        int cantidadPersonas = 0;
                        Persona[] personas = cabinasLinea[j].getPersonasAbordo();
                        for (int k = 0; k < personas.length; k++) {
                            if (personas[k] != null) {
                                cantidadPersonas++;
                            }
                        }
                        
                        boolean cumplePeso = pesoTotal <= 850;
                        boolean cumpleCapacidad = cantidadPersonas <= 10;
                        
                        System.out.println("  Cabina " + cabinasLinea[j].getNroCabina() + 
                                         ": Peso=" + String.format("%.2f", pesoTotal) + "Kg" +
                                         " | Personas=" + cantidadPersonas +
                                         " | Cumple=" + (cumplePeso && cumpleCapacidad));
                        
                        if (!cumplePeso || !cumpleCapacidad) {
                            todasCumplen = false;
                        }
                    }
                }
            }
        }
        
        return todasCumplen;
    }
    
    // c) Calcular ingreso total
    public float calcularIngresoTotalSistema() {
        float ingresoTotal = 0;
        
        System.out.println("\n=== CÁLCULO DE INGRESOS POR LÍNEA ===");
        for (int i = 0; i < cantidadLineas; i++) {
            if (lineas[i] != null) {
                float ingresoLinea = lineas[i].calcularIngresoTotal();
                ingresoTotal += ingresoLinea;
                System.out.println("Línea " + lineas[i].getColor() + 
                                 ": " + String.format("%.2f", ingresoLinea) + " Bs" +
                                 " (" + lineas[i].getCantidadPasajeros() + " pasajeros)");
            }
        }
        
        this.cantidadIngresos = ingresoTotal;
        return ingresoTotal;
    }
    
    // d) Mostrar la línea con más ingreso solo con tarifa regular
    public void mostrarLineaConMasIngresoRegular() {
        System.out.println("\n=== LÍNEA CON MÁS INGRESO (TARIFA REGULAR) ===");
        
        Linea lineaMaxIngreso = null;
        float maxIngreso = 0;
        
        for (int i = 0; i < cantidadLineas; i++) {
            if (lineas[i] != null) {
                float ingresoRegular = 0;
                int pasajerosRegular = 0;
                
                Cabina[] cabinasLinea = lineas[i].getCabinas();
                for (int j = 0; j < lineas[i].getCantidadCabinas(); j++) {
                    if (cabinasLinea[j] != null) {
                   Persona[] personas = cabinasLinea[j].getPersonasAbordo();
                        for (int k = 0; k < personas.length; k++) {
                            if (personas[k] != null) {
                                // Solo contar pasajeros con tarifa regular (entre 25 y 60 años)
                                if (personas[k].getEdad() >= 25 && personas[k].getEdad() <= 60) {
                                    ingresoRegular += 3.0f;
                                    pasajerosRegular++;
                                }
                            }
                        }
                    }
                }
                
                System.out.println("Línea " + lineas[i].getColor() + 
                                 ": " + String.format("%.2f", ingresoRegular) + " Bs" +
                                 " (" + pasajerosRegular + " pasajeros con tarifa regular)");
                
                if (ingresoRegular > maxIngreso) {
                    maxIngreso = ingresoRegular;
                    lineaMaxIngreso = lineas[i];
                }
            }
        }
        
        if (lineaMaxIngreso != null) {
            System.out.println("\n*** GANADORA: Línea " + lineaMaxIngreso.getColor() + 
                             " con " + String.format("%.2f", maxIngreso) + " Bs ***");
        }
    }
}