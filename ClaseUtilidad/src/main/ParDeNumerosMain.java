/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import entidades.ParDeNumeros;
import java.util.Scanner;
import servicios.ParDeNumerosServicio;

/**
 *
 * @author gcopes 
 */
public class ParDeNumerosMain {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParDeNumerosServicio cs = new ParDeNumerosServicio();
        ParDeNumeros numero = new ParDeNumeros();
        
        cs.mostrarValores(numero);
        System.out.println("El número mayor es: " + cs.devolverMayor(numero));
        
        System.out.println("La potencia es: " + cs.calcularPotencia(cs.devolverMayor(numero),numero));
        
        System.out.println("La raíz es: " + cs.calculaRaiz(numero) );
    }

}
