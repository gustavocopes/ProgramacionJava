/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9, con la particularidad que 
cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
public class Ej12_Guia3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num = Math.floor(Math.random()*10);
                double num1 = Math.floor(Math.random()*10);
                        double num2 = Math.floor(Math.random()*10);


        if (num == 3){
                       
            String letra ="E";
             System.out.println(letra + "-" + num2 + "-" + num2);     
        }
        else if (num1 == 3){
            String letra = String.valueOf(num1);
           
            letra ="E";
           
        }
        else if (num2 == 3){
             
           String letra = "E";
            System.out.println(num + "-" + num1 + "-" + letra);
        }
        else{
        System.out.println(num + "-" + num1 + "-" + num2);
        
        }
        
    }
}