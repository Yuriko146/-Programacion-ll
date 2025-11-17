/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Segundoexamen;

/**
 *
 * @author USUARIO
 */
public class Persona {
    private String nombre;
    private int edad;
    private float peso;
    
    public Persona(String nombre, int edad, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public float getPeso() { return peso; }
}

