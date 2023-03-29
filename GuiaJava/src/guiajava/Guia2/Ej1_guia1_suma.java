/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajava.Guia2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ej1_guia1_suma {

    
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
