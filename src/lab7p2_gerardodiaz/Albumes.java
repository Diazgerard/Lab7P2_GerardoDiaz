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
public class Albumes extends Lanzamientos{
    
    private int cantidad;
    ArrayList<Cancion> canciones = new ArrayList();

    public Albumes() {
        super();
    }
    
    public Albumes(String titulo) {
       
    }

    public Albumes(String titulo, Date fecha, int likes) {
        super(titulo, fecha, likes);
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
    
    
}
