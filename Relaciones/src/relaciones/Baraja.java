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
public class Baraja {
    private ArrayList<Carta> mano = new ArrayList();

    @Override
    public String toString() {
        return "Baraja{" + "mano=" + mano + '}';
    }

    public Baraja() {
    }

    public Baraja(ArrayList<Carta> mano) {
        this.mano = mano;
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }

    public void setMano(ArrayList<Carta> mano) {
        this.mano = mano;
        
    }
     
    
}
