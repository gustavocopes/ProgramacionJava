/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebaexception;

import java.util.Scanner;

/**
 *
 * @author gcopes 
 */
public class MainDivision {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        String num1 = sc.next();
        String num2 = sc.next();
        int numero1 = Integer.parseInt(num1);
        int numero2 = Integer.parseInt(num2);
        
        double division = numero1 / numero2;
        }catch(ArithmeticException a){
            System.out.println("no se puede dividir por cero");
        }
        
   
    }

}
