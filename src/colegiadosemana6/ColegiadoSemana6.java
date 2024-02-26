package colegiadosemana6;

/**
 *
 * @author Carlos Andres Barboza Hernandez
 * 
 */
public class ColegiadoSemana6 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //Creacion de la primera cancion        
        PrograCanciones cancion1 = new PrograCanciones(1, "Noviembre sin ti", "Reik", 323, 2005);
        
        //Llamdo al metodo para ver la informacion de la cancion
        cancion1.mostrarInformacion();
               
    }
    
}
