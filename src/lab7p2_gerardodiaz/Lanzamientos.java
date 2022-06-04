/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_gerardodiaz;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gerar
 */
public class Lanzamientos {
    private String titulo;
    private Date fecha;
    private int likes;
    ArrayList<Albumes> albumes = new ArrayList();
    ArrayList<Singles> singles = new ArrayList();
    
    
    public Lanzamientos() {
    }

    public Lanzamientos(String titulo, Date fecha, int likes) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.likes = likes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<Albumes> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Albumes> albumes) {
        this.albumes = albumes;
    }

    public ArrayList<Singles> getSingles() {
        return singles;
    }

    public void setSingles(ArrayList<Singles> singles) {
        this.singles = singles;
    }

    @Override
    public String toString() {
        return titulo;
    }
    
    
    

    
    
    
    
}
