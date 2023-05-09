/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class MesSecreto {
    Scanner sc = new Scanner(System.in);
        private String[] meses = {"enero","febrero", "marzo", "abril", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        private String mesSecreto = meses[5];
        
        public void adivinarMes(String mesSecreto){
            String opcion;
            System.out.println("Adivine el mes");
            opcion = sc.next();
            while (!opcion.equalsIgnoreCase(mesSecreto)); {
                System.out.println("Incorrecto. Adivine nuevamente el mes: ");
                opcion = sc.next();
                
            } 
            
            
        }
}
