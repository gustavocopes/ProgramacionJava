/*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro 
para que nos indique si es o no un número primo
, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

 */
import java.util.Scanner;
public class Ej4_nrsPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do{
        System.out.println("Ingrese un número natural: ");
        numero = sc.nextInt();
        } while(numero < 1);
        boolean prim = primo(numero);
        System.out.println(prim);
    }
    public static boolean primo(int numero){
        int j= 0;

        for(int i=2;i<=numero;i++){
            if(numero%i==0){
                j++;
                               
            }}
        
            if (j>1 || numero == 1){
                return false;
            }
            else {
                return true;                       
            }
        }
            
    
}
