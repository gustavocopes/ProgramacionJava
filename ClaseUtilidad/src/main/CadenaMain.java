/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import entidades.Cadena;
import java.util.Scanner;
import servicios.CadenaServicio;

/**
 *
 * @author gcopes 
 */
public class CadenaMain {

    
    public static void main(String[] args) {// hay que corregir bugs
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        CadenaServicio cs = new CadenaServicio();
        Cadena miCadena = new Cadena();
        
        cs.mostrarVocales(miCadena);
        cs.invertirFrase(miCadena);
        System.out.println("Ingrese una letra: ");
        String letra = sc.next();
        cs.vecesRepetido(miCadena, letra);
        
        System.out.println("Ingrese otra frase:");
        String frase = sc.next();
        cs.compararLongitud(miCadena, frase);
        
        cs.unirFrase(frase, miCadena);
        System.out.print("Ingrese un caracter para reemplazar la letra a: ");
        cs.reemplazar(sc.next(), miCadena);
        System.out.println("Ingrese la letra que desea buscar: ");
        cs.contiene(sc.next(), miCadena);
    }

}
