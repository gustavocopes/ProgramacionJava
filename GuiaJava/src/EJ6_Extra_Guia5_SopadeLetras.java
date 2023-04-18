/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando, 
construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres.
Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria. 
Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9.
Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().
 */

/**
 *
 * @author gcopes
 */
import static java.lang.Math.abs;
import java.util.Scanner;

public class EJ6_Extra_Guia5_SopadeLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    }
    public static String sopa(){
        Scanner sc = new Scanner(System.in);
        String palabra = null, palabra1, palabra2, palabra3, palabra4;
        String[][] SopaLetra = new String[20][20];
        
        for (int i = 0; i < 5; i++) {
            do{
                System.out.println("Ingrese una palabra: ");
                palabra = sc.next();
            }while(palabra.length()< 3 || palabra.length()>5);
            
            do{
                System.out.println("Ingrese una palabra: ");
                palabra1 = sc.next();
            }while(palabra1.length()< 3 || palabra1.length()>5);
            do{
                System.out.println("Ingrese una palabra: ");
                palabra2 = sc.next();
            }while(palabra2.length()< 3 || palabra2.length()>5);
            do{
                System.out.println("Ingrese una palabra: ");
                palabra3 = sc.next();
            }while(palabra3.length()< 3 || palabra3.length()>5);
            do{
                System.out.println("Ingrese una palabra: ");
                palabra4 = sc.next();
            }while(palabra4.length()< 3 || palabra4.length()>5);
            
            
            }
        
            for (int i = 0; i < 20; i++) {
                int h = abs((int)(Math.random()*19)- i);
                for (int j = 0; j < 20; j++) {
                    
                    SopaLetra[i][h]= palabra.substring(0, palabra.length());
                            
            }
        }
        
        
        
        return 
    }
}
