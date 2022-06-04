/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_gerardodiaz;

/**
 *
 * @author gerar
 */
public class Cancion {
    
    private String titulo;
    private Object  duracion;
    private String referencia;

    public Cancion() {
    }

    public Cancion(String titulo, Object duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }
    
    

    public Cancion(String titulo, Object duracion, String referencia) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.referencia = referencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Object getDuracion() {
        return duracion;
    }

    public void setDuracion(Object duracion) {
        this.duracion = duracion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    
    
    
    
}
