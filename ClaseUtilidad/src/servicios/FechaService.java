/*
 * 
El método debe retornar el objeto Date.

 */
package servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class FechaService {
    
    Scanner sc = new Scanner(System.in);
    /**TMétodo fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento.
     * Luego los pase por parámetro a un nuevo objeto Date. El método debe
     * retornar el objeto Date. 
     * Ejemplo fecha: Date fecha = new Date(anio, mes, dia);*/
    
    public Date fechaNacimiento(){
        int anio, mes, dia;
        System.out.println("Ingrese fecha de su nacimiento: ");
        anio = sc.nextInt();
        mes = sc.nextInt();
        dia = sc.nextInt();
        Date fecha = new Date(sc.nextInt(),sc.nextInt()-1, sc.nextInt());
   
        return fecha;
    }
    
    /**Método fechaActual que cree un objeto fecha con el día actual. 
     * Para esto usaremos el constructor vacío de la clase Date.
     * Ejemplo: Date fechaActual = new  Date();*/
    
     public Date fechaActual(){
         Date fechaActual = new Date();
         
         return fechaActual;
     }
     
   /**Método diferencia que reciba las dos fechas por parámetro y retorna
    * la diferencia de años entre una y otra (edad del usuario).*/

     
     public long diferencia(Date fecha, Date fechaActual){
         
         long diff =  fechaActual.getYear() - fecha.getYear();
         return diff;
     }
}
