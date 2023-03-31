
import java.util.Scanner;

/*
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado seguido de tantos asteriscos como indique su valor.
Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 */


public class Ej10_GuiaT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador = 0;
        for (int i=0;i <4;i++){
        System.out.println("Ingrese un número: ");
        int numero = leer.nextInt();
        
        if (numero < 1 || numero > 20){
            do {
            System.out.println("Ingrese un número entre 0 y 20: ");
            numero = leer.nextInt();
            } while (numero < 1 || numero > 20);
        }
           
        System.out.print(numero);
        do {
            contador++;
            System.out.print( "*");
        } while(contador < numero );
        contador = 0;
        }
    }
    
}
