/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author gcopes
 */
public class Animal {
    
    public void hacerRuido(){
        System.out.println("Hola");
    }

    @Override
    public String toString() {
        return "Animal{" + '}';
    }
    
}
