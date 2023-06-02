/*

 Crear una lista de 20 alumnos (hacer uso del constructor que recibe parámetros ,
para no hacer carga manual de los datos)
 Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según su apellido
de forma ascendente.
 Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según su nombre
de forma descendente.
 Con un alumno especifico (suponiendo que no existen dos alumnos con el mismo
nombre y apellido), mostrar por pantalla su edad. Considerar, el manejo de fechas,
utilizando el atributo fecha de nacimiento.
 Crear listas paralelas de Alumnos, según la nacionalidad.
 Realizar un reporte final de datos que informe:
o Cuantos alumnos son mayores de 25 años.
o Cuantos alumnos tiene su apellido que comienzan con letra L o P
o Cuantos alumnos hay de nacionalidad ARGENTINA – CHILENA – VENEZOLANA.
Recordar:
 */
package servicios;

import entidades.Alumnos;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class AlumnosServicio {
    /**Crear los métodos de A – B -M (Alta – Baja – modificación ) que manipulen
los objetos de este tipo.*/
    ArrayList<Alumnos> estudiante = new ArrayList<Alumnos>();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public void A(Alumnos est){
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el apellido: ");
        String apellido = sc.nextLine();
        System.out.println("Ingrese la nacionalidad: ");
        String nacionalidad = sc.nextLine();
        System.out.println("Ingrese fecha de nacimiento: ");
        int fecha = sc.nextInt();
        estudiante.add(nombre, apellido, nacionalidad, fecha);
    }
}
