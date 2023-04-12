/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,
sus columnas y sus diagonales son idénticas.
Crear un programa que permita introducir un cuadrado por teclado y
determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.
 */
import java.util.Scanner;
public class Ej6_Guia5CuadradoMagico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] cuadrado = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor " + "["+ i + "]" + "[" + j + "] de la matriz: ");
                cuadrado[i][j] = sc.nextInt();
            }
        }
       for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cuadrado[i][j]);
                
            }
            System.out.println(" ");
        } 
       int suma =0;
       
    int suma1 = 0;
    int suma2 = 0;
    for(int i = 0; i < 3; i++) {
            
                suma = suma + cuadrado[i][0];
            }
    for (int i = 0; i < 3; i++) {
            
                suma1 = suma1 + cuadrado[1][i];
            }
    for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i==j){
                suma2 = suma2 + cuadrado[i][j];}
                
            }
       
        }
    if(suma== suma1 && suma1 == suma2){
            System.out.println("La matriz es mágica!");
                
            }
    else{
            System.out.println("La matriz NO es mágica");
        }
    
    
    }
    
}
