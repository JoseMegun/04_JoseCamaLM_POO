package S10_04;

/**
 *
 * @author jose_
 */
public class masajista_04 extends seleccionFutbol_04 {

//Metodo Constructor  
    public masajista_04(String titulacion, int aniosExperiencia, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }
    
//atributos
    private String titulacion;
    private int aniosExperiencia;
    
//metodos
    public void darMasaje(){
        System.out.println(nombre + " da masajes");
    }
    
}
