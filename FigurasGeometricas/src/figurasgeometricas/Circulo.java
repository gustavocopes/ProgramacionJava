/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import interfaces.calculosFormas;

/**
 *
 * @author gcopes
 */
 public class Circulo implements calculosFormas{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculoArea() {
        return Math.pow(radio, 2) * PI;
    }

    @Override
    public double calculoPerimetro() {
        return 2 * radio * PI; }
    

}
