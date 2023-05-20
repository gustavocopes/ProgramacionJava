/*
El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto.
 */
package servicios;

import entidades.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class PaisServicio {

    HashSet<String> estado = new HashSet<String>();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void cargarPais() {
        String opcion = null;
        do {

            System.out.println("Ingrese el país: ");
            estado.add(sc.next());

            System.out.println("Desea ingresar otro país? s/n");
            opcion = sc.next();
        } while (opcion.equalsIgnoreCase("s"));

    }

    public void mostrarPais() {
        for (String aux : estado) {
            System.out.println(aux);
        }
    }

    public void ordenarPais() {
        ArrayList<String> paisesOrdenado = new ArrayList(estado);
        Collections.sort(paisesOrdenado);
        System.out.println(paisesOrdenado);
    }

    public void eliminarPais() {
        Iterator<String> it = estado.iterator();
        System.out.println("Ingrese el país a eliminar: ");
        String p1 = sc.next();
        if (!estado.contains(p1)) {
            System.out.println("Este país no se encuentra en la lista!");
        }
        while (it.hasNext()) {
            if (it.next().equals(p1)) {
                it.remove();
                System.out.println("El país " + p1 + " fue eliminado.");

            }
        }

    }
}
