
import static java.lang.Math.abs;

/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
 */


public class Ej2_Guia5_Extra_ProgramaDosVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector1 = new int[3];
        int[] vector2 = new int[3];
        
        for (int i = 0; i < 3; i++) {
            vector1[i] = abs((int)(Math.random()*10 -8));
            vector2[i] = abs((int)(Math.random()*10 -8));
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.print(vector1[i]);
            
        }
        System.out.println(" / ");
        for (int i = 0; i < 3; i++) {
            System.out.print(vector2[i]);
            
        }
        int j =0;
        for (int i = 0; i < 3; i++) {
          if (vector1[i] != vector2[i]) {
              
              j++;
               
        }  }
        if (j== 0){
            System.out.println(" Los vectores son iguales!");
        }
        else {
            System.out.println(" Los vectores son distintos");
        }
         
        
    }
    
}
