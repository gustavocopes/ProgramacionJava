/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, 
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. 
Si no, se hace la multiplicación y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero,
.si fuera a pasar una división por cero, el método devuelve 0 y se le informa al usuario el error se le informa al usuario.
Si no, se hace la división y se devuelve el resultado al main.

 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author gcopes
 */

public class Operacion {
   private float numero1;
   private float numero2;
   
   public Operacion(float numero1, float numero2){
       this.numero1 =  numero1;
       this.numero2 = numero2;
       
   }

    public Operacion() {
    }

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor del número 1 : ");
        numero1 = sc.nextFloat();
        System.out.println("Ingrese el número 2: ");
        numero2 = sc.nextFloat();
    }
    
    public float sumar(){
        return numero1 + numero2;
    }
    public float restar(){
        return numero1 - numero2;
    }
    public float producto(){
        float multiplicacion;
        if (numero1== 0 || numero2 == 0){
            System.out.println("Error");
            multiplicacion = 0;
        }
        else {
            
                multiplicacion = numero1 * numero2;
                }
        return multiplicacion;
    }
       public float division(){
           
        if ( numero2 == 0){
            System.out.println("Error");
            return 0;
        }
        else {
            
                return numero1 / numero2;
                }
    }
    }





