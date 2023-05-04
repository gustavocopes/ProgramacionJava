/*
 Crear en el Main dos arreglos. El arreglo A de 50 números reales
y el arreglo B de 20 números reales. 

inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.

 */

package main;

import servicios.ArregloServicio;

/**
 *
 * @author gcopes 
 */
public class ArregloMain {

    
    public static void main(String[] args) {
        
        ArregloServicio as = new ArregloServicio();
        
        float[] arregloA = new float[50];
        float[] arregloB = new float[20];
        
        as.inicializarA(arregloA);
        as.mostrar(arregloA);
        as.ordenar(arregloA);
        as.inicializarB(arregloA, arregloB);
        System.out.println("El arreglo A es: ");
        as.mostrar(arregloA);
        System.out.print("El arreglo B es: ");
        as.mostrar(arregloB);
        
        
    }

}
