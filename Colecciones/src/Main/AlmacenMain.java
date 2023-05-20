/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import servicios.AlmacenServicio;

/**
 *
 * @author gcopes 
 */
public class AlmacenMain {

    
    public static void main(String[] args) {
        
        AlmacenServicio as = new AlmacenServicio();
        
        as.cargarProducto();
        as.modificarPrecio();
        as.eliminarProducto();
        as.mostrarProductos();
    }

}
