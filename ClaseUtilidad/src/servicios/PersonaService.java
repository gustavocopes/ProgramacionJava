/*
 Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona
a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha 
de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si
la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.

 */
package servicios;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class PersonaService {
    Scanner sc = new Scanner(System.in);
    
    public Persona crearPersona(Persona per){
        System.out.println("Ingrese su nombre: ");
        per.setNombre(sc.nextLine());
        
        System.out.println("Ingrese su fecha de nacimiento aaaa/mm/dd: ");
        Date fecha = new Date(sc.nextInt() - 1900,sc.nextInt() - 1 ,sc.nextInt());
        per.setFechaNac(fecha);
        
        return per; 
        
    }
    
    public int calcularEdad(Persona per){
        Date fechaActual = new Date();
        int diff = fechaActual.getYear() - per.getFechaNac().getYear();
        return diff;
    }
    
    public boolean menorQue(Persona per,int edadCons){
        
        if(calcularEdad(per) < edadCons){
            return true;
        }
        else return false;
    }
    
    public void mostarPersona(Persona per, int edad){
        System.out.println(per.getNombre() + " nació en la fecha " + per.getFechaNac() + " y tiene " + edad + " años ");
    }
}
