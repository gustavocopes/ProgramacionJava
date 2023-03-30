/*
 * Implementar un programa que le pida dos números enteros al usuario y determine si ambos 
 o alguno de ellos es mayor a 25.
 */

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Ej6_Guia2T {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        num1= leer.nextInt();
        
        System.out.println("Ingrese otro número: ");
        num2 = leer.nextInt();
        
        if (num1 > 25){
            System.out.println(num1 + " es mayor a 25");
            }
        if (num2 > 25){
            System.out.println(num2 + " es mayor a 25");
        }
        else{
            System.out.println("Ningún número es mayor a 25");
        }
    }
    }
    
