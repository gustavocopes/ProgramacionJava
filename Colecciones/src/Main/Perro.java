package Main;

import servicios.PerroServicio;

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
       
        PerroServicio ps = new PerroServicio();
        
        ps.crearPerro();
        ps.mostrarPerro();
        ps.eliminarPerro();
        ps.mostrarPerro();
    }

}
