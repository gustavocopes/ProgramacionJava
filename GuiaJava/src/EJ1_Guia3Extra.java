/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.

 */

import static java.lang.Math.floor;
import java.util.Scanner;
public class EJ1_Guia3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int tiempo;
        double dias,horas, minutos;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos: ");
        tiempo = sc.nextInt();
        
        if (tiempo >= 1440){
            
            dias = tiempo/1440; // 
            horas = (tiempo%1440) / 60;  
            minutos = (horas%60);
            System.out.println("El tiempo ingresado  es: " + floor(dias) + " días " + floor(horas) + " horas " + minutos + " minutos");
        }
        
        else {
                
              horas = tiempo / 60;
              minutos = (tiempo%60);  
              System.out.println("El tiempo ingresado es: " + floor(horas) + " horas " + minutos + " minutos");
                }
    }
    
}
