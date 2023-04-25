/*
Método esMayorDeEdad(): indica si la persona es mayor de edad. 
La función devuelve un booleano.
Metodo crearPersona(): el método crear persona,
le pide los valores de los atributos al usuario 
y después se le asignan a sus respectivos atributos para llenar
el objeto Persona. Además, comprueba que el sexo introducido sea correcto, 
es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje


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
    Scanner sc = new Scanner(System.in);
    public void crearPersona(Persona p1){
        System.out.println("Indique el nombre de la persona: ");
        p1.setNombre(sc.nextLine());
        System.out.println("Indique la edad de " + p1.getNombre());
        p1.setEdad(sc.nextInt());
        System.out.println("");// char sexo = sc.next().charAt(0);
        //while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
    }
    public boolean esMayorDeEdad(){
        
    }
}
