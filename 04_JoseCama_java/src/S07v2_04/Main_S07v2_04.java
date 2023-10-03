
package S07v2_04;

public class Main_S07v2_04 {
     public static void main(String[] args){
         persona_04 objPersona = new persona_04();
        
         
         objPersona.nombre = "Carlos";
         objPersona.edd = 20;
         objPersona.comida = "arroz con pollo";
         
        objPersona.saludo();
        objPersona.edad();
        objPersona.platillo();
        
        int valorAño = objPersona.año();
        System.out.println("El valor del año es: " + valorAño);
        
        double hora = objPersona.hora();
        System.out.println("La hora es: " + hora);
        
        objPersona.ejercicio();
        objPersona.ejercicio("correr");
        
        String mensaje = objPersona.texto();
        System.out.println(mensaje);
        
        
                }
}

