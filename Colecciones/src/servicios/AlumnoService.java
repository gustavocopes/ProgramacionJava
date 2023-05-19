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
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class AlumnoService {

    ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
    Scanner sc = new Scanner(System.in);

    public ArrayList<Alumno> crearAlumno() {
        String opcion = null;

        do {
            Alumno al1 = new Alumno();
            System.out.println("Ingrese nombre del alumno");
            al1.setNombre(sc.next());

            ArrayList<Integer> notas = new ArrayList();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota " + (i + 1));
                notas.add(sc.nextInt());

            }
            al1.setNotas(notas);

            listaAlumnos.add(al1);
            System.out.println("Desea agregar un alumno? s/n");
            opcion = sc.next();
        } while (opcion.equalsIgnoreCase("s"));
        
        return listaAlumnos;

    }

    public void mostrarAlumno() {
        System.out.println("Los alumnos son: ");
        for (Alumno aux : listaAlumnos) {
            System.out.println(aux);
        }
    }

    public void metodoFinal(String a1) {
        String promediado = null;
        Integer suma = 0;
        for (int i = 0; i < listaAlumnos.size(); i++) {
            if (listaAlumnos.get(i).getNombre().equals(a1)) {
                suma = listaAlumnos.get(i).getNotas().get(0) + listaAlumnos.get(i).getNotas().get(1) + listaAlumnos.get(i).getNotas().get(2);
                promediado = listaAlumnos.get(i).getNombre();
            }            
        }
     
        System.out.println("El promedio de " + promediado + " es " +  (suma/3));
    }
}
