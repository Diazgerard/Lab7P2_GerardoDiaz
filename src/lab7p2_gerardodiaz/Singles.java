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
public class Singles extends Lanzamientos{
    
    ArrayList<Cancion> cancion = new ArrayList();

    public Singles() {
        super();
    }

    public Singles(String titulo, Date fecha, int likes) {
        super(titulo, fecha, likes);
    }

    public ArrayList<Cancion> getCancion() {
        return cancion;
    }

    public void setCancion(ArrayList<Cancion> cancion) {
        this.cancion = cancion;
    }
    
    
    
    
}
