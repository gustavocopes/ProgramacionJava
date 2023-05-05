/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import entidades.Persona;
import servicios.PersonaService;

/**
 *
 * @author gcopes 
 */
public class PersonaMain {

    
    public static void main(String[] args) {
        
        Persona p1 = new Persona();
        PersonaService ps = new PersonaService();
        
        ps.crearPersona(p1);
        
        
        
    }

}
