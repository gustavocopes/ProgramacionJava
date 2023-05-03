/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicio.TiempoServicios;
import calculadora.Tiempo;
import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class TiempoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Tiempo tiempo1 = new Tiempo();
        TiempoServicios ts = new TiempoServicios();
        System.out.println("Ingrese la hora: ");
        tiempo1.setHoras(sc.nextInt());
        System.out.println("Ingrese los minutos: ");
        tiempo1.setMinutos(sc.nextInt());
        
        System.out.println("Ingrese los segundos: ");
        tiempo1.setSegundos(sc.nextInt());
        
        ts.imprimirHoraCompleta(tiempo1);
    }
    
}
