/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Servicio.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CuentaBancariaServicio cuenta1 = new CuentaBancariaServicio();
        cuenta1.crearCuenta();
        int opcion;
        
        do{
        System.out.println("----Menú----");
        System.out.println("1.Ingresar dinero");
        System.out.println("2.Retirar dinero");
        System.out.println("3.Retiro Express");
        System.out.println("4.Consultar saldo");
        System.out.println("5.Consultar cuenta");
        System.out.println("6.Salir");
        
        System.out.println("Ingrese una opción: ");
        
        opcion= sc.nextInt();
        
        switch(opcion){
            case 1: System.out.println("Ingrese el monto que desa ingresar a su cuenta: ");
                    cuenta1.ingresar(sc.nextFloat());
                break;
            case 2: System.out.println("Ingrese el monto que desea retirar: ");
                    cuenta1.retirar(sc.nextFloat());
                break; 
            case 3: System.out.println("Ingrese el monto del retiro Exrpess: ");
                    cuenta1.extraccionRapida(sc.nextFloat());
                break;
            case 4: cuenta1.consultarSaldo();
                break;
            case 5: cuenta1.consultarDatos();
                break;
            case 6: System.out.println("Finalizar");
                break;
            default: System.out.println("/n");
                break;
        }
        }while(opcion != 6);
                        
        }
        
    }
    

