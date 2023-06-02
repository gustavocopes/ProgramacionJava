/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Equipo;
import entidades.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class JugadorService {
    
    public void cargarJugador(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Jugador jg = new Jugador();
        Equipo eq = new Equipo();
        ArrayList<Jugador> py = new ArrayList();
        System.out.println("Ingrese nombre del jugador: ");
        jg.setNombre(sc.next());
        System.out.println("Ingrese apellido del jugador: ");
        jg.setApellido(sc.next());
        System.out.println("Ingrese la posición del jugador: ");
        jg.setPosicion(sc.nextInt());
        System.out.println("Ingrese el número del jugador: ");
        jg.setNumero(sc.nextInt());
        py.add(jg);
        eq.(jg);
               
    }
    public void mostrarJugador(Equipo jg){
        System.out.println(jg);
    }
    
}
