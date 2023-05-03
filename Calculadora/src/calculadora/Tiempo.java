/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class Tiempo {
    private int horas, minutos, segundos;
    Scanner sc = new Scanner(System.in);
    public Tiempo() {
    }

    public Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
        while (this.horas > 24 || this.horas < 0) {
            
            System.out.println("Ingrese una hora válida: ");
            this.horas = sc.nextInt();
        
        } 
        
        
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
         while (this.minutos > 59 || this.minutos < 0) {
            
            System.out.println("Ingrese minutos válidos: ");
            this.minutos= sc.nextInt();
        } 
        
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
        while (this.segundos > 59 || this.segundos < 0){
            
            System.out.println("Ingrese segundos válidos: ");
            this.segundos =  sc.nextInt();
        } 
    }
    
}
