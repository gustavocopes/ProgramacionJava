/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Servicio.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class cafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CafeteraServicio cafe1 = new CafeteraServicio();
        cafe1.crearCafetera();
        int opcion;
        do{
        System.out.println("-----Menú-----");
        System.out.println("1. Llenar Cafetera");
        System.out.println("2. Servir café");
        System.out.println("3. Vaciar cafetera");
        System.out.println("4. Ingresar café");
        System.out.println("5. Apagar cafetera\n");
        
        System.out.println("Ingrese un acción: ");
        opcion = sc.nextInt();
        
        switch  (opcion){
            case 1: cafe1.llenarCafetera();
                break;
            case 2: System.out.println("Ingrese el tamaño de la taza: ");
                      cafe1.servirTaza(sc.nextInt());
                break;
            case 3: cafe1.vaciarCafetera();
                break;
            case 4:  System.out.println("Ingrese la cantidad de café que desea añadir: ");
                      cafe1.agregarCafe(sc.nextInt());
                break;
            case 5: System.out.println("Cafetera apagada...");
                break;
            default:
            
        }
        }while(opcion !=5);
    }
    
}
