/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

/**
 *
 * @author USUARIO
 */
public class Vector3D {
    private double x, y, z;
    
    // Constructor
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    // a) Suma de vectores: a + b = (a₁ + b₁, a₂ + b₂, a₃ + b₃)
    public Vector3D suma(Vector3D otro) {
        return new Vector3D(x + otro.x, y + otro.y, z + otro.z);
    }
    
    // b) Multiplicación por escalar: r·a = (r·a₁, r·a₂, r·a₃)
    public Vector3D multiplicarEscalar(double escalar) {
        return new Vector3D(x * escalar, y * escalar, z * escalar);
    }
    
    // c) Longitud del vector: |a| = √(a₁² + a₂² + a₃²)
    public double longitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    
    // d) Vector unitario: â = a/|a|
    public Vector3D normal() {
        double len = longitud();
        return new Vector3D(x / len, y / len, z / len);
    }
    
    // e) Producto escalar: a·b = a₁b₁ + a₂b₂ + a₃b₃
    public double productoEscalar(Vector3D otro) {
        return x * otro.x + y * otro.y + z * otro.z;
    }
    
    // f) Producto vectorial: a×b = (a₂b₃ - a₃b₂, a₃b₁ - a₁b₃, a₁b₂ - a₂b₁)
    public Vector3D productoVectorial(Vector3D otro) {
        return new Vector3D(
            y * otro.z - z * otro.y,
            z * otro.x - x * otro.z,
            x * otro.y - y * otro.x
        );
    }
    
    // Verificar si son perpendiculares (producto escalar = 0)
    public boolean esPerpendicular(Vector3D otro) {
        return Math.abs(productoEscalar(otro)) < 1e-10;
    }
    
    // Área del paralelogramo = |a × b|
    public double areaParalelogramo(Vector3D otro) {
        return productoVectorial(otro).longitud();
    }
    
    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }
}
