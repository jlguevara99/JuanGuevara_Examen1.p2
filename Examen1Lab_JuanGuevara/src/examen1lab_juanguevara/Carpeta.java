/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1lab_juanguevara;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Carpeta extends Archivo{
    private ArrayList<Archivo>archivos;

    public Carpeta() {
    }

    public Carpeta(ArrayList<Archivo> archivos) {
        this.archivos = archivos;
    }

    public Carpeta(ArrayList<Archivo> archivos, String nombre, int tamaño) {
        super(nombre, tamaño);
        this.archivos = archivos;
    }

    public ArrayList<Archivo> getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList<Archivo> archivos) {
        this.archivos = archivos;
    }

    @Override
    public String toString() {
        return super.toString()+"Carpeta{" + "archivos=" + archivos + '}';
    }
    
}
