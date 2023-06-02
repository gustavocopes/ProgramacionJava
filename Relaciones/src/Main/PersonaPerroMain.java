/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import Servicios.PersonaPerroService;
import relaciones.Perro;
import relaciones.Person;

/**
 *
 * @author gcopes 
 */
public class PersonaPerroMain {

    
    public static void main(String[] args) {
        PersonaPerroService pps = new PersonaPerroService();
        Person p1 = new Person();
        Person p2 = new Person();
        Perro c1 = new Perro();
        Perro c2 = new Perro();
        
        pps.cargarPerro(c1);
        pps.cargarPerro(c2);
        pps.cargarPersona(p1, c1);
        pps.cargarPersona(p2, c2);
        
        pps.mostrarPersona(p1);
        pps.mostrarPersona(p2);
    }

}
