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
public class Proyecto {

    private String nombre;
    private int commits;
    private ArrayList<Archivo> archivos = new ArrayList();
    private ArrayList<Usuario> collab;

    public Proyecto() {
    }

    public Proyecto(String nombre, int commits,ArrayList<Usuario> collab) {
        this.nombre = nombre;
        this.commits = commits;
        this.collab = collab;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCommits() {
        return commits;
    }

    public void setCommits(int commits) {
        this.commits = commits;
    }

    public ArrayList<Archivo> getArch() {
        return archivos;
    }

    public void setArch(ArrayList<Archivo> lista) {
        this.archivos = lista;
    }

    public ArrayList<Usuario> getCollab() {
        return collab;
    }

    public void setCollab(ArrayList<Usuario> collab) {
        this.collab = collab;
    }

    @Override
    public String toString() {
        return "Proyecto---" + "Nombre: " + nombre + ", Commits: " + commits + ", Lista=" + archivos ;
    }

}
