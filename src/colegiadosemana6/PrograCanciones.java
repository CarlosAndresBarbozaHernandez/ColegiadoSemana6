/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colegiadosemana6;

import javax.swing.JOptionPane;

/**
 *
 * @author charlie
 */
public class PrograCanciones {
    
    //Atributos 
    
    private int idCancion;
    private String titulo;
    private String autor;
    private int duracion;
    private int annoDeCreacion;
    
    //Constructor

    public PrograCanciones(int cancion, String titulo, String autor, int duracion, int annoDeCreacion) {
        this.idCancion = cancion;
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.annoDeCreacion = annoDeCreacion;
    }
    
    //Getters and Setters

    public int getCancion() {
        return idCancion;
    }

    public void setCancion(int cancion) {
        this.idCancion = cancion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAnnoDeCreacion() {
        return annoDeCreacion;
    }

    public void setAnnoDeCreacion(int annoDeCreacion) {
        this.annoDeCreacion = annoDeCreacion;
    }
    
    //Metodo para ensennar la informacion de la cancion
    public void mostrarInformacion(){
        
        JOptionPane.showMessageDialog(null, "Id. Cancion: " + idCancion + 
                "\n Titulo: " + titulo +
                "\n Autor: " + autor +
                "\n Duracion: " + duracion + " segundos " +
                "\n Anno: " + annoDeCreacion);
        
    }
    
}
