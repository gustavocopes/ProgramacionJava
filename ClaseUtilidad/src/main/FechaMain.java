/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import servicios.FechaService;

/**
 *
 * @author gcopes 
 */
public class FechaMain {

    
    public static void main(String[] args) {
        
        FechaService fs = new FechaService();
        //System.out.println(fs.fechaNacimiento());
        
        System.out.println(fs.fechaActual());
        
        System.out.println("La edad es: " + fs.diferencia(fs.fechaNacimiento(), fs.fechaActual()));
        
    }

}
