/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4_1;

/**
 *
 * @author USUARIO
 */
public class Cuadrado extends Figura implements Coloreado {
    private double lado;
    
    // Constructor
    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }
    
    // Getter y Setter para lado
    public double getLado() {
        return lado;
    }
    
    public void setLado(double lado) {
        this.lado = lado;
    }
    
    // Implementación de métodos abstractos
    @Override
    public double area() {
        return lado * lado;
    }
    
    @Override
    public double perimetro() {
        return 4 * lado;
    }
    
    // Implementación de interface Coloreado
    @Override
    public String comoColorear() {
        return "Colorear los cuatro lados del cuadrado con " + color;
    }
    
    // Sobrescritura de toString
    @Override
    public String toString() {
        return "Cuadrado:\n" +
               "  Color: " + color + "\n" +
               "  Lado: " + lado + "\n" +
               "  Área: " + String.format("%.2f", area()) + "\n" +
               "  Perímetro: " + String.format("%.2f", perimetro()) + "\n" +
               "  Cómo colorear: " + comoColorear();
    }
}