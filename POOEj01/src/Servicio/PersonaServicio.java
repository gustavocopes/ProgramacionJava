/*
Método esMayorDeEdad(): indica si la persona es mayor de edad. 
La función devuelve un booleano.
Metodo crearPersona(): el método crear persona,
le pide los valores de los atributos al usuario 
y después se le asignan a sus respectivos atributos para llenar
el objeto Persona. Además, comprueba que el sexo introducido 
sea correcto, es decir, H, M o O. Si no es correcto se deberá 
mostrar un mensaje


Método calcularIMC(): calculara si la persona está en su peso ideal 
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su peso ideal
y la función devuelve un -1. Si la fórmula da por resultado un número
entre 20 y 25 (incluidos), significa que la persona está en su peso ideal 
y la función devuelve un 0. Finalmente, si el resultado de la fórmula 
es un valor mayor que 25 significa que la persona tiene sobrepeso,
y la función devuelve un 1.

 */
package Servicio;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class PersonaServicio {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
   
    
    
    public Persona crearPersona(){
          int edad;
        String nombre;
        char sexo;
        float peso, altura;

        
        System.out.println("\nIndique el nombre de la persona: ");
        nombre = sc.next();
        System.out.println("Indique la edad: " );
        edad = sc.nextInt();
        System.out.println("Ingrese el sexo: H/M/O");
        sexo = sc.next().charAt(0);
        System.out.println("Ingrese el peso: ");
        peso = sc.nextFloat();
        System.out.println("Ingrese la altura: ");
        altura = sc.nextFloat();
        
        return new Persona(nombre, edad, sexo, peso, altura);
    }
    public boolean esMayorDeEdad(Persona p1){
        boolean mayor = true;
        if(p1.getEdad() >=18){
            return mayor;
        }
        
        else{ 
            mayor = false;
            return mayor;
    }
}    
    public int calcularIMC(Persona p1){
        float imc;
        imc = (float) (p1.getPeso() / (Math.pow(p1.getAltura(),2))); //peso en kg/(altura^2 en mt2)
        if(imc < 20){
            return -1;
        }
        else if(imc >= 20 && imc <= 25 ){
            return 0;
        }
        else return -1;
     }
    
}