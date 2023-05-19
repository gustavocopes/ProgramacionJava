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

        Iterator<Alumno> it = listaAlumnos.iterator();
        Integer suma = 0;
        // double promedio = 0;

        while (it.hasNext()) {
            if (it.next().getNombre().equals(a1)) {
                suma = it.next().getNotas().get(0) + it.next().getNotas().get(1) + it.next().getNotas().get(2);

            }

        }
        System.out.println(" suma/3");
    }
}
/**
 * SERVICIOS Scanner leer = new Scanner(System.in);
 *
 * public Alumno crearAlumno(){ ArrayList<Integer> notas = new ArrayList<Integer>(); System.out.println("ingrese el nombre del alumno "); String nombre = leer.next(); for (int i = 0; i < 3; i++) { System.out.println("ingrese nota " + (i+1)); notas.add(leer.nextInt()); }  *
 * return new Alumno(nombre,notas); } public void cargarLista(){ boolean continuar = true; ArrayList<Alumno> misAlum = new ArrayList<Alumno>(); while (continuar){ misAlum.add(crearAlumno()); System.out.println("desea seguir cargando alumnos? s/n "); if (leer.next().charAt(0)=='n'){ continuar = false; } }
 *
 * for (Alumno aux : misAlum) { System.out.println(aux);
 *
 * }
 * }
 * }
 */
