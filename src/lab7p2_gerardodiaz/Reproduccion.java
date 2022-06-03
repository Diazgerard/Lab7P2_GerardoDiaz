/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_gerardodiaz;

import java.util.ArrayList;

/**
 *
 * @author gerar
 */
public class Reproduccion {
    
    private String nombre;
    private int conteo;
    ArrayList<Cancion> canciones = new ArrayList();

    public Reproduccion() {
    }

    public Reproduccion(String nombre, int conteo) {
        this.nombre = nombre;
        this.conteo = conteo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getConteo() {
        return conteo;
    }

    public void setConteo(int conteo) {
        this.conteo = conteo;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
    
    
    
}
