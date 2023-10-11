
package S11_04_E01;

public class Atleta_04 extends Persona_04 {
    
    // Clase Hija
    // Atributos
    String deporte;
    int tiempo;
    int velocidad;

    // Constructor 
    public Atleta_04(String nombre, String apellido, String deporte, int tiempo, int velocidad) {
        super(nombre, apellido);
        this.deporte = deporte;
        this.tiempo = tiempo;
        this.velocidad = velocidad;
    }

    // Métodos específicos para la clase Atleta
    public void entrenar() {
        System.out.println(nombre + " " + apellido + " está entrenando para " + deporte + ".");
    }

    public void correr() {
        System.out.println(nombre + " " + apellido +  " está corriendo a " + velocidad + " km/h., en solo " + tiempo + " " + "minutos.");
    }
}
