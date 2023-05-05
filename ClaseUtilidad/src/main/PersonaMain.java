/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import entidades.Persona;
import java.util.Scanner;
import servicios.PersonaService;

/**
 *
 * @author gcopes 
 */
public class PersonaMain {

    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        Persona p1 = new Persona();
        PersonaService ps = new PersonaService();
        
        ps.crearPersona(p1);
        
        System.out.println("Compare una edad: ");
        if (ps.menorQue(p1, sc.nextInt())) {
            System.out.println(p1.getNombre() + " es menor a la edad ingresada");
            
        }
        else {
            System.out.println(p1.getNombre() + " es mayor a la edad ingresada");
        }
        ps.mostarPersona(p1, ps.calcularEdad(p1));
        
    }

}
