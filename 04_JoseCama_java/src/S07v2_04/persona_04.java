
package S07v2_04;

public class persona_04 {

//Atributos
    String nombre;
    int edd;
    String comida;
    
    //Metodos
    public void saludo(){
        System.out.println("Buenas tardes señor o señorita: " + nombre);
    }
    
    public void edad(){
        System.out.println("su edad es: " + edd);
    }
    
    public void platillo(){
        System.out.println("tu plato favoirto es: " + comida);
    }
    
    //Sobrecarga de metodos
    public void ejercicio(){
    }
    
    public void ejercicio(String nombre){
        System.out.println("Tu realizas ejercicio: " + nombre);
    }
    
    //Metodos con valores de retorno
    public int año(){
        return 20;
    }
    
    public String texto(){
        return "Espero que tenga un buen dia";
    }
    
    public double hora(){
        return 14.20;
    }
    
    //Metodos con parametros y argumentos
    public void pregEdad(int edd){
    }
    
    public void pregNombre(String nombre){
        
    }
    
}