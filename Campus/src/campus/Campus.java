/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campus;

import entidades.Edificio;
import entidades.EdificioDeOficinas;
import entidades.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author gcopes
 */
public class Campus {

    public static void main(String[] args) {
        int cantTecho = 0;
        ArrayList<Edificio> establecimiento = new ArrayList();

        Polideportivo poli1 = new Polideportivo("Santa Rosa", false, 80, 100, 15);
        Polideportivo poli2 = new Polideportivo("Urquiza", true, 150, 100, 35);
        EdificioDeOficinas ofi1 = new EdificioDeOficinas(30d, 20d, 40d);
        EdificioDeOficinas ofi2 = new EdificioDeOficinas(60d, 50d, 80d);

        establecimiento.add(ofi2);
        establecimiento.add(ofi1);
        establecimiento.add(poli1);
        establecimiento.add(poli2);

        for (Edificio aux : establecimiento) {
            aux.calcularSuperficie();
            aux.calcularVolumen();
        }

        System.out.println("Edificio 1: ");
        ofi1.cantPersonas();
        System.out.println("Edificio 2: ");
        ofi2.cantPersonas();

        if (poli1.isTipo()) {
            cantTecho++;
        } else if (poli2.isTipo()) {
            cantTecho++;
        }

        System.out.println("La cantidad de polideportivos con techos es:  " + cantTecho);

    }

}
