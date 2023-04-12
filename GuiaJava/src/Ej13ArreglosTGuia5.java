/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
public class Ej13ArreglosTGuia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] equipo = new String[5];
        
        for (int i = 0; i < 5; i++){
            
            System.out.println("Ingrese un nombre: "); 
            String nombre = sc.nextLine();
            equipo[i] = nombre;
        }
        
    }
    
}
