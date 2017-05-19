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
                        usuarios.add(new Usuario(nombre,edad,prof,user,pass));
                        
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
                        switch(op){
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
                    }
                    break;
                case 'c':
                    break;
                case 'd':
                    break;
                case 'e':
                    break;
                 
            }
        } while (opcion != 'f');
        
    }
    
}
