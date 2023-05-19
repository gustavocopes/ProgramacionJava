/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import servicios.PeliculaServicio;

/**
 *
 * @author gcopes 
 */
public class PeliculaMain {

    
    public static void main(String[] args) {
        
        PeliculaServicio ps = new PeliculaServicio();
        
        ps.crearPelicula();
        ps.mostrarPelicula();
        ps.mostrarPeliLarga();
        ps.ordenarPeliDesc();
        ps.ordenarPeliAsc();
        ps.ordenarPeliTitulo();
        ps.ordenarPeliDirector();
        
    }

}
