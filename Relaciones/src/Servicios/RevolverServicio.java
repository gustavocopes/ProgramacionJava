/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.ArrayList;
import java.util.Scanner;
import relaciones.Juego;
import relaciones.Jugador;
import relaciones.RevolverDeAgua;

/**
 *
 * @author Gustavo
 */
public class RevolverServicio {

    public void llenarRevolver(RevolverDeAgua rv) {

        rv.setPosicion(Math.random() * 10 + 6);
        rv.setPosAgua(Math.random() * 10 + 6);

    }

    public boolean mojar(RevolverDeAgua rv) {
        boolean carga = false;
        if (rv.getPosAgua() == rv.getPosicion()) {
            carga = true;
        }
        return carga;
    }

    public void siguienteChorro(RevolverDeAgua rv) {
        rv.setPosAgua(rv.getPosAgua() + 1);

    }

    public void disparo(RevolverDeAgua r, Jugador jg) {
        jg.setMojado(true);
        
        if (mojar(r) == true) {
            jg.setMojado(false);
        }
    }

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r, Jugador jg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de jugadores que tendrá la ronda: ");
        int cantJugadores = 6;
        if (sc.nextInt() <= 6) {
            for (int i = 0; i < cantJugadores; i++) {
                jg.setId(i);
                jg.setNombre("Jugador " + jg.getId());
            }
        } else {
            for (int i = 0; i < 6; i++) {
                jg.setId(i);
                jg.setNombre("Jugador " + jg.getId());
            }
        }
        jugadores.add(jg);
//        game.setJugadores(jugadores);
//        game.setR(r);
    }

    public void ronda(RevolverDeAgua rv, Jugador jg) {
        disparo(rv, jg);
        if (jg.getMojado() == false){
            System.out.println(jg);
        }
        else{
            siguienteChorro(rv);
            
        }

    }
}
