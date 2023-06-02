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
public class CantanteFamoso {

    private String cantante;
    private String dicoConMasVentas;

    public CantanteFamoso() {
    }

    @Override
    public String toString() {
        return "CantanteFamoso{" + "cantante=" + cantante + ", dicoConMasVentas=" + dicoConMasVentas + '}';
    }

    public CantanteFamoso(String cantante, String dicoConMasVentas) {
        this.cantante = cantante;
        this.dicoConMasVentas = dicoConMasVentas;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getDicoConMasVentas() {
        return dicoConMasVentas;
    }

    public void setDicoConMasVentas(String dicoConMasVentas) {
        this.dicoConMasVentas = dicoConMasVentas;
    }

}
