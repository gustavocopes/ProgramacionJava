 /*
Crear un programa que dibuje una escalera de números, donde cada línea de números comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123

 */
import java.util.Scanner;

public class Ej13Guia3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la altura de la escalera: ");
        int altura = sc.nextInt();
        
        for(int i = 1; i < altura; i++){
            System.out.println(i);
             for(int j= i +1; j<i; j++){
                System.out.print( i + " " + j);
            }
                    }
    }}
    
    

