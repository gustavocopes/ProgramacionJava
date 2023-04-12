/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N,
con los valores ingresados por el usuario.
 */
import java.util.Scanner;

public class Ej1_guia5ExtraSumaVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] vector = new float[3];
        float suma = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el elmento " + i);
            vector[i] = sc.nextFloat();
            suma = suma + vector[i];
        }
        System.out.println("La suma es: "  + suma);
    }

}
