
import java.util.Scanner;

/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto,
sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.
 */


public class Ej2_Guia2Practico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        String frase = leer.next();
        if ("eureka".equalsIgnoreCase(frase)){
            System.out.println("Es correcto!");
        }
        else {
            System.out.println("Es incorrecto!");
        }
        
    }
    
}
