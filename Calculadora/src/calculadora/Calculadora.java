/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero,
el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, 
el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Operacion calculo1 = new Operacion();
        Scanner sc = new Scanner(System.in);
        calculo1.crearOperacion();
        System.out.println("¿Qué operación desea realizar?");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("El resultado de la suma es:" + calculo1.sumar());
                break;
            case 2:
                System.out.println("El resultado de la resta es:" + calculo1.restar());
                break;
            case 3:
              //double resultadoMultiplicacion = 
//                if(resultadoMultiplicacion == 0) {
//                    System.out.println("No se puede multiplicar por cero.");
//                } else {
                    System.out.println("El resultado de la multiplicación es: " + calculo1.producto());
               // }
                break;
            case 4:
                double resultadoDivision = calculo1.division();
                if(resultadoDivision == 0) {
                    System.out.println("No se puede dividir por cero.");
                } else {
                    System.out.println("El resultado de la división es: " + resultadoDivision);
                }
                break;
            default:
                System.out.println("Opcion invalida");
    }
    
}
}
