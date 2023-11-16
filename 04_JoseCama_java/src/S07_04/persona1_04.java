package S07_04;

// Jose Megun Cama La Madrid

public class persona1_04 {
    // Atributos
    private String nombre;
    private int edad;

    // Constructor de la clase persona1
    public persona1_04(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Metodos
    public void imprimirInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void saludar(String mensaje) {
        System.out.println("Hola, " + mensaje + ", soy " + nombre);
    }

    // Métodos con parametros
    public void cumplirAños(int años) {
        edad += años;
        System.out.println("¡Feliz cumpleaños! Ahora tengo " + edad + " años.");
    }

    public void cambiarNombre(String nuevoNombre) {
        nombre = nuevoNombre;
        System.out.println("Me han cambiado el nombre a " + nombre);
    }

    public void estudiar(String materia) {
        System.out.println(nombre + " está estudiando " + materia);
    }
}
