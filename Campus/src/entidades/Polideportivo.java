/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author gcopes
 */
public class Polideportivo extends Edificio{
    private String nombre;
    private boolean tipo;//false == abierto

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Polideportivo(String nombre, boolean tipo, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipo = tipo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
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

    public Polideportivo(String nombre) {
        this.nombre = nombre;
    }

    
    @Override
    public void calcularSuperficie(){
        System.out.println("La superficie del polideportivo " + getNombre() + " es: " + (ancho * largo) + " m^2");
    }
    
    @Override
    public void calcularVolumen(){
        System.out.println("El volumen del polideportivo " + getNombre() + " es: " + (ancho * largo * alto) + " m^3" );
    }
}
