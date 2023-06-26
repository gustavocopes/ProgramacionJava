/*
Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class EdificioDeOficinas extends Edificio {
    private int numOficinas;
    private int personas;
    private int pisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numOficinas, int personas, int pisos) {
        this.numOficinas = numOficinas;
        this.personas = personas;
        this.pisos = pisos;
    }

    public EdificioDeOficinas(int numOficinas, int personas, int pisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.personas = personas;
        this.pisos = pisos;
    }

    public EdificioDeOficinas(double ancho, double alto, double largo) {
        super(ancho, alto, largo);
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    @Override
    public void calcularSuperficie(){
        System.out.println("La superficie del edificio de oficinas es: " +  ancho * largo + " m^2.");
    }
    @Override
    public void calcularVolumen(){
        System.out.println("El volumen del edificio de oficinas es: " + ancho * largo * alto + " m^3."); 
    }
    /*De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.*/
    public void cargarEdificioOficina(){
            Scanner sc = new Scanner(System.in).useDelimiter("\n");
            System.out.println("Ingrese cuántas personas entran en cada oficina:  ");
            setPersonas(sc.nextInt());
            System.out.println("Ingrese cuántas oficinas hay en cada piso: ");
            setNumOficinas(sc.nextInt());
            System.out.println("Ingrese cuántos pisos posee el edificio: ");
            setPisos(sc.nextInt());
    }
    
    public void cantPersonas(){
        cargarEdificioOficina();
        System.out.println("En un piso de este edificio caben " + (getPersonas() * getNumOficinas() + " personas."));
        System.out.println("En este edificio caben " + getPisos() * getPersonas() * getNumOficinas() + " personas." );
    }
}
