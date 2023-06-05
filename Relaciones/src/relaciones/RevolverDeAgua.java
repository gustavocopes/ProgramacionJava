/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

/**
 *
 * @author Gustavo
 */
public class RevolverDeAgua {
    private double posicion;
    private double posAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(double posicion, double posAgua) {
        this.posicion = posicion;
        this.posAgua = posAgua;
    }

    public double getPosicion() {
        return posicion;
    }

    public void setPosicion(double posicion) {
        this.posicion = posicion;
        
            while(posicion > 6 ){
                posicion = Math.random()*10 + 6;
            }
        
    }

    public double getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(double posAgua) {
        this.posAgua = posAgua;
         while(posicion > 6 ){
                posicion = Math.random()*10 + 6;
            }
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicion=" + posicion + ", posAgua=" + posAgua + '}';
    }
    
}
