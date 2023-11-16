package S07v2_04;

// Jose Megun Cama La Madrid

public class Main_S07v2_04 {
    public static void main(String[] args) {
        // Objeto 1 de la clase persona_04
        persona_04 objPersona1 = new persona_04();

        objPersona1.nombre = "Carlos";
        objPersona1.edd = 20;
        objPersona1.comida = "arroz con pollo";
        objPersona1.saludo();
        objPersona1.edad();
        objPersona1.platillo();

        int valorAño = objPersona1.año();
        System.out.println("El valor del año es: " + valorAño);

        double hora = objPersona1.hora();
        System.out.println("La hora es: " + hora);

        objPersona1.ejercicio();
        objPersona1.ejercicio("correr"); // Sobrecarga de metodo

        String mensaje = objPersona1.texto();
        System.out.println(mensaje);

        // Objeto 2 de la clase persona_04
        persona_04 objPersona2 = new persona_04();

        objPersona2.nombre = "Ana";
        objPersona2.edd = 25;
        objPersona2.comida = "pizza";
        objPersona2.saludo();
        objPersona2.edad();
        objPersona2.platillo();
        objPersona2.pregEdad(30);
        objPersona2.pregNombre("Pedro");
    }
}

