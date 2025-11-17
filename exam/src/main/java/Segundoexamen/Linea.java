/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Segundoexamen;

/**
 *
 * @author USUARIO
 */
public class Linea {
    private String color;
    private Persona[] filaPersonas;
    private Cabina[] cabinas;
    private int cantidadCabinas;
    
    public Linea(String color) {
        this.color = color;
        this.filaPersonas = new Persona[100]; // Tamaño inicial
        this.cabinas = new Cabina[50]; // Tamaño inicial
        this.cantidadCabinas = 0;
    }
    
    public String getColor() { return color; }
    public Cabina[] getCabinas() { return cabinas; }
    public int getCantidadCabinas() { return cantidadCabinas; }
    
    public void agregarPersona(Persona p) {
        for (int i = 0; i < filaPersonas.length; i++) {
            if (filaPersonas[i] == null) {
                filaPersonas[i] = p;
                break;
            }
        }
    }
    
    public void agregarCabina(Cabina cab) {
        if (cantidadCabinas < cabinas.length) {
            cabinas[cantidadCabinas] = cab;
            cantidadCabinas++;
        }
    }
    
    // c) Calcular el ingreso total de todas las líneas
    public float calcularIngresoTotal() {
        float ingresoTotal = 0;
        
        for (int i = 0; i < cabinas.length; i++) {
            if (cabinas[i] != null) {
                Persona[] personas = cabinas[i].getPersonasAbordo();
                for (int j = 0; j < personas.length; j++) {
                    if (personas[j] != null) {
                        float tarifa = calcularTarifa(personas[j]);
                        ingresoTotal += tarifa;
                    }
                }
            }
        }
        
        return ingresoTotal;
    }
    
    private float calcularTarifa(Persona p) {
        // Tarifa preferencia: menores de 25 y mayores de 60 pagan 1.5 bs
        if (p.getEdad() < 25 || p.getEdad() > 60) {
            return 1.5f;
        }
        // Tarifa regular: 3 bs
        return 3.0f;
    }
    
    public int getCantidadPasajeros() {
        int total = 0;
        for (int i = 0; i < cabinas.length; i++) {
            if (cabinas[i] != null) {
                Persona[] personas = cabinas[i].getPersonasAbordo();
                for (int j = 0; j < personas.length; j++) {
                    if (personas[j] != null) {
                        total++;
                    }
                }
            }
        }
        return total;
    }
}