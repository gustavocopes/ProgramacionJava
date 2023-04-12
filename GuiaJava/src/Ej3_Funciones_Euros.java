/*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda,
estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, 
este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
import java.util.Scanner;

public class Ej3_Funciones_Euros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros que desea convertir: ");
        double euro = sc.nextDouble();
        System.out.println("Ingrese la moneda a la que desea convertir: ");
        String moneda = sc.next();
        
        cambio(euro, moneda);
        
    }
    public static void cambio(double euro, String moneda){
        
        switch (moneda){
            case "libras": System.out.println("€" + euro + "equivalen a £" + (euro * 0.86));//alt +156.  libras
            break;
            case "dolares": System.out.println("€" + euro + "equivalen a $" + (euro * 1.28611));
            break;
            case "yenes":  System.out.println("€" + euro + "equivalen a ¥" + (euro * 0.86)); // alt +190, yenes
            break;
            default: System.out.println("No existe información sobre este tipo de moneda");
        }
        
    }
}
