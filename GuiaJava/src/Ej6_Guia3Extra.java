/*
 Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */

import java.util.Scanner;
public class Ej6_Guia3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double suma =0 ;
        int n = 0;
        int j=0;
        double sumaT = 0;
        for (int i = 1 ; i < 5; i++) {
            
            System.out.println("Ingrese la estatura de la pregunta " + i);
            
            double estatura = sc.nextDouble();
            
            if (estatura <1.6){
                suma = suma + estatura;
                n++; 
            }
            
            sumaT = sumaT + estatura;
                
                j++;
                
            }
            
             System.out.println("El promedio de la estatura de las personas de menos 1.6 m es: " + (suma / n)); 
             System.out.println("El promedio total: " + (sumaT / j));
        }
                
    }
    
