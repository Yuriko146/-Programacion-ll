/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4_1;

/**
 *
 * @author USUARIO
 */
public class Circulo extends Figura {
    private double radio;
    
    // Constructor
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }
    
    // Getter y Setter para radio
    public double getRadio() {
        return radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    // Implementación de métodos abstractos
    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
    
    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
    
    // Sobrescritura de toString
    @Override
    public String toString() {
        return "Círculo:\n" +
               "  Color: " + color + "\n" +
               "  Radio: " + radio + "\n" +
               "  Área: " + String.format("%.2f", area()) + "\n" +
               "  Perímetro: " + String.format("%.2f", perimetro());
    }
}