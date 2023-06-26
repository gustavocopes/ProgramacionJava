/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author gcopes
 */
public enum colore {
    BLANCO("Blanco"),NEGRO("Negro"), ROJO("Rojo"), AZUL("Azul"), GRIS("Gris");
    private String colores;

    private colore(String colores) {
        this.colores = colores;
    }

    private colore() {
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }
}
