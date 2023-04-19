/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author gcopes
 */
public class calculoFigura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo figura1;
        figura1 = new Rectangulo();//instancio mi objeto>> Rectangulo es mi clase, figura1 es mi objeto
        figura1.crearRectangulo();
        figura1.superficie();
        figura1.perimetro();
        figura1.dibujo();
    }
    
}
