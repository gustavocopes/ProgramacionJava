/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

/**
 *
 * @author gcopes
 */
import Enitdad.Persona;
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona Persona1 = new Persona("Carlos",25,"argentino");
        Persona Persona2 = new Persona("Lorena",18,"colombiana");
        Persona1.getEdad();
    }
    
}
