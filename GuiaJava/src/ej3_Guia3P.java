
import java.util.Scanner;

/*
 Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */

/**
 *
 * @author HP
 */
public class ej3_Guia3P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        String frase = read.next();
        
        if (frase.length() == 8){
            System.out.println("Es correcto!");
        }
        
        else {
            System.out.println("Es incorrecto!");
        }
    }
    
    
    
}
