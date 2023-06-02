/*
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.
 */
package Main;

import entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class CantanteMain {

    public static void main(String[] args) {

        ArrayList<CantanteFamoso> cantantes = new ArrayList<CantanteFamoso>();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        cantantes.add(new CantanteFamoso("Freddy Mercury", "Rapsodia"));
        cantantes.add(new CantanteFamoso("Sinatra", "New York"));
        cantantes.add(new CantanteFamoso("Mercedes Sosa", "La Maza"));
        cantantes.add(new CantanteFamoso("Beatles", "yellow"));
        cantantes.add(new CantanteFamoso("Muse", "Black Holes"));

        System.out.println(cantantes);
        int op = 0;
        do {

            System.out.println("---------------Menú--------------");
            System.out.println("1. Ingrese un nuevo cantante");
            System.out.println("2. Mostrar tod@s los cantantes");
            System.out.println("3. Eliminar un cantante");
            System.out.println("4. Finalizar");
            System.out.println("----------------------------------");
            System.out.println("Ingrese una opción: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese el nombre del artista y el album: ");
                    cantantes.add(new CantanteFamoso(sc.next(), sc.next()));
                    break;
                case 2:
                    System.out.println(cantantes);
                    break;
                case 3:
                    System.out.println("Ingrese el cantante que desa eliminar");
                    String p2 = sc.next();
                  
                    Iterator<CantanteFamoso> it = cantantes.iterator();
                    while (it.hasNext()) {
                        System.out.println(it.next());
                        if (it.next().getCantante().equals(p2)) {
                            //cantantes.remove(p2);
                            it.remove();}
                        
                    }  
//                else{
//                    System.out.println("El cantante no se encuentra en la lista");
//                }
                    break;
                default:
                    System.out.println("Ingrese una opción válida!");
                    break;
            }
        } while (op != 4);

    }

}
