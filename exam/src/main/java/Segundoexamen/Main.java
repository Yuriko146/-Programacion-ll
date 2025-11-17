/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Segundoexamen;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        // Crear el sistema de teleférico
        MiTeleferico miTeleferico = new MiTeleferico();
        
        // Crear líneas (Amarillo, Rojo, Verde según la nota)
        Linea lineaAmarilla = new Linea("Amarillo");
        Linea lineaRoja = new Linea("Rojo");
        Linea lineaVerde = new Linea("Verde");
        
        // Crear cabinas para cada línea
        Cabina cabina1Amarilla = new Cabina(1);
        Cabina cabina2Amarilla = new Cabina(2);
        
        Cabina cabina1Roja = new Cabina(1);
        Cabina cabina2Roja = new Cabina(2);
        
        Cabina cabina1Verde = new Cabina(1);
        
        // Crear personas con diferentes características
        Persona p1 = new Persona("Juan", 20, 70.0f);      // Tarifa preferencial
        Persona p2 = new Persona("María", 35, 65.0f);     // Tarifa regular
        Persona p3 = new Persona("Pedro", 65, 80.0f);     // Tarifa preferencial
        Persona p4 = new Persona("Ana", 28, 55.0f);       // Tarifa regular
        Persona p5 = new Persona("Luis", 45, 90.0f);      // Tarifa regular
        Persona p6 = new Persona("Carmen", 22, 60.0f);    // Tarifa preferencial
        Persona p7 = new Persona("Roberto", 50, 85.0f);   // Tarifa regular
        Persona p8 = new Persona("Sofía", 18, 58.0f);     // Tarifa preferencial
        Persona p9 = new Persona("Diego", 40, 78.0f);     // Tarifa regular
        Persona p10 = new Persona("Laura", 30, 62.0f);    // Tarifa regular
        
        // a) Agregar personas a las cabinas (verificando reglas)
        System.out.println("=== AGREGANDO PERSONAS A CABINAS ===\n");
        
        cabina1Amarilla.agregarPersona(p1);
        cabina1Amarilla.agregarPersona(p2);
        cabina1Amarilla.agregarPersona(p3);
        cabina2Amarilla.agregarPersona(p4);
        cabina2Amarilla.agregarPersona(p5);
        
        cabina1Roja.agregarPersona(p6);
        cabina1Roja.agregarPersona(p7);
        cabina1Roja.agregarPersona(p8);
        cabina2Roja.agregarPersona(p9);
        
        cabina1Verde.agregarPersona(p10);
        
        // Agregar cabinas a las líneas
        lineaAmarilla.agregarCabina(cabina1Amarilla);
        lineaAmarilla.agregarCabina(cabina2Amarilla);
        
        lineaRoja.agregarCabina(cabina1Roja);
        lineaRoja.agregarCabina(cabina2Roja);
        
        lineaVerde.agregarCabina(cabina1Verde);
        
        // Agregar líneas al sistema
        miTeleferico.agregarLinea(lineaAmarilla);
        miTeleferico.agregarLinea(lineaRoja);
        miTeleferico.agregarLinea(lineaVerde);
        
        // b) Verificar que todas las cabinas cumplan las reglas
        boolean cumpleReglas = miTeleferico.verificarReglasAbordo();
        System.out.println("\n¿Todas las cabinas cumplen las reglas? " + 
                         (cumpleReglas ? "SÍ" : "NO"));
        
        // c) Calcular ingreso total
        float ingresoTotal = miTeleferico.calcularIngresoTotalSistema();
        System.out.println("\nINGRESO TOTAL DEL SISTEMA: " + 
                         String.format("%.2f", ingresoTotal) + " Bs");
        
        // d) Mostrar línea con más ingreso solo con tarifa regular
        miTeleferico.mostrarLineaConMasIngresoRegular();
    }
}
