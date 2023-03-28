/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma
 */
package ej1_guia1_suma;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ej1_guia1_suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese un número:");
    int numero, num1, num2;
    
    num1= leer.nextInt();
    System.out.println("Ingrese otro número:");
    num2 = leer.nextInt();
    numero = num1 + num2;
    System.out.println("El número es:" + numero);
    }
    
}
