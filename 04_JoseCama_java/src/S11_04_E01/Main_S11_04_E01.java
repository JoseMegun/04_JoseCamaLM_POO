
package S11_04_E01;

public class Main_S11_04_E01 {
    
    public static void main (String[] args) {
        // Crear una instancia de Atleta_04
        Atleta_04 atleta = new Atleta_04("Correr", 25, "Juan", "Pérez");
        atleta.entrenar();
        atleta.actuar();
        
        // Crear una instancia de Maestro_04
        Maestro_04 maestro = new Maestro_04();
        maestro.carrera = "Matemáticas";
        maestro.experiencia = 10;
        maestro.capacitar();
        maestro.aprender();
        
        // Crear una instancia de Empleado_04
        Empleado_04 empleado = new Empleado_04();
        empleado.empresa = "ABC Company";
        empleado.tiempoTrabajo = 5;
        empleado.trabajar();
        empleado.saludar();
    }
}

