/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Segundoexamen;

/**
 *
 * @author USUARIO
 */
public class Cabina {
    private int nroCabina;
    private Persona[] personasAbordo;
    
    public Cabina(int nroCabina) {
        this.nroCabina = nroCabina;
        this.personasAbordo = new Persona[10]; // Capacidad máxima de 10 personas
    }
    
    public int getNroCabina() { return nroCabina; }
    public Persona[] getPersonasAbordo() { return personasAbordo; }
    
    // a) Método para agregar la primera persona a la cabina nroX
    public boolean agregarPersona(Persona p) {
        // Calcular peso actual y contar personas
        float pesoActual = 0;
        int cantidadPersonas = 0;
        
        for (int i = 0; i < personasAbordo.length; i++) {
            if (personasAbordo[i] != null) {
                pesoActual += personasAbordo[i].getPeso();
                cantidadPersonas++;
            }
        }
        
        // Verificar capacidad máxima de personas (10 según el enunciado)
        if (cantidadPersonas >= 10) {
            System.out.println("Cabina " + nroCabina + " ha alcanzado capacidad máxima de personas.");
            return false;
        }
        
        // Verificar si se puede agregar sin superar el peso máximo (850 Kg según el enunciado)
        if (pesoActual + p.getPeso() <= 850.0f) {
            // Buscar primera posición disponible
            for (int i = 0; i < personasAbordo.length; i++) {
                if (personasAbordo[i] == null) {
                    personasAbordo[i] = p;
                    System.out.println("Persona " + p.getNombre() + " agregada a cabina " + nroCabina);
                    return true;
                }
            }
        } else {
            System.out.println("No se puede agregar a " + p.getNombre() + 
                             ". Se superaría el peso máximo de 850 Kg.");
            return false;
        }
        
        return false;
    }
    
    public float calcularPesoTotal() {
        float pesoTotal = 0;
        for (int i = 0; i < personasAbordo.length; i++) {
            if (personasAbordo[i] != null) {
                pesoTotal += personasAbordo[i].getPeso();
            }
        }
        return pesoTotal;
    }
}
//completa el diagrama con al menos 3 atributos en cada clase y 2 metodos en el diagrama del ejercicio 1 eso de "el nuevo Spotify Latinoamerica"alli esta en la imagen tienes que crear 4 clases y la clase principal es Spotify