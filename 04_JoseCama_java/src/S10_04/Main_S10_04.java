package S10_04;

import java.util.ArrayList;

/**
 *
 * @author jose_
 */
public class Main_S10_04 {
    
    public static void main(String[] args) {
        
        
        futbolista_04 futbolista1 = new futbolista_04(9, "arquero", 1, "paolo", "guerrero", 42);
        masajista_04 masajista1  = new masajista_04("si", 15, 2, "raul", "Martines", 50);
        entrenador_04 RicardoGareca = new entrenador_04("uno", 1, "Ricardo", "Gareca", 65);
        
        //ENTRENAR
        futbolista1.concentrarse();
        futbolista1.entrenar();
        
        masajista1.darMasaje();
        masajista1.concentrarse();
        
    }
    
}
