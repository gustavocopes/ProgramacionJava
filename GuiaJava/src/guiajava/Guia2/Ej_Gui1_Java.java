/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
package guiajava.Guia2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ej_Gui1_Java {

    
    public static void main(String[] args) {
        String nombre;
        
        Scanner leer = new Scanner(System.in);
         
        System.out.println("Escriba su nombre:");
                nombre = leer.next();
                
        System.out.println("Su nombre es:" + nombre);
    }
    
}
