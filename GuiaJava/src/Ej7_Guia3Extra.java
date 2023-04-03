/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). 
El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.
 */

import java.util.Scanner;
public class Ej7_Guia3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de números que desea calcular: ");
        int n = sc.nextInt();
        int i =0;
        int j = 0;
        double max = 0;
        double min = 0;
       
        double suma = 0;
//        do {
//            
//            System.out.println("Ingrese un número: ");
//            double num = sc.nextDouble();
//            if (i == 0) {
//                max = num;
//                min = num;    
//            }
//            else if (num > max) {
//                max = num;
//                
//            }
//            else if (num < min) {
//                min = num;
//                  }
//            if (num > 0){
//                suma = suma + num;
//                j++;
//            }
//            
//            i++;
//        } while (i <n);
        
        while (i < n){
             System.out.println("Ingrese un número: ");
            double num = sc.nextDouble();
            if (i == 0) {
                max = num;
                min = num;    
            }
            else if (num > max) {
                max = num;
                
            }
            else if (num < min) {
                min = num;
                  }
            if (num > 0){
                suma = suma + num;
                j++;
            }
            i++;
        }
        
        System.out.println("El número máximo es: " + max);
        System.out.println("El número mínimo es: " + min);

        System.out.println("El promedio es: " + (suma/j));

    }
    
}
