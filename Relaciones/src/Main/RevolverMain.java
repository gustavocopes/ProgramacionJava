/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicios.RevolverServicio;
import relaciones.Juego;
import relaciones.Jugador;
import relaciones.RevolverDeAgua;

/**
 *
 * @author gcopes
 */
public class RevolverMain {

    public static void main(String[] args) {
        RevolverServicio rs = new RevolverServicio();
        RevolverDeAgua r = new RevolverDeAgua();
        Jugador jg = new Jugador();
        Juego game = new Juego();

        rs.llenarRevolver(r);
        rs.llenarJuego(game.getJugadores(), r, jg);
    }

}
