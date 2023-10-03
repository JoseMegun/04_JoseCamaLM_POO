
package S07_04;

public class Main_S07_04 {
    public static void main(String[] args) {
        // Crear un objeto de la clase "persona1"
        persona1_04 personaUno = new persona1_04("Juan", 30);

        // Llamar a los métodos de la clase "persona1"
        personaUno.imprimirInfo();
        personaUno.saludar("amigo");

        // Crear un objeto de la clase "persona2"
        persona2_04 personaDos = new persona2_04("Maria", 25);

        // Llamar a los métodos de la clase "persona2" y mostrar los resultados
        System.out.println("Nombre: " + personaDos.obtenerNombre());
        System.out.println("Edad: " + personaDos.obtenerEdad());
        System.out.println(personaDos.saludar());
    }
}