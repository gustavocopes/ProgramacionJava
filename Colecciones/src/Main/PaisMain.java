/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import servicios.PaisServicio;

/**
 *
 * @author gcopes 
 */
public class PaisMain {

    
    public static void main(String[] args) {
        
        PaisServicio ps = new PaisServicio();
        
        ps.cargarPais();
        ps.mostrarPais();
        ps.ordenarPais();
        
        ps.eliminarPais();
        ps.mostrarPais();
        
    }

}
