/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import Servicios.PersonaPerroService;
import java.util.ArrayList;
import relaciones.Perro;
import relaciones.Person;

/**
 *
 * @author gcopes 
 */
public class PersonaPerroMain {

    
    public static void main(String[] args) {
        PersonaPerroService pps = new PersonaPerroService();
      
        pps.cargarPerro();// cargo los perritos
        pps.cargarPersona();//contiene errores
        
        pps.mostrarPersona();
      

}}
