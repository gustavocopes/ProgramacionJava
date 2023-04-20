/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. 
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.

 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class Cuenta {
    private float saldo;
    private String titular;
    public Cuenta(){
        
    }   
    public Cuenta(float saldo, String titular){
        this.saldo =saldo;
        this.titular = titular;
        
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    Scanner sc = new Scanner(System.in);
    public void crearCuenta(){
        saldo = 100;
        System.out.println("Ingrese el nombre del titular");
        this.titular= sc.nextLine();
        System.out.println("Su saldo es: " + saldo);
    }
    
    public void retirar_dinero(){
        
        do{
        System.out.println("Ingrese el monto que desea retirar: ");
        float monto = sc.nextFloat(); // monto >> saldo
        
        if(monto > saldo){
            System.out.println("No es posible entregar esa cantidad. Saldo insuficiente.");
        }
        else{
            System.out.println("Transacción realizada su saldo actual es: " + (saldo - monto));
            saldo -= monto;}// monto = saldo
        }while(saldo>0);
    }
}
