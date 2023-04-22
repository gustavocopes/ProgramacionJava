/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class CuentaBancariaServicio {
    Scanner sc = new Scanner(System.in);
    public CuentaBancaria crearCuenta(){
        System.out.println("Ingrese su número de cuenta bancaria: ");
        setNumeroCuenta(sc.nextInt());
        
        
    }
}
