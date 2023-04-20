/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casino;

/**
 *
 * @author gcopes
 */
public class adivinanza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego adivinanza1= new Juego();
        adivinanza1.crearNumero();
         System.out.flush();  
        adivinanza1.adivinarNumero();
    }
    
}
