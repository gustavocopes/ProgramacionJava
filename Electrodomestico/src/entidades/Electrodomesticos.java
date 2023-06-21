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

    private double precio;
    private String color = "Blanco";
    private char consumoEnergetico = 'F';
    private int peso;
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Electrodomesticos(double precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Electrodomesticos() {
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
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
        // no está funcionando este método
        for (energia aux : energia.values()) {
          
               if (!aux.toString().equals(consumoEnergetico)) {
            setConsumoEnergetico('F');
        }
    }}

    public void comprobarColor(String colors) {// no está funcionando este método
        
        
        for (colore aux : colore.values()) {
            
            if (aux.toString().equalsIgnoreCase(colors)){
            setColor(aux.getColores());
        }
           
        
        }
    }
        /*Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.*/
    public void crearElectrodomestico() {
        setPrecio(1000d);//seteo precio base
        System.out.println("Ingrese el peso del eletrodoméstico en kg: ");
        setPeso(sc.nextInt());
        System.out.println("Ingrese el color: ");
        setColor(sc.next());
        comprobarColor(getColor());
        System.out.println("Ingrese el tipo de consumo energético: ");
        setConsumoEnergetico(sc.next().charAt(0));
        comprobarConsumoEnergetico(getConsumoEnergetico());
    }
    /*Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:*/
    public void precioFinal(){
        double precioEnergia= 0;
        double precioPeso = 0 ;
        switch(getConsumoEnergetico()){
            case 'A': precioEnergia = 1000d;
            break;
            case 'B':precioEnergia = 800d;
            break;
            case 'C':precioEnergia = 600d;
            break;
            case 'D': precioEnergia = 500d;
            break;
            case 'E':precioEnergia = 300d;
            break;
            case 'F': precioEnergia = 100d;
            break;
        }
        if(getPeso()> 0 && getPeso() <19){
            precioPeso = 100;
        }
        if(getPeso()> 0 && getPeso() <19){
            precioPeso = 500;
        }
        if(getPeso()> 0 && getPeso() <19){
            precioPeso = 800;
        }
        if(getPeso()> 0 && getPeso() <19){
            precioPeso = 1000;
        }
        setPrecio(getPrecio() + precioEnergia + precioPeso);
        System.out.println("El precio es " + getPrecio());
    }
    
}



