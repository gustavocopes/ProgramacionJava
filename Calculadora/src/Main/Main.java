/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import calculadora.Raices;
import Servicio.RaicesServicios;

import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RaicesServicios rs = new RaicesServicios();
        Raices eq = new Raices();
        
        int opcion;
        do{
        System.out.println("-----Menú-----");
        System.out.println("1. Obtener discriminate");
        System.out.println("2. Obtener raíces");
        System.out.println("3. Obtener raíz");
        System.out.println("4. Calcular");
        System.out.println("5. Salir\n");
        
        System.out.println("Ingrese un acción: ");
        opcion = sc.nextInt();
        
        switch  (opcion){
            case 1: rs.getDiscriminante(eq);
                break;
            case 2: rs.obtenerRaices(eq);
                break;
            case 3: rs.obtenerRaiz(eq);
                break;
            case 4:  rs.calcular(eq);
                break;
            case 5: System.out.println("Salir...");
                break;
            default:
            
        }
        }while(opcion !=5);
    }
        
        
        
    }
    

