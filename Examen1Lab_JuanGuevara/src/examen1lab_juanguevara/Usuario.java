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
public class Usuario {
    private String nombre;
    private int edad;
    private String profesion;
    private String username;
    private String pass;
    private ArrayList<Proyecto> lista = new ArrayList();

    public Usuario() {
    }

    public Usuario(String nombre, int edad, String profesion, String username, String pass) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
        this.username = username;
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public ArrayList<Proyecto> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Proyecto> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Usuario---" + "Nombre: " + nombre + ", Edad: " + edad + ", Profesion: " + profesion + ", Username: " + username + ", Contraseña: " + pass ;
    }
    
}
