/*
 Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada..
 */
package servicios;

import java.util.ArrayList;
import static java.util.Collections.sort;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class PerroServicio {
     ArrayList<String> perros = new ArrayList();
     Scanner sc = new Scanner(System.in);
       
    public void crearPerro(){
      
        String opcion = "n";
        
        do{
        System.out.println("Ingrese la raza del perro: ");
        String raza = sc.next();
        perros.add(raza);
            System.out.println("Desea cargar otro perro? s/n");
            opcion = sc.next();
        
        }while(opcion.equalsIgnoreCase("s"));
    }
    
    public void mostrarPerro(){
        
        System.out.println("Las razas de los perros son: ");
        for (String aux : perros){
            System.out.println(aux);
        }
        
    }
    
    public void eliminarPerro(){
        System.out.println("Ingrese una raza de perro a eliminar de la lista: ");
        String op = sc.next();
        Iterator<String> it = perros.iterator();
        while (it.hasNext()){
            if (it.next().equalsIgnoreCase(op)){
                it.remove();
            }
            else if (!it.next().equalsIgnoreCase(op)) {
            
             System.out.println("Esta raza no se encuentra en la lista");       
            }
    }
         
        sort(perros);
}
}