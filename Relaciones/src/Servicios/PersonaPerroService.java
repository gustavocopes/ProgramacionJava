/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Scanner;
import relaciones.Perro;
import relaciones.Person;

/**
 *
 * @author gcopes
 */
public class PersonaPerroService {
    Scanner sc = new Scanner(System.in);
    public void cargarPerro(Perro p1){
        System.out.println("Ingrese el nombre del perro: ");
        p1.setNombre(sc.next());
        System.out.println("Ingrese la raza del perro: ");
        p1.setRaza(sc.next());
        System.out.println("Ingrese la edad del perro: ");
        p1.setEdad(sc.nextInt());
        System.out.println("Ingrese el tamaño del perro: ");
        p1.setSize(sc.next());
    }
    
    public void cargarPersona(Person p1, Perro can){
        System.out.println("Ingrese el nombre de la persona: ");
        p1.setNombre(sc.next());
        System.out.println("Ingrese el apellido de la persona: ");
        p1.setApellido(sc.next());
        System.out.println("Ingrese la edad de la persona: ");
        p1.setEdad(sc.nextInt());
        System.out.println("Ingrese el número de documento de la persona: ");
        p1.setDocumento(sc.nextInt());
        p1.setCan(can);
    }
    
    public void mostrarPersona(Person p1){
        System.out.println(p1.getNombre() + p1.getApellido() + " tiene: " + p1.getEdad() + " años, su dni es: " + p1.getDocumento() + " y su mascota es: " + p1.getCan());
    }
}
