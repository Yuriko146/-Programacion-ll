/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Circulo2D;

/**
 *
 * @author USUARIO
 */
public class Circulo2D {
    // Campos de datos privados
    private double x;
    private double y;
    private double radio;
    
    /**
     * Constructor sin argumentos que crea un círculo con centro en (0,0) y radio 1
     */
    public Circulo2D() {
        this(0, 0, 1);
    }
    
    /**
     * Constructor que crea un círculo con centro en (x,y) y radio 1
     * @param x coordenada x del centro
     * @param y coordenada y del centro
     */
    public Circulo2D(double x, double y) {
        this(x, y, 1);
    }
    
    /**
     * Constructor que crea un círculo con centro y radio especificados
     * @param x coordenada x del centro
     * @param y coordenada y del centro
     * @param radio radio del círculo
     */
    public Circulo2D(double x, double y, double radio) {
        this.x = x;
        this.y = y;
        this.radio = radio;
    }
    
    // Métodos getter y setter
    public double getX() {
        return x;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    public double getRadio() {
        return radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    /**
     * Método que devuelve el área del círculo
     * @return área del círculo (π * r²)
     */
    public double getArea() {
        return Math.PI * radio * radio;
    }
    
    /**
     * Método que devuelve el perímetro del círculo
     * @return perímetro del círculo (2 * π * r)
     */
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }
    
    /**
     * Método que verifica si un punto (x,y) está dentro del círculo
     * @param x coordenada x del punto
     * @param y coordenada y del punto
     * @return true si el punto está dentro del círculo, false en caso contrario
     */
    public boolean contiene(double x, double y) {
        double distancia = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        return distancia <= this.radio;
    }
    
    /**
     * Método que verifica si un círculo está completamente dentro de este círculo
     * @param circulo el círculo a verificar
     * @return true si el círculo especificado está dentro de este círculo
     */
    public boolean contiene(Circulo2D circulo) {
        double distancia = Math.sqrt(Math.pow(circulo.x - this.x, 2) + Math.pow(circulo.y - this.y, 2));
        return (distancia + circulo.radio) <= this.radio;
    }
    
    /**
     * Método que verifica si un círculo se sobrepone con este círculo
     * @param circulo el círculo a verificar
     * @return true si el círculo especificado se sobrepone con este círculo
     */
    public boolean sobrepone(Circulo2D circulo) {
        double distancia = Math.sqrt(Math.pow(circulo.x - this.x, 2) + Math.pow(circulo.y - this.y, 2));
        return distancia < (this.radio + circulo.radio);
    }
    
    /**
     * Método toString para representar el círculo como cadena
     */
    @Override
    public String toString() {
        return String.format("Circulo2D[centro=(%.1f, %.1f), radio=%.1f]", x, y, radio);
    }
}