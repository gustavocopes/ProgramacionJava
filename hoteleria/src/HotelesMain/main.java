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
        Hotel4 h1 = new Hotel4(true, "Pepe", 20, 5, 2, 3, 0, "dormi", "Siempre Viva", "Uruguay", "Gustavo");
        /*int salones, int suites, int limos, boolean gym, String resto, int capResto, int hab, int camas, int pisos,
        int precioHab, String nombre, String direccion, String localidad, String gerente) {*/
        Hotel5 h2 = new Hotel5(2,6,3,true, "Pepe", 20, 5, 2, 3, 0, "dormi", "Siempre Viva", "Uruguay", "Gustavo");
        Hotel4 h3 = new Hotel4(true, "Pepe", 20, 5, 2, 3, 0, "dormi", "Siempre Viva", "Uruguay", "Gustavo");
        Hotel5 h4 = new Hotel5();
        Residencia r1 = new Residencia();
        Camping cp1 = new Camping();
        
        
        ht.add(h1);
        ht.add(h2);
        ht.add(h3);
        ht.add(h4);
        ht.add(r1);
        ht.add(cp1);
        
        for (Resort aux : ht) {
            if (aux instanceof Residencia) {
                Residencia ob = (Residencia) aux;
                
            }
 {
                
            }
        }
        
        
    }

}
