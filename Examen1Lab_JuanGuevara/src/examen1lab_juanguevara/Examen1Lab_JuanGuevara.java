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
                                        usuarios.get(posicion).getLista().add(new Proyecto(nom,0,collab));
                                    } while (seguir != 's');
                                    usuarios.get(posicion).getLista().add(new Proyecto(nom, 0, collab));

                                } catch (Exception e) {
                                    System.out.println("Dato INCORRECTO");
                                }
                                break;
                            case 'b':
                                System.out.println("Modificar Proyecto");
                                char opcion3 = 's';
                                do {
                                    for (int i = 0; i < usuarios.get(posicion).getLista().size(); i++) {
                                        System.out.println(i + ". " + usuarios.get(posicion).getLista().get(i));
                                    }
                                    System.out.println("Ingrese el proyecto que quiere modificar: ");
                                    int proyecto = sc.nextInt();
                                    System.out.println("a. Crear un archivo");
                                    System.out.println("b. Modificar archivo");
                                    System.out.println("c. Eliminar archivo");
                                    System.out.println("d. Ingresar comando");
                                    opcion3 = sc.next().charAt(0);
                                    switch (opcion3) {
                                        case 'a':
                                            char seguir = 's';
                                            do {
                                                if (usuarios.get(posicion).getLista().isEmpty()) {
                                                    System.out.println("Ingrese que tipo de archivo quiere agregar");
                                                    System.out.println("a. Carpeta");
                                                    System.out.println("b. Archivo de texto");
                                                    char opcion4 = sc.next().charAt(posicion);
                                                    switch (opcion4) {
                                                        case 'a':
                                                            System.out.println("Ingrese nombre: ");
                                                            String n = sc.next();
                                                            System.out.println("Ingrese tamaño: ");
                                                            int tam = sc.nextInt();
                                                            usuarios.get(posicion).getLista().get(proyecto).getArch().add(new Carpeta(new ArrayList(), n, tam));
                                                            break;
                                                        case 'b':
                                                            System.out.println("Ingrese nombre: ");
                                                            n = sc.next();
                                                            System.out.println("Ingrese tamaño: ");
                                                            tam = sc.nextInt();
                                                            System.out.println("Ingrese lo que quiere ingresar: ");
                                                            sc.nextLine();
                                                            String cadena = sc.nextLine();
                                                            usuarios.get(posicion).getLista().get(proyecto).getArch().add(new A_Texto(cadena,n,tam));
                                                            break;
                                                    }
                                                }else{
                                                    
                                                }
                                                System.out.println("Desea seguir[s/n]");
                                                seguir = sc.next().charAt(0);
                                            } while (seguir != 's');

                                            break;
                                        case 'b':
                                            System.out.println("Ingrese la posicion del archivo");
                                            int pos = sc.nextInt();
                                            if (usuarios.get(posicion).getLista().get(proyecto).getArch().get(pos) instanceof Carpeta) {
                                                System.out.println(usuarios.get(posicion).getLista().get(proyecto).getArch().get(pos));
                                            }else{
                                                System.out.println("Ingrese nuevo archivo de texto");
                                                sc.nextLine();
                                                String contenido = sc.nextLine();
                                                ((A_Texto)usuarios.get(posicion).getLista().get(proyecto).getArch().get(pos)).setContenido(contenido);
                                            }
                                            break;
                                        case 'c':
                                            System.out.println("Eliminar usuario");
                                            try {
                                                System.out.println("Ingrese la posicion del archivo");
                                                int posisao = sc.nextInt();
                                                usuarios.get(posicion).getLista().get(proyecto).getArch().remove(posisao);
                                            } catch (Exception e) {
                                                System.out.println("Valor incorrecto");
                                            }
                                            break;
                                        case 'd':
                                            System.out.println("Ingrese el comando: ");
                                            String comando = sc.next();
                                            if (comando.equals("meow push")) {
                                                usuarios.get(posicion).getLista().get(proyecto).setCommits(usuarios.get(posicion).getLista().get(proyecto).getCommits()+1);
                                            }

                                    }
                                } while (opcion != 'e');

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
                        
                    } while (opcion2 != 'f');

                    break;

            }
        } while (opcion != 'f');

    }

}
