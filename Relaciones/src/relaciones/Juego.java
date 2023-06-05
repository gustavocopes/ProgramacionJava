/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class Juego {
    private ArrayList<Jugador> jugadores;
    private RevolverDeAgua r;

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getR() {
        return r;
    }

    public void setR(RevolverDeAgua r) {
        this.r = r;
    }

    public Juego(ArrayList<Jugador> jugadores, RevolverDeAgua r) {
        this.jugadores = jugadores;
        this.r = r;
    }

    public Juego() {
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", r=" + r + '}';
    }
    
}
