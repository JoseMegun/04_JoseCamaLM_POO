package S07_04;

// Jose Megun Cama La Madrid

public class persona2_04 {
    // Atributos
    private String nombre;
    private int edad;

    // Constructor de la clase persona2
    public persona2_04(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos con valores de retorno
    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerEdad() {
        return edad;
    }

    public String saludar() {
        return "Hola, soy " + nombre;
    }

    // Nuevos métodos con valores de retorno
    public String obtenerInfoPersonal() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public int calcularAñosRestantes() {
        return 100 - edad;
    }
}
