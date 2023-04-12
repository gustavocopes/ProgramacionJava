/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada operación matemática 
y deben devolver sus resultados para imprimirlos en el main. 
 */

import java.util.Scanner;

public class Ej1_SubprogramaGuia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos números: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double sumar = suma(num1,num2);
        double cociente = dividir(num1,num2);
        double resto = restar(num1,num2);
        double producto = multiplicar(num1,num2);
        int opcion;
        
        
        do{
        System.out.println("Ingrese la operación que desea realizar: ");
        
        System.out.println("1 . Suma");
        System.out.println("2 . Resta");
        System.out.println("3 . Multiplicar");
        System.out.println("4 . Dividir");
        System.out.println("5. Salir");
        
        opcion = sc.nextInt();
       
        switch(opcion){
            case 1: System.out.println(sumar);
            break;
            case 2: System.out.println(resto);
            break;
            case 3: System.out.println(producto);
            break;
            case 4: System.out.println(cociente);
            break;
            
        }
    }while(opcion != 5);
    }
    
    public static double suma(double num1, double num2){
        double suma = num1 + num2 ;
        return suma;
    }
     public static double restar(double num1, double num2){
        double resta = num1 - num2 ;
        return resta;
    }
      public static double multiplicar(double num1, double num2){
        double multiplicar = num1 * num2 ;
        return multiplicar;
    }
       public static double dividir(double num1, double num2){
        double dividir = num1 / num2 ;
        return dividir;
    }
}
