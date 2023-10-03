
package S07_04;

public class persona2_04 {
    private String nombre;
    private int edad;

    // Constructor de la clase persona2
    public persona2_04(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerEdad() {
        return edad;
    }

    public String saludar() {
        return "Hola, soy " + nombre;
    }
}

