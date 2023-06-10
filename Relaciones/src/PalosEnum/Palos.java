/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PalosEnum;

/**
 *
 * @author Gustavo
 */
public enum Palos {
      ESPADA("Espada"), BASTO("Basto"), ORO("Oro"), COPA("Copa");
       private String nombre;

    private Palos() {
    }

    private Palos(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
       
}
