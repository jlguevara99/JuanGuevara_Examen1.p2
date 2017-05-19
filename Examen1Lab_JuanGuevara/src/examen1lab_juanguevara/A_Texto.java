/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1lab_juanguevara;

/**
 *
 * @author HP
 */
public class A_Texto extends Archivo {
    private String contenido;

    public A_Texto(String contenido) {
        this.contenido = contenido;
    }

    public A_Texto(String contenido, String nombre, int tamaño) {
        super(nombre, tamaño);
        this.contenido = contenido;
    }

    public A_Texto() {
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return super.toString()+"Archivo de texto" + " Contenido: " + contenido ;
    }
    
    
}
