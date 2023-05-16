/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package servicios;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class AlumnoService {
    
    private ArrayList<Integer> nuevaLista;
    private Scanner sc;
    
       //Esta es una muy buena practica
    public PersonaServicioArrayList() {
        this.nuevaLista = new ArrayList<>(); // Creo el espacio en memoria del LISTA
        this.sc = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }

    
    public void crearAlumno(){
        String opcion = null;
        //Alumno st = new Alumno();
        do{
            ArrayList<Integer> calif = new ArrayList();
            System.out.println("Ingrese el nombre del alumno: ");
            String nombre = sc.next();
            System.out.println("Ingrese las tres notas del alumno");
            int nota = sc.nextInt();
            int nota2 = sc.nextInt();
            int nota3 = sc.nextInt();
            
            calif.add(nota);
            calif.add(nota2);
            calif.add(nota3);
            ArrayList<Alumno> al = new ArrayList();
            al.add(e);
            
            System.out.println("Desea agregar otro alumno? s/n");
            opcion = sc.next();
        }while(opcion.equalsIgnoreCase("s"));
    }
}
