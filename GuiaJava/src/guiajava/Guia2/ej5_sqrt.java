/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package guiajava.Guia2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ej5_sqrt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numero ;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número positivo: ");
        
        numero = leer.nextDouble();
        
        System.out.println("El doble es: " + numero*2);
        System.out.println("El triple es: " + numero*3);
        System.out.println("La raiz cuadrada es: " + Math.sqrt(numero));
    }
    
}
