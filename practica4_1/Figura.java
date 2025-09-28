/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4_1;

/**
 *
 * @author USUARIO
 */
public abstract class Figura {
    protected String color;
    
    // Constructor
    public Figura(String color) {
        this.color = color;
    }
    
    // Métodos no abstractos
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public String toString() {
        return "Figura de color: " + color;
    }
    
    // Métodos abstractos
    public abstract double area();
    public abstract double perimetro();
}