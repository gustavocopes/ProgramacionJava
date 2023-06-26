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
        /*boolean gym, String resto, int capResto, int hab, int camas, int pisos, int precioHab,
        String nombre, String direccion, String localidad, String gerente) {**/
        Hotel4 h1 = new Hotel4(true, "Pepe", 20, 5, 2, 3, 0, "Dormi", "Siempre Viva", "Uruguay", "Gustavo");
        /*int salones, int suites, int limos, boolean gym, String resto, int capResto, int hab, int camas, int pisos,
        int precioHab, String nombre, String direccion, String localidad, String gerente) {*/
        Hotel5 h2 = new Hotel5(2,6,3,true, "Pepe", 20, 5, 2, 3, 0, "Dormi1", "Siempre Viva", "Uruguay", "Gustavo");
        Hotel4 h3 = new Hotel4(true, "Pepe", 20, 5, 2, 3, 0, "Aca no", "Siempre Viva", "Uruguay", "Gustavo");
        Hotel5 h4 = new Hotel5();
        /*public Residencia(int hab, boolean descGremial, boolean campDeportivo, boolean priv, double sup, String nombre, String direccion, String localidad, String gerente) {*/
        Residencia r1 = new Residencia(4,true,true,true,45d,"Traful", "gorrión","villa Traful", "Gustavo");
        Residencia r2 = new Residencia(5,false,true,false,65.2,"La Laguna", "calle 13","Esquel", "Pepito");
        /*public Camping(int carpas, int banios, boolean comedor, boolean priv, double sup, String nombre, String direccion, String localidad, String gerente) {*/
        Camping cp1 = new Camping(7, 2, true, false, 350, "Paraiso", "la calle", "tigre", "ana");
        
        
        ht.add(h1);
        ht.add(h2);
        ht.add(h3);
        ht.add(h4);
        ht.add(r1);
        ht.add(r2);
        ht.add(cp1);
        
        for (Resort aux : ht) {
            System.out.println(aux.getNombre());
//            if (aux instanceof Residencia || aux instanceof Camping) {
//                Residencia rs = (Residencia) aux;
//                Camping cp = (Camping) aux;
//                System.out.println(aux.getNombre());
//            }
            
         
            }
        }
        
        
    }


