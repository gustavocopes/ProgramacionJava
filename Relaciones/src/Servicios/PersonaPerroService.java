/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.ArrayList;
import java.util.Scanner;
import relaciones.Perro;
import relaciones.Person;

/**
 *
 * @author gcopes
 */
public class PersonaPerroService {

    Scanner sc = new Scanner(System.in);
    ArrayList<Perro> can = new ArrayList();
    ArrayList<Person> papas = new ArrayList();

    public void cargarPerro() {

        String opc = null;
        do {
            Perro p1 = new Perro();
            System.out.println("Ingrese el nombre del perro: ");
            p1.setNombre(sc.next());
            System.out.println("Ingrese la raza del perro: ");
            p1.setRaza(sc.next());
            System.out.println("Ingrese la edad del perro: ");
            p1.setEdad(sc.nextInt());
            System.out.println("Ingrese el tamaño del perro: ");
            p1.setSize(sc.next());

            can.add(p1);
            System.out.println("Desea ingresar otro perrito a la base de datos?:  s/n ");
            opc = sc.next();
        } while (opc.equalsIgnoreCase("s"));
    }

    public void cargarPersona() {

        String opc = null;
        do {
            Person papa1 = new Person();
            System.out.println("Ingrese el nombre de la persona: ");
            papa1.setNombre(sc.next());
            System.out.println("Ingrese el apellido de la persona: ");
            papa1.setApellido(sc.next());
            System.out.println("Ingrese la edad de la persona: ");
            papa1.setEdad(sc.nextInt());
            System.out.println("Ingrese el número de documento de la persona: ");
            papa1.setDocumento(sc.nextInt());

            papas.add(papa1);
            adoptarPerro();
            //p1.setCan(can);//esto es de la primera versión del ejercicio donde se le asignaba al perro, ahora adopta de una lista
            System.out.println("Desea cargar otra persona a la base de datos? : s/n");
            opc = sc.next();
        } while (opc.equalsIgnoreCase("s"));
    }

    public void mostrarPersona() {
        System.out.println(papas);
    }

    public void adoptarPerro() {

        System.out.println("Los perros de la base de datos son: ");
        for (Perro aux : can) {
            System.out.println(aux);
        }// recorro y muestro todos los perros de la lista

        System.out.println("Elija, por su nombre, al perro que quiere adoptar:");
        String perroAdoptado = sc.next();
        
        for (Perro aux : can) {
            //Perro adoptado = new Perro();
            if (perroAdoptado.equalsIgnoreCase(aux.getNombre())) {
                for (int i = 0; i < papas.size(); i++) {

                    if (!aux.equals(papas.get(i).getCan())) {//algo falla aca
                        papas.get(i).setCan(aux);                        
                    } 
                    else {
                       System.out.println("Lo lamento, este perro ya fue adoptado!") ;
                    }
                }
            }
            else {
                System.out.println("Este perro no está en la base de datos!");
            }
        }

    }
}
