/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. 
A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales
y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */

/**
 *
 * @author HP
 */
public class Ej2_Guia3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int A = 2;
        int B = 5;
        int C = 12;
        int D = 8;
        
        System.out.println("A = " + A);
           System.out.println("B = " + B);
              System.out.println("C = " + C);
                 System.out.println("D = " + D);
        int aux = B;
        
        B = C;
        
        C = A;
        
        A = D;
        
        D = aux;
        
         System.out.println("A = " + A);
           System.out.println("B = " + B);
              System.out.println("C = " + C);
                 System.out.println("D = " + D);
        
        
        
    }
    
}
