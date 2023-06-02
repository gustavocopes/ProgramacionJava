/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gcopes
 */
  public class Equipo {
        private List<Jugador> jugadores = new ArrayList();

        public Equipo() {
        }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

        @Override
        public String toString() {
            return "Equipo{" + "jugadores=" + jugadores + '}';
        }
        
    }
