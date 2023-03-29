/*
Escribir un programa que pida una frase y la muestre toda en mayÃºsculas y despuÃ©s toda en minÃºsculas. 
Nota: investigar la funciÃ³n toUpperCase() y toLowerCase() en Java
 */
package ej_gui1_java;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


/**
 *
 * @author HP
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String frase, fraseM, frasem; //defino variables del tipo string
      
      Scanner leer = new Scanner(System.in); // defino scanner leer
      
        System.out.println("Ingrese una frase: "); // Imprimo en pantalla la orden al usuario
        frase = leer.next(); // guardo en la variable frase el valor que el usuario ingresa por teclado
        
        fraseM = toUpperCase(frase); // convierto frase a letras mayúsculas
        frasem = toLowerCase(frase); // convierto frase a letras minúscula
        
        System.out.println("La frase en minúscula es: " + frasem); //Imprimo en pantalla  la frase en minúscula
        System.out.println("La frase en mayúscula es: " + fraseM); // Imprimo en pantalla la frase en mayúscula
    }
    
}
