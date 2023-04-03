/*
 scriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura 
y mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break.

 */

import java.util.Scanner;
public class Ej8_GuiaExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        int i = 0;
        int j = 0;
        int k = 0;
        do {
            System.out.println("Ingrese un número entero");
            n =  sc.nextInt();
            if (n%2 == 0){
                i++;
            }
            else {
                j++;
                     }
            k++;
            
        } while ((n%5) != 0 || n == 0);
        System.out.println("La cantidad de números pares es:" + i);
        System.out.println("La cantidad de números impares es: " + j );
        System.out.println("La cantidad total de números ingresado es: " + k);
    }
    
}
