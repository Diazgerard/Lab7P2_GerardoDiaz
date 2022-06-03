/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_gerardodiaz;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author gerar
 */
public class Artistas extends Usuarios{
    static Scanner lea = new Scanner (System.in);
    
    private String nombre;
    ArrayList<Cancion> cancion = new ArrayList();
    ArrayList<Albumes> album = new ArrayList();

    public Artistas() {
        super();
    }

    public Artistas(String nombre) {
        this.nombre = nombre;
    }

    public Artistas(String nombre, String usermane, String contrasenia, int edad) {
        super(usermane, contrasenia, edad);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getCancion() {
        return cancion;
    }

    public void setCancion(ArrayList<Cancion> cancion) {
        this.cancion = cancion;
    }

    public ArrayList<Albumes> getAlbum() {
        return album;
    }

    public void setAlbum(ArrayList<Albumes> album) {
        this.album = album;
    }

    public void setEdad(int edad) {
        if(edad<18){
            edad = Integer.parseInt(JOptionPane.showInputDialog("Tiene que ser mayor de 18 anios de EDAD \n"
                    + "Ingrese edad"));
            this.edad = edad;
        }else{
            this.edad = edad;
        }
        
    }

    
    
    

    

    

    
    

    

   
    
    
    
    
}
