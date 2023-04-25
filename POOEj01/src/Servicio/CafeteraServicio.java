/*
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía,
el método recibe el tamaño de la taza y simula la acción 
de servir la taza con la capacidad indicada. 
Si la cantidad actual de café “no alcanza” para llenar la taza,
se sirve lo que quede. El método le informará al usuario 
si se llenó o no la taza, y de no haberse llenado en cuanto 
quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
.
 */
package Servicio;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class CafeteraServicio {
    Scanner sc = new Scanner(System.in);
    
    Cafetera cafe = new Cafetera();
    
    public void crearCafetera(){
        cafe.setCapacidadMaxima(2000);
    }
    public void llenarCafetera(){
        cafe.setCantidadActual(cafe.getCapacidadMaxima());
    }
    public void servirTaza(int taza){
        
        int aux = cafe.getCantidadActual() - taza;
        if (cafe.getCantidadActual()>= taza) {
            
            System.out.println("Se llenó la taza\n ");
            cafe.setCantidadActual(aux);
            
             }
        else {
            System.out.println("Café insuficiente!. Se llenó la taza solo con " + cafe.getCantidadActual() + " ml.\n");
            cafe.setCantidadActual(0);
        }
    }
    public void vaciarCafetera(){
        cafe.setCantidadActual(0);
    }
    public void agregarCafe(int cantidad){//corregir
        if (cantidad> (-cafe.getCantidadActual() + cafe.getCapacidadMaxima())) {
            System.out.println("Cafetera llena!se agregaron " + (cafe.getCantidadActual() - cantidad) + "ml.\n");
            
        }
        else{
        cafe.setCantidadActual(cafe.getCantidadActual() + cantidad);
        }
    }
}
