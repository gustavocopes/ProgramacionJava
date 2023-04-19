/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author gcopes
 */
public class cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta operacion1 =  new Cuenta();
        operacion1.crearCuenta();
        operacion1.retirar_dinero();
    }
    
}
