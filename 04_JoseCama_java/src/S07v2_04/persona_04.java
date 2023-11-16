package S07v2_04;

// Jose Megun Cama La Madrid

public class persona_04 {
    // Atributos
    String nombre;
    int edd;
    String comida;

    // Metodos
    public void saludo() {
        System.out.println("Buenas tardes señor o señorita: " + nombre);
    }

    public void edad() {
        System.out.println("Su edad es: " + edd);
    }

    public void platillo() {
        System.out.println("Tu plato favorito es: " + comida);
    }

    // Sobrecarga de metodos
    public void ejercicio() {
        System.out.println("Realizas algún ejercicio.");
    }

    public void ejercicio(String tipoEjercicio) {
        System.out.println("Realizas ejercicio de tipo: " + tipoEjercicio);
    }

    // Métodos con valores de retorno (3 tipos de datos diferentes)
    public int año() {
        return 20;
    }

    public String texto() {
        return "Espero que tengas un buen día";
    }

    public double hora() {
        return 14.20;
    }

    // Métodos con parámetros y argumentos
    public void pregEdad(int edad) {
        System.out.println("La edad proporcionada es: " + edad);
    }

    public void pregNombre(String nombrePersona) {
        System.out.println("El nombre proporcionado es: " + nombrePersona);
    }
}

