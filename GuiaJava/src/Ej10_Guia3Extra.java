/*
Realice un programa para que el usuario adivine el resultado de una multiplicación
entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. 
En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como utilizar la 
función Math.random() de Java.

 */
import java.util.Scanner;
public class Ej10_Guia3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = Math.floor(Math.random()*10);
        double num2 = Math.floor(Math.random()*10);
        System.out.println(num1);
        System.out.println(num2);
        
        System.out.println("Este programa a multiplicado dos números entre 0 y 10.  Adivine el resultado: ");
        double adiv = sc.nextDouble();
        
        while ((num1 * num2 != adiv)) {
            System.out.println("No adivinó!. Intente de nuevo: ");
            adiv = sc.nextDouble();
//            if ((num1 * num2) == adiv ) {
//            System.out.println("Respuesta correcta!");
//            
//        }
        }
        if ((num1 * num2) == adiv ) {
            System.out.println("Respuesta correcta!");
            
        }
        
        
    }
    
}
