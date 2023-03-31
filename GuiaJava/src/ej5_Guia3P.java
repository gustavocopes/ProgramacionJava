
import java.util.Scanner;

/*
 Escriba un programa en el cual se ingrese un valor límite positivo,
y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */

/**
 *
 * @author HP
 */
public class ej5_Guia3P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese un valor límite: ");
        int numero = read.nextInt();
        int suma = 0;
        do {
            System.out.println("Ingrese un número: ");
            int num = read.nextInt();
            suma = suma + num;
        } while ( suma < numero);
    }
    
    
    
}
