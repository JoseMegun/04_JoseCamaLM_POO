
package S11_04_E01;

public class Maestro_04 extends Persona_04 {
    
    // Clase Hija
    // Atributos
    String materia;
    String colegio;
    int experiencia;

    // Constructor
    public Maestro_04(String nombre, String apellido, String materia, String colegio, int experiencia) {
        super(nombre, apellido);
        this.materia = materia;
        this.colegio = colegio;
        this.experiencia = experiencia;
    }

    // Métodos
    public void enseñar() {
        System.out.println(nombre + " " + apellido + " está enseñando " + materia + " en el colegio " + colegio + ".");
    }

    public void investigar() {
        System.out.println(nombre + " " + apellido + " está investigando en su campo con su experiencia de " + experiencia + " años.");
    }
}
