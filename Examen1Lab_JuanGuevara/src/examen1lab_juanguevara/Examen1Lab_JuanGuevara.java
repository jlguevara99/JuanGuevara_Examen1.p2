/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1lab_juanguevara;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Examen1Lab_JuanGuevara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("GitHub");

        //Variables
        ArrayList<Usuario> usuarios = new ArrayList();

        char opcion = 's';
        char op = 's';
        do {
            sc = new Scanner(System.in);
            System.out.println("****Menu****");
            System.out.println("a. Registrar Usuario");
            System.out.println("b. Modificar Usuario");
            System.out.println("c. Eliminar Usuario");
            System.out.println("d. Listar Usuarios");
            System.out.println("e. Log in");
            System.out.println("f. Salir");

            opcion = sc.next().charAt(0);
            switch (opcion) {
                case 'a':
                    System.out.println("Ingresar Usuario");
                    try {
                        System.out.println("Ingrese el nombre del usuario: ");
                        sc.nextLine();
                        String nombre = sc.nextLine();
                        System.out.println("Ingrese la edad: ");
                        int edad = sc.nextInt();
                        System.out.println("Ingrese la profesion: ");
                        sc.nextLine();
                        String prof = sc.nextLine();
                        System.out.println("Ingrese el username: ");
                        String user = sc.next();
                        System.out.println("Ingrese la password(sin espacios): ");
                        String pass = sc.next();
                        usuarios.add(new Usuario(nombre, edad, prof, user, pass));

                    } catch (Exception e) {
                        System.out.println("Ha ingresado un dato incorrectamente");
                    }
                    break;
                case 'b':
                    System.out.println("Modificar Usuario");
                    try {
                        System.out.println("Ingrese la posicion del usuario: ");
                        int pos = sc.nextInt();
                        System.out.println("Que desea modificar?");
                        System.out.println("a. Username");
                        System.out.println("b. Password");
                        op = sc.next().charAt(0);
                        switch (op) {
                            case 'a':
                                System.out.println("Ingrese el nuevo username: ");
                                String N_user = sc.next();
                                usuarios.get(pos).setUsername(N_user);
                                break;
                            case 'b':
                                System.out.println("Nueva password: ");
                                String N_pass = sc.next();
                                usuarios.get(pos).setPass(N_pass);
                                break;

                        }

                    } catch (Exception e) {
                        System.out.println("Ha ingresado un dato incorrecto: ");
                    }
                    break;
                case 'c':
                    System.out.println("Eliminar Usuario");
                    try {
                        System.out.println("Ingrese la posicion del usuario: ");
                        int pos = sc.nextInt();
                        usuarios.remove(pos);
                    } catch (Exception e) {
                        System.out.println("El dato ingresado es incorrecto");
                    }
                    break;
                case 'd':
                    System.out.println("Lista de usuarios");
                    System.out.println("");
                    for (int i = 0; i < usuarios.size(); i++) {
                        System.out.println(i + ". " + usuarios.get(i));
                    }
                    break;
                case 'e':
                    System.out.println("Log in");
                    boolean esta = false;
                    int posicion = 0;
                    if (usuarios.isEmpty()) {
                        System.out.println("No hay usuarios");
                        break;
                    }
                    do {

                        System.out.println("Ingrese el username: ");
                        String usuario = sc.next();
                        for (int i = 0; i < usuarios.size(); i++) {
                            if (usuarios.get(i).getUsername().equals(usuario)) {
                                esta = true;
                                posicion = i;
                            }

                        }
                    } while (esta == false);
                    esta = false;
                    do {
                        System.out.println("Ingrese la password: ");
                        String contra = sc.next();
                        if (contra.equals(usuarios.get(posicion).getPass())) {
                            System.out.println("HA INGRESADO A SU USUARIO");
                            esta = true;
                        }
                    } while (esta == false);
                    char opcion2 = 's';
                    if (usuarios.get(posicion).getLista().isEmpty()) {

                    } else {
                        for (int i = 0; i < usuarios.get(posicion).getLista().size(); i++) {
                            System.out.println(i + ". " + usuarios.get(posicion).getLista().get(i));
                        }
                    }
                    do {

                        System.out.println("");
                        System.out.println("a. Crear Proyecto");
                        System.out.println("b. Modificar proyecto");
                        System.out.println("c. Eliminar");
                        System.out.println("d. Contar Commits");
                        System.out.println("f. Log Out");
                        opcion2 = sc.next().charAt(0);
                        switch (opcion2) {
                            case 'a':
                                System.out.println("Crear Proyecto");
                                try {
                                    System.out.println("Ingrese el nombre del proyecto: ");
                                    String nom = sc.next();
                                    char seguir = 's';
                                    ArrayList<Usuario> collab = new ArrayList();
                                    do {

                                        System.out.println("Ingrese la posicion del usuario que quiere agregar como colaborador");
                                        int posi = sc.nextInt();
                                        collab.add(usuarios.get(posi));
                                        System.out.println("Desea ingresar otro colaborador[s/n]");
                                        seguir = sc.next().charAt(0);
                                    } while (seguir != 's');
                                    usuarios.get(posicion).getLista().add(new Proyecto(nom, 0, collab));

                                } catch (Exception e) {
                                    System.out.println("Dato INCORRECTO");
                                }
                                break;
                            case 'b':
                                System.out.println("Modificar Archivo");
                                for (int i = 0; i < usuarios.get(posicion).getLista().size(); i++) {
                                    System.out.println(i+". "+usuarios.get(posicion).getLista().get(i));
                                }
                                
                                
                                break;
                            case 'c':
                                try {
                                    System.out.println("Ingrese la posicion del proyecto que desea eliminar");
                                    int proy = sc.nextInt();
                                    usuarios.get(posicion).getLista().remove(proy);
                                } catch (Exception e) {
                                    System.out.println("Dato Incorrecto");
                                }
                                break;
                            case 'd':
                                try {
                                    System.out.println("Ingrese la posicion del proyecto");
                                    int posiP = sc.nextInt();
                                    System.out.println("Hay " + usuarios.get(posicion).getLista().get(posiP).getCommits());
                                } catch (Exception e) {
                                }
                                break;
                        }
                    } while (opcion2 != 'e');

                    break;

            }
        } while (opcion != 'f');

    }

}
