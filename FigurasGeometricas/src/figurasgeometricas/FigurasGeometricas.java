/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package figurasgeometricas;

/**
 *
 * @author gcopes 
 */
public class FigurasGeometricas {

    
    public static void main(String[] args) {
        Circulo c = new Circulo(3);
        Rectangulo r = new Rectangulo(2,3);
        
        System.out.println("El área del círculo es: " + c.calculoArea());
        System.out.println("El perímetro del círculo es: " + c.calculoPerimetro());
        System.out.println("El área del rectángulo es: " + r.calculoArea());
        System.out.println("El perímetro del rectángulo es: " + r.calculoPerimetro());
        
    }

}
