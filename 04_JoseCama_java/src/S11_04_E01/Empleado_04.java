
package S11_04_E01;

public class Empleado_04 extends Persona_04 {
    
    // Clase Hija
    // Atributos
    String empresa;
    int dni;
    int tiempoTrabajo;

    // Constructor
    public Empleado_04(String nombre, String apellido, String empresa, int dni, int tiempoTrabajo) {
        super(nombre, apellido);
        this.empresa = empresa;
        this.dni = dni;
        this.tiempoTrabajo = tiempoTrabajo;
    }

    // Métodos
    public void trabajar() {
        System.out.println(nombre + " " + apellido + " con DNI " + dni + " está trabajando en " + empresa + " durante " + tiempoTrabajo + " años.");
    }

    public void saludar() {
        System.out.println(nombre + " " + apellido + " con DNI " + dni + " está saludando.");
    }
}
