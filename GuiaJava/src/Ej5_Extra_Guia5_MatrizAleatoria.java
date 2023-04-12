/*
Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
 */

/**
 *
 * @author gcopes
 */
public class Ej5_Extra_Guia5_MatrizAleatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N = 3;
        int M = 4;
        float[][] matriz = new float[N][M];
        ///float suma;
        //suma = rellenar(matriz);
        System.out.println("La suma de los elementos de la matriz es: " + rellenar(N,M,matriz));
    }
    public static float rellenar(int N, int M, float[][] matriz){
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = (float)(Math.random()*10);
                
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("[" + matriz[i][j] + "]");
                
            }
            System.out.println(" ");
        }
        float total = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                total = total + matriz[i][j];
                
            }
        }
        return total;
    }
}
