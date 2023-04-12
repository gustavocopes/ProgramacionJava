/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado
e indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle al usuario 
si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */

import java.util.Scanner;

public class Ej2_FuncionesNombre_edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String opcion; 
        System.out.println("Desea ingresar un nombre (Si/No): ");
        opcion = leer.next();
            
        while (!"No".equalsIgnoreCase(opcion)) {
            System.out.println("Desea ingresar un nombre (Si/No): ");
            opcion = leer.next();
            
            datos();          
        } 
              
    }
    public static void datos(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        
        System.out.println("El nombre es: " + nombre);
        System.out.println("Tiene " + edad + " años");
        if (edad >=18){
        System.out.println("Es mayor de edad");
             }
        else {
            System.out.println("Es menor de edad");
        }
}
}