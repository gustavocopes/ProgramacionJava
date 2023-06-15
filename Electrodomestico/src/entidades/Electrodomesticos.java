/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author GCopes
 */
public class Electrodomesticos {

    private String precio;
    private String color;
    private char consumoEnergetico;
    private int peso;
    private Scanner sc = new Scanner(System.in);

    public Electrodomesticos(String precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Electrodomesticos() {
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char consumoEnergetico) {
        System.out.println("Ingrese el consumo energético: ");
        char consumoEnergetico = {'A', 'B', 'C', 'D', 'E', 'F'};
        if (!sc.next().charAt(0).opc) {
            setConsumoEnergetico('F');
        }
    }

    public void comprobarColor(String color) {

        if (!color.equalsIgnoreCase("blanco", "negro")) {
            setColor("blanco");
        }}
        /*Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.*/
    public void crearElectrodomestico() {
        System.out.println("Ingrese el color: ");
        setColor(sc.next());
        comprobarColor(color);
        System.out.println("Ingrese el tipo de consumo energético: ");
        setConsumoEnergetico(sc.next().charAt(0));
        comprobarConsumoEnergetico(setConsumoEnergetico(sc.next().charAt(0)))
    }
}



