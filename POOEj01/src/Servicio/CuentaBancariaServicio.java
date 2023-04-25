/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class CuentaBancariaServicio {
    Scanner sc = new Scanner(System.in);
    CuentaBancaria cliente1 = new CuentaBancaria();
    public void crearCuenta(){
        System.out.println("Ingrese el número de cuenta del cliente: ");
        cliente1.setNumeroCuenta(sc.nextInt());
        System.out.println("Ingrese el dni del cliente: ");
        cliente1.setDniCliente(sc.nextLong());
        System.out.println("Ingrese el saldo actual del cliente: ");
        cliente1.setSaldoActual(sc.nextFloat());
    }
    public void ingresar(float monto){
               
        cliente1.setSaldoActual(monto +cliente1.getSaldoActual());
                    }
    public void retirar(float monto){
        if(monto > cliente1.getSaldoActual()){
            System.out.println("El monto ha superado el saldo de la cuenta. Se le entregará el monto disponible.");
            cliente1.setSaldoActual(0);
        }
        else{
            cliente1.setSaldoActual(cliente1.getSaldoActual() - monto);
        }
    }
    public void extraccionRapida(float monto){
        if (monto > (cliente1.getSaldoActual()* 0.2)) {
            System.out.println("El monto no puede superar los $ " + (cliente1.getSaldoActual() * 0.2));
            cliente1.setSaldoActual(cliente1.getSaldoActual() - (cliente1.getSaldoActual() * 0.2));
            System.out.println("Se ha extraído el máximo disponible para este tipo de transacción.");            
        }
        else{
            cliente1.setSaldoActual(cliente1.getSaldoActual() - monto);
        }
    }
    public void consultarSaldo(){
        System.out.println("El saldo es $" + cliente1.getSaldoActual());
    }
    
    public void consultarDatos(){
        System.out.println("El número de cuenta del cliente es: " + cliente1.getNumeroCuenta());
        System.out.println("El número de dni del cliente es: " + cliente1.getDniCliente());
        System.out.println("El saldo actual de la cuenta es: $" + cliente1.getSaldoActual());
    }
}
