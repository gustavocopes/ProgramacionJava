/*
 Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.
 */
public class Ej1_Guia5_100N {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] enteros = new int[100];

        for (int i = 0; i < 100; i++) {
            enteros[i] = i;//(int) (Math.random() * 10);
        }
        for (int j = 99; j < 0; j--) {
            System.out.println(" " + enteros[j]);
            
        }
    }

}
