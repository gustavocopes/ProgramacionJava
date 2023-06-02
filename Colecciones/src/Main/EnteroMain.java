/*
  Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class EnteroMain {

    public static void main(String[] args) {

        List<Integer> enteros = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int suma = 0;
        do {
            System.out.println("Ingrese un número entero o -99 para finalizar: ");
            num = sc.nextInt();
            if(num == -99){
                break;
            }
            else{
            
            enteros.add(num);
            suma = suma + num;}
        }while (num != -99);
        
        for (Integer aux : enteros) {
            System.out.println(aux);
        }
                System.out.println("El promedio es: " + suma/(enteros.size()));
            }
        }


    
