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
public class Rectangulo implements calculosFormas {
    private double ladoA;
    private double ladoB;

    public Rectangulo() {
    }

    public Rectangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }


    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }   
      
    @Override
    public double calculoArea(){
        return ladoA * ladoB;
    }

    @Override
    public double calculoPerimetro() {
        return (ladoA + ladoB) * 2;
}}
