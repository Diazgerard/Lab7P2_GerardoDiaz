/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_gerardodiaz;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gerar
 */
public class Clientes extends Usuarios{
    ArrayList<Cancion> favorita = new ArrayList();
    ArrayList<Reproduccion> creadas = new ArrayList();
    ArrayList<Reproduccion> gusta = new ArrayList();

    public Clientes() {
        super();
    }

    public Clientes(String usermane, String contrasenia, int edad) {
        super(usermane, contrasenia, edad);
    }

    public ArrayList<Cancion> getFavorita() {
        return favorita;
    }

    public void setFavorita(ArrayList<Cancion> favorita) {
        this.favorita = favorita;
    }

    public ArrayList<Reproduccion> getCreadas() {
        return creadas;
    }

    public void setCreadas(ArrayList<Reproduccion> creadas) {
        this.creadas = creadas;
    }

    

    public void setEdad(int edad) {
        if(edad<12){
            edad = Integer.parseInt(JOptionPane.showInputDialog("Tiene que ser mayor de 12 anios de EDAD \n"
                    + "Ingrese edad"));
            this.edad = edad;
        }else{
            this.edad = edad;
        }
    }
    
    
}
