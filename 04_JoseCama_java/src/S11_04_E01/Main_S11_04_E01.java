
package S11_04_E01;

public class Main_S11_04_E01 {

    public static void main(String[] args) {
        Persona_04 person = new Persona_04("Juan", "Pérez");    // Objeto de Class Persona_04
        Atleta_04 atleta = new Atleta_04("María", "González", "Gimnasia", 2, 25);     // Objeto de Class Atleta_04
        Maestro_04 master = new Maestro_04("Carlos", "López", "Física", "Centro de Varones", 10);    // Objeto de Class Maestro_04
        Empleado_04 empleado = new Empleado_04("Ana", "Martínez", "Saga Falabella", 24356718, 5);   // Objeto de Class Empleado_04

        // Ejemplo de uso de métodos
        person.hablar();
        person.caminar();
        atleta.entrenar();
        atleta.correr();
        master.enseñar();
        master.investigar();
        empleado.trabajar();
        empleado.saludar();
        
    }
}
