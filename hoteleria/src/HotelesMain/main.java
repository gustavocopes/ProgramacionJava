/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HotelesMain;

import entidades.Camping;
import entidades.Hotel;
import entidades.Hotel4;
import entidades.Hotel5;
import entidades.Residencia;
import entidades.Resort;
import java.util.ArrayList;



/**
 *
 * @author gcopes 
 */
public class main {

    
    public static void main(String[] args) {
        ArrayList<Resort> ht = new ArrayList();
        ArrayList<Hotel> hoteles =  new ArrayList();
        /*boolean gym, String resto, int capResto, int hab, int camas, int pisos, int precioHab,
        String nombre, String direccion, String localidad, String gerente) {**/
        Hotel h1 = new Hotel4(true, "Pepe", 20, 5, 2, 3, 0, "Dormi", "Siempre Viva", "Uruguay", "Gustavo");
        /*int salones, int suites, int limos, boolean gym, String resto, int capResto, int hab, int camas, int pisos,
        int precioHab, String nombre, String direccion, String localidad, String gerente) {*/
        Hotel h2 = new Hotel5(2,6,3,true, "Pepe", 20, 5, 2, 3, 0, "Dormi1", "Siempre Viva", "Uruguay", "Gustavo");
        Hotel h3 = new Hotel4(true, "Pepe", 25, 2, 1, 2, 5, "Aca no", "Siempre Viva", "Uruguay", "Gustavo");
        Hotel h4 = new Hotel5();
        /*public Residencia(int hab, boolean descGremial, boolean campDeportivo, boolean priv, double sup, String nombre, String direccion, String localidad, String gerente) {*/
        Residencia r1 = new Residencia(4,true,true,true,45d,"Traful", "gorrión","villa Traful", "Gustavo");
        Residencia r2 = new Residencia(5,false,true,false,65.2,"La Laguna", "calle 13","Esquel", "Pepito");
        /*public Camping(int carpas, int banios, boolean comedor, boolean priv, double sup, String nombre, String direccion, String localidad, String gerente) {*/
        Camping cp1 = new Camping(7, 2, true, false, 350, "Paraiso", "la calle", "tigre", "ana");
        
        //hoteles.add(h4);
        hoteles.add(h1);
        hoteles.add(h2);
        hoteles.add(h3);
        h1.calcularPrecio();
        h2.calcularPrecio();
        h3.calcularPrecio();
        
        
        ht.add(h1);
        ht.add(h2);
        ht.add(h3);
        ht.add(h4);
        ht.add(r1);
        ht.add(r2);
        ht.add(cp1);
        
        for (Resort aux : ht) {// muestra todos los alojamientos
            System.out.println("Los alojamientos disponibles son: " + aux.getNombre());}
        
        hoteles.sort(Hotel.compararPrecio);
        for (Hotel aux : hoteles) {
            System.out.println(aux.getClass().getCanonicalName());
            System.out.println(aux.getNombre() + " precio: $" + aux.getPrecioHab() );
        }
        
        for (Resort aux : ht) {
               
            if (aux instanceof Residencia) {// muestra las residencias que tienen descuento
                Residencia rs = (Residencia) aux;
                if (rs.isDescGremial()) {
                    System.out.println("Las residencias que tienen descuento son: " + rs.getNombre());
                }
            }
            if (aux instanceof Camping){
                
                Camping cp = (Camping) aux;
                if(cp.isComedor()){
                System.out.println("Los camping con restaurante son: " + cp.getNombre());
            }
            
         
            }
        }
        
    }
    }


