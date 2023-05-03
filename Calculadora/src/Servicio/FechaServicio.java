/*
Verificar que el año ingresado por el usuario este entre 1900 y 2021,
caso contrario, el año tomara el valor por defecto.
● Conocer la cantidad de días totales que tiene el mes elegido 
por el usuario. EJ: USTED INGRESO MES 10 (OCTUBRE), QUE TIENE 31 días
● Mostrar día anterior a la fecha ingresada (Hay que considerar que
sucede con inicio decada mes)
Mostrar día posterior a la fecha ingresada (Hay que considerar 
que sucede con fin de cada mes)
● Crear un método para verificar si el año ingresado es bisiesto

 */
package Servicio;

import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class FechaServicio {
    Scanner sc = new Scanner(System.in);
    public void ingresarFecha(){
        System.out.println("Ingrese el año: ");
        anio = sc.nextInt();
    }
}
