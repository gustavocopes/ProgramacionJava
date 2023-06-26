/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package animales;

/**
 *
 * @author GCopes
 */
public class AnimalMain {

    public static void main(String[] args) {
       Animal perro1 = new Perro("pepe",2,"carne","calle");
       Animal perro2 = new Perro("Tedy",12,"croqueta","chihuahua");
       Animal gato1 = new Perro("pelusa",16,"galletas","siames");
       Animal caballo1 = new Perro("Spark",22,"pasto","fino");
       
       perro1.Alimentarse();
       perro2.Alimentarse();
       gato1.Alimentarse();
       caballo1.Alimentarse();
       
    }

}
