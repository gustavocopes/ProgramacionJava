
import java.util.Scanner;

/*
 Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’.
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */


public class ej4_Guia3P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        String frase = read.next();
        
        if ("a".equalsIgnoreCase(frase.substring(0,1))) {
            System.out.println("Correcto");
        }
        else {
            System.out.println("Incorrecto");
        }
        
    }
    
}
