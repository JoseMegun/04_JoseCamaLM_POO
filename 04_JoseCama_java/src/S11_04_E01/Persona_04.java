
package S11_04_E01;

public class Persona_04 {  
    
    // Clase Padre
    // Atributos
    String nombre;
    String apellido;

    // Constructor
    public Persona_04(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Métodos
    public void hablar() {
        System.out.println(nombre + " " + apellido + " está hablando.");
    }

    public void caminar() {
        System.out.println(nombre + " " + apellido + " está caminando.");
    }
}
