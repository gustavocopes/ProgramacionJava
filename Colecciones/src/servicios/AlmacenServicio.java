/*
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
 */
package servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class AlmacenServicio {

    Scanner sc = new Scanner(System.in);
    //instancio el mapa, la llave será un String y el valor del tipo Double
    HashMap<String, Double> mercaderia = new HashMap();

    public void cargarProducto() {
        String op = null;
        String producto;
        Double valor;
        do {
            System.out.println("Ingrese un producto: ");
            producto = sc.next();
            System.out.println("Ingrese el precio del producto: ");
            valor = sc.nextDouble();
            //agrego la llave y el valor ingresado por el usuario al mapa
            mercaderia.put(producto, valor);
            System.out.println("Desea ingresar otro producto?  s/n");
            op = sc.next();
        } while (op.equalsIgnoreCase("s"));
    }

    public void modificarPrecio() {
        String op = null;
        System.out.println("Desea modificar el precio de un producto? s/n");
        op =  sc.next();
        while(op.equalsIgnoreCase("s")){
            System.out.println("Ingrese el nombre del producto a modificar: ");
            String producto = sc.next();
            //utilizo contains para buscar la coincidencia de la llave en el mapa
            if(mercaderia.containsKey(producto)){
                System.out.println("Ingrese el nuevo precio: ");
                Double nuevoPrecio = sc.nextDouble();
                //utilizo replace para reemplazar el valor de esa llave
                mercaderia.replace(producto, nuevoPrecio);
                
            }
            else{
                System.out.println("Este producto no se encuentra en el almacén.");
            }
            System.out.println("Desea modificar otro precio? s/n");
            op =  sc.next();
        }
    }
    
    public void eliminarProducto(){
        
        System.out.println("Ingrese el nombre del producto que desea eliminar: ");
        String producto = sc.next();
        if (mercaderia.containsKey(producto)) {
            mercaderia.remove(producto);
            
        }
        else {
            System.out.println("El producto no se encuentra en el almacén");
        }
      
    }
    
    public void mostrarProductos(){
        //utilizo un for each para recorrer el mapa y el metodo Map.Entry para poder mostrar la llaves y los valores del mapa
        for (Map.Entry<String, Double> aux : mercaderia.entrySet()) {
            System.out.println(" El precio de " + aux.getKey() + " es : $" + aux.getValue());
        }
    }
}
