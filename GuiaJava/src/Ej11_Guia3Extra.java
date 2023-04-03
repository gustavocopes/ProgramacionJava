/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número. 
Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. 
Calcular la cantidad de dígitos matemáticamente utilizando el operador de división.
Nota: recordar que las variables de tipo entero truncan los números o resultados.

 */
import java.util.Scanner;
public class Ej11_Guia3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero: ");
        double num  = sc.nextDouble();
        double div = num/10;
        int i = 1;
        
        while (div > 1) {
            div = div / 10;
            i++;
        } 
        
        
        System.out.println("La cantidad de dígitos es: " + i );
        
    }
    
}
