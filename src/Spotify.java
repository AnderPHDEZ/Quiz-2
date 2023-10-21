/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ander
 */
public class Spotify {
    private int duration;
    private String title;
    private String autor;
    private int id_of_the_song;
    private int date_of_launch;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public int getID_of_the_song(){
        return id_of_the_song;
    }

    public void setId_of_the_song(int id_of_the_song) {
        this.id_of_the_song = id_of_the_song;
    }
    
    public int getDate_of_launch(){
        return date_of_launch;
    }

    public void setDate_of_launch(int date_of_launch) {
        this.date_of_launch = date_of_launch;
    }
 
}
