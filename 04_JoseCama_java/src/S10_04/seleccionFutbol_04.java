
package S10_04;

/**
 *
 * @author jose_
 */
public class seleccionFutbol_04 {

//CLASE PADRE
//Metodo Constructor
    public seleccionFutbol_04(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
//atributos
    protected int id;
    protected String nombre;
    protected String apellido;
    protected int edad;
    
//metodos
    public void concentrarse(){      
        System.out.println(getNombre() + " se esta concentrando");
    }
    
    public void viajar(){      
        System.out.println("El viaje comenzo " + getNombre());
    }

//GET and SET
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
