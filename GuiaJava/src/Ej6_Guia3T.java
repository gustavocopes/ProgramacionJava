
import java.util.Scanner;

/*
 Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, 
en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa,
caso contrario se vuelve a mostrar el menú
 */

/**
 *
 * @author HP
 */
public class Ej6_Guia3T {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros positivos: ");
        int num1 = read.nextInt();
        int num2 =  read.nextInt();
        
             
        System.out.println("MENÚ");
        System.out.println("1.SUMAR");
        System.out.println("2.RESTAR");
        System.out.println("3.MULTIPLICAR");
        System.out.println("4.DIVIDIR");
        System.out.println("5.SALIR");
        System.out.println("Elija opción");
        
        int opcion = read.nextInt();
        
        switch(opcion){
                case 1: System.out.println("La suma de los número es: " +  (num1 + num2));
                break;
                case 2: System.out.println("La resta es: " + (num1 - num2));
                break;
                case 3: System.out.println("La multiplicación es:" + (num1 * num2));
                break;
                case 4: System.out.println("LA división es: " +  (num1/ num2)) ;
                break;
                case 5: System.out.println("Desea salir del programa S/N");
                        String eleccion = read.next();
                    if ("n".equalsIgnoreCase(eleccion)){
                           System.out.println("MENÚ");
                           System.out.println("1.SUMAR");
                           System.out.println("2.RESTAR");
                           System.out.println("3.MULTIPLICAR");
                           System.out.println("4.DIVIDIR");
                           System.out.println("5.SALIR");
                           System.out.println("Elija opción");
                        
                                          
                    }
                    
        
    }
    
}}
