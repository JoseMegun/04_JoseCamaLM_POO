
package S07_04JoseCama;

public class persona1_04 {
    private String nombre;
    private int edad;

    // Constructor de la clase persona1
    public persona1_04(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void imprimirInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void saludar(String mensaje) {
        System.out.println("Hola, " + mensaje + ", soy " + nombre);
    }
}
