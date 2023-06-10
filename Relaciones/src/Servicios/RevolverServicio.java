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

        rv.setPosicion(2);//posición del tambor que va a disparar
        rv.setPosAgua(5);// posición donde hay agua

    }

    public boolean mojar(RevolverDeAgua rv) {
        boolean carga = false;
        if (rv.getPosAgua() == rv.getPosicion()) {
            carga = true;
        }
        return carga;
    }

    public void siguienteChorro(RevolverDeAgua rv) {
        if (rv.getPosicion()<5) {
           rv.setPosicion(rv.getPosicion() + 1); 
        }
        else {
            rv.setPosicion(0);
        }
        

    }

    public void disparo(RevolverDeAgua r, Jugador jg) {
        jg.setMojado(false);
        
        if (mojar(r) == true) {
            jg.setMojado(true);
        }
        siguienteChorro(r);
    }

    public Juego llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r, Jugador jg) {
        jugadores = new ArrayList();
        Juego game = new Juego();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de jugadores que tendrá la ronda: ");
        
        int cantJugadores = sc.nextInt();
        if (cantJugadores < 6) {
            for (int i = 0; i < cantJugadores; i++) {
                jg.setId(i + 1 );
                jg.setNombre("Jugador " + jg.getId());
                
                jugadores.add(jg);
            }
        }
        else {
            for (int i = 0; i < 6; i++) {
                jg.setId(i + 1);
                jg.setNombre("Jugador " + jg.getId());
                jugadores.add(jg);
            }
        }
        System.out.println(jg);
       
        game.setJugadores(jugadores);
        game.setR(r);
        System.out.println(game);
        return game;
    }

    public void ronda(RevolverDeAgua rv, Jugador jg) {
        disparo(rv, jg);
        if (jg.getMojado() == true){
            System.out.println(jg + "está mojado");
        }
        else{
            ronda(rv, jg);
            
        }

    }
}
