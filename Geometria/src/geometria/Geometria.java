/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package geometria;

/**
 *
 * @author gcopes
 */

public class Geometria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circunferencia circulo1 = new Circunferencia();
        circulo1.crearCircunferencia();
        
        double area =circulo1.area();
        double perimetro = circulo1.perimetro();
        
        //circulo1.setRadio(5);
        
                
        System.out.println("el radio del círculo es: " + circulo1.getRadio() + ", su área es : " + area + " y el perímetro es: " + perimetro);
    }
    
}
