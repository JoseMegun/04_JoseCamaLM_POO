package S10_04;

/**
 *
 * @author jose_
 */
public class entrenador_04 extends seleccionFutbol_04 {

//Metodo Constructor  
    public entrenador_04(String idFederacion, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }
    
//atributos
    private String idFederacion;
    
//metodos
    public void dirigirPartido(){      
    }
    
    public void dirigirEntrenamiento(){  
        System.out.println(nombre + " es el entrenador");
    }
    
}
