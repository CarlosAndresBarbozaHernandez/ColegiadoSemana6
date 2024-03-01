/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colegiadosemana6;



/**
 *
 * @author Carlos Andres Barboza Hernandez
 * 
 */
public class CalificacionEstudiante {
    
    //Atributos
    
    private String nombre;
    private String curso;
    private String profesor;
    private Integer calificacion;
    
    //Constructor

    public CalificacionEstudiante(String nombre, String curso, String profesor, Integer calificacion) {
        this.nombre = nombre;
        this.curso = curso;
        this.profesor = profesor;
        this.calificacion = calificacion;
    }
    
    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }
     
}
