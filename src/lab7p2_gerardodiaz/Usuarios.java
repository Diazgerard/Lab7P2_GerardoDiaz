/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_gerardodiaz;


import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author gerar
 */
public class Usuarios {
    
    private String usermane;
    private String contrasenia;
    protected int edad;
    
   ArrayList <Artistas> artistas = new ArrayList();
   ArrayList <Clientes> clientes = new ArrayList();
   
  
   

    public Usuarios() {
    }

    public Usuarios(String usermane, String contrasenia, int edad) {
        this.usermane = usermane;
        this.contrasenia = contrasenia;
        this.edad = edad;
    }

    public String getUsermane() {
        return usermane;
    }

    public void setUsermane(String usermane) {
        this.usermane = usermane;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Artistas> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artistas> artistas) {
        this.artistas = artistas;
    }

    public ArrayList<Clientes> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Clientes> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return usermane + contrasenia + edad; 
    }
   
  

    
    
}
