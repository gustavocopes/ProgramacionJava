package Main;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */

/**
 *
 * @author gcopes
 */
public class Perro {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> perros = new ArrayList();
        String opcion = "n";
        
        do{
        System.out.println("Ingrese la raza del perro: ");
        String raza = sc.next();
        perros.add(raza);
            System.out.println("Desea cargar otro perro? s/n");
            opcion = sc.next();
        
        }while(opcion.equalsIgnoreCase("s"));
        
    }

}
