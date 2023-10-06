package S10_04;

/**
 *
 * @author jose_
 */
public class futbolista_04 extends seleccionFutbol_04 {
    
//Metodo Constructor  
    public futbolista_04 (int dorsal, String demarcacion, int id, String nombre, String apellido, int edad) {
        super (id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
//atributos
    private int dorsal;
    private String demarcacion;
    
//metodos 
    public void jugarPartido(){     
        System.out.println(getNombre()+" esta jugando partido");
    }
    
    public void entrenar(){      
        System.out.println(getNombre()+" esta entrenando");
    }

//GET and SET

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
