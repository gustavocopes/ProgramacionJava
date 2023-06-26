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
public class Animal {
    private String nombre;
    private int edad;
    private String alimento;
    private String raza;

    public Animal(String nombre, int edad, String alimento, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.alimento = alimento;
        this.raza = raza;
    }

    public Animal() {
    }
    
    public void Alimentarse(){
        System.out.println(nombre + " tiene " + edad + " y se alimenta de " + alimento);
    }
}
