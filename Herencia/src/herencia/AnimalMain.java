/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.ArrayList;

/**
 *
 * @author gcopes
 */
public class AnimalMain {

    public static void main(String[] args) {

        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        ArrayList<Animal> bichos = new ArrayList();
        bichos.add(a);
        bichos.add(b);
        bichos.add(c);
        
        for (Animal aux : bichos) {
            aux.hacerRuido();
        }
        
    }

}
