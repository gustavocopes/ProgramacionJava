/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cine;

/**
 *
 * @author gcopes
 */
public class CineMain {


    public static void main(String[] args) {
       Cine sala = new Cine();
            
       sala.cargarSala();
       sala.cargarEspectador();
       sala.cargarPelicula();
       sala.ubicarEspectador();
       sala.mostrarCine();
    }

}
