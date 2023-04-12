/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
Después haremos otra función o procedimiento que imprima el vector.
 */
public class Ej3_Extra_ArreglosenFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[3];
        rellenar(vector);
        mostrar(vector);
    }
    public static int[] rellenar(int[] vector){
        
        for (int i = 0; i <3 ; i++) {
            vector[i] = (int)(Math.random()*2);
        }
        return vector;
    }
    public static void mostrar(int[] vector){
        for (int i = 0; i < 3; i++) {
            System.out.print("["+ vector[i] + "]");
            
        }
    }
}
