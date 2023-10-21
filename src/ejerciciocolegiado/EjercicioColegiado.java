/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciocolegiado;
/**
 *
 * @author ander
 */
public class EjercicioColegiado {

    /**
     * @param args the command line arguments
     * Ejercicio para hacer creacion de una clase para la reproducion de sus canciones
     * Se necesita el: ID de la cancion,Titulo,Autor,duracion de la cancion y el año de creacion.
     */
    public static void main(String[] args) {
        Spotify song= new Spotify();
        song.getduration();
        song.getAutor();
        song.gettitle();
        song.getid_of_the_song();
        song.getDate_of_lauch();

    }

}
