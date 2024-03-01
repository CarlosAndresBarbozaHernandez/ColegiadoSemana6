package colegiadosemana6;

import javax.swing.JOptionPane;

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
        
        //Creacion de dos objetos 
        
        CalificacionEstudiante estudiante1 = new CalificacionEstudiante("Carlos", "Calculo", "Juanito", 70);
        CalificacionEstudiante estudiante2 = new CalificacionEstudiante("Diandra", "Contabilidad", "Marcela", 90);
        
        //Informacion del estudiante1
        
        JOptionPane.showMessageDialog(null, "Informacion del estudiante 1 "
                + "\nNombre: " + estudiante1.getNombre() 
                + "\nCurso: " + estudiante1.getCurso() 
                + "\nProfesor: " + estudiante1.getProfesor() 
                + "\nCalificacion: " + estudiante1.getCalificacion());
        
        //Informacion del estudiante2
        
        JOptionPane.showMessageDialog(null,"Informacion del estudiante 2" 
                + "\nNombre: " + estudiante2.getNombre() 
                + "\nCurso: " + estudiante2.getCurso() 
                + "\nProfesor: " + estudiante2.getProfesor() 
                + "\nCalificacion: " + estudiante2.getCalificacion());
    }
    
}
