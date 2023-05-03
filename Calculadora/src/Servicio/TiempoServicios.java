/*
 Definir la clase Tiempo,  y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos
 */
package Servicio;

import calculadora.Tiempo;
import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class TiempoServicios {
    Scanner sc = new Scanner(System.in);
    
    public void imprimirHoraCompleta(Tiempo t1){
        System.out.println("La hora es: " + t1.getHoras() + ":" + t1.getMinutos() + ":" + t1.getSegundos() );
    }
}
