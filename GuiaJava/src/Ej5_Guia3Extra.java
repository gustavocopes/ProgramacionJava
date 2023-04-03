/*
 Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento
(previo al descuento) y determine el importe en efectivo a pagar por dicho socio.

 */

import java.util.Scanner;
public class Ej5_Guia3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String letra = null;
        double trat;
        
        Scanner sc = new Scanner(System.in);
        
        
        do{ 
            System.out.println("Ingrese el tipo de socio: ");
            letra = sc.next();
        } while(letra.length() != 1);
       
                      
                      switch (letra.toUpperCase()) {
                      
                          case "A": System.out.println("Ingrese el monto del tratamiento: ");
                                    trat = sc.nextDouble();
                                    System.out.println("El valor del tratamiento para uds es: " + trat * 0.5);
                                    break;
                          case "B": System.out.println("Ingrese el monto del tratamiento: ");
                                    trat = sc.nextDouble();
                                    System.out.println("El valor del tratamiento para uds es: " + trat * 0.35);
                                    break;
                          case "C": System.out.println("Ingrese el monto del tratamiento: ");
                                    trat = sc.nextDouble();
                                    System.out.println("El valor del tratamiento para uds es: " + trat );
                                    break;
                          default: System.out.println("Ese tipo de socio no existe!");
                
                      }
                      
                      
                      
                      }      
              
              
        }
        
      

