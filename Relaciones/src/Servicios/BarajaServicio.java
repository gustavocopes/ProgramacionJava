/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import PalosEnum.Palos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import relaciones.Baraja;
import relaciones.Carta;

/**
 *
 * @author Gustavo
 */
public class BarajaServicio {
    
    Baraja fold = new Baraja();
    Baraja entregada = new Baraja();//Baraja de cartas que se repartieron
    ArrayList<Carta> nro = new ArrayList();
    ArrayList<Carta> salen =  new ArrayList();// las cartas que se van repartiendo
    Collections cart;

    public Baraja crearBaraja() {
        for (Palos aux : Palos.values()) {//recorro la enumeracion de los palos

            for (int i = 0; i < 12; i++) {

                if (i == 9 || i == 10) {// no se hace nada cuando recorro estos valores, representan a los 8 y 9

                } else {
                    Carta cart = new Carta(i + 1, aux.getNombre());//asigno numero y palo a la carta
                    nro.add(cart);// agrego esa carta al arraylist
                }
            }
        }

        fold.setMano(nro);//agrego el array list a la baraja que tienen como unico atributo mano
        //System.out.println(fold);
        return fold;
    }
    
    /// Creo un menú
    
    public void menu(){
        int opcion = 0;        
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("----------------------");
        System.out.println("----------MENÚ--------");
        System.out.println("----------------------");
        System.out.println("1. Barajar.");
        System.out.println("2. Dar Cartas.");
        System.out.println("3. Mostrar la siguiente carta de la baraja.");
        System.out.println("4. Mostrar la cantidad de cartas disponibles.");
        System.out.println("5. Mostrar las cartas que se han repartido.");
        System.out.println("6. Mostar la baraja.");
        System.out.println("7. Finalizar.");
        System.out.println("-----------------------");
        System.out.println("Elija una opción: ");
        
        switch(opcion = sc.nextInt()){
            case 1: barajar();
            break;
            case 2: darCartas();
            break;
            case 3: siguienteCarta();
            break;
            case 4: cartasDisponibles();
            break;
            case 5: cartasMonton();
            break;
            case 6: mostrarBaraja();
            break;
            case 7: System.out.println("Fin.");
            break;
            default: System.out.println("Ingrese un valor válido!");
            
        }
        }while(opcion != 7);
               
    }

    /**
     * barajar(): cambia de posición todas las cartas aleatoriamente.
     */
    public void barajar() {
         cart.shuffle(fold.getMano());//esto es un método de Collections

    }

    /**
     * • siguienteCarta(): devuelve la siguiente carta que está en la baraja,
     * cuando no haya más o se haya llegado al final, se indica al usuario que
     * no hay más cartas.
     */
    public void siguienteCarta() {
        System.out.println("La siguiente carta en la baraja es: " + fold.getMano().get(0));
        if (fold.getMano().size() == 0){
            System.out.println("La baraja ya no tiene cartas!");
        }

    }
    /**
     * • cartasDisponibles(): indica el número de cartas que aún se puede
     * repartir. */
    public void cartasDisponibles(){
        System.out.println("Aún pueden repartirse " + fold.getMano().size() + "cartas.");
    }
    /**• darCartas(): dado un número de cartas que nos pidan, le
     * devolveremos ese número de cartas. En caso de que haya menos cartas que
     * las pedidas, no devolveremos nada, pero debemos indicárselo al usuario.*/
    public void darCartas(){
        Scanner sc = new Scanner(System.in);      
        
        System.out.println("Cuántas cartas se deben repartir?:");
        int cant =  sc.nextInt();
        
        if (fold.getMano().size() >= cant){
        //System.out.println("El tamaño de la baraja es: " + fold.getMano().size());
        for (int i = 0; i < cant ; i++) {
            Carta dadas = new Carta(fold.getMano().get(i).getNumero(), fold.getMano().get(i).getPalo());
            System.out.println(fold.getMano().get(i));
            //System.out.println(dadas);
            salen.add(dadas);
            fold.getMano().remove(i);// por qué no puedo eliminar gran cantidad de cartas?
        }
        entregada.setMano(salen);
        }
        else {
                System.out.println("No se puede entregar esa cantidad, no hay tantas en la baraja!");
                }
        //System.out.println("el tamaño de la baraja es : "  + fold.getMano().size());
        
    }
    /**• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha
     * salido ninguna indicárselo al usuario •*/
    public void cartasMonton(){
        if (salen.size()== 0) {
            System.out.println("Aún no se han repartido cartas!");
            
        }
        else{
        System.out.println("La cartas que han sido repartidas son: " + entregada);
        //System.out.println(salen); // veremos cual corresponde mejor
    }}
    /**mostrarBaraja(): muestra todas
     * las cartas hasta el final. Es decir, si se saca una carta y luego se
     * llama al método, este no mostrara esa primera carta.
     */
    public void mostrarBaraja(){
        System.out.println("La baraje es : " + fold);
    }
}
