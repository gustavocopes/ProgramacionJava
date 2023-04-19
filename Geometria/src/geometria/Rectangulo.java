/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y
un método "calcular_area" que calcule y devuelva el área del rectángulo. 
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 
y imprime el área del rectángulo.
 */
package geometria;

/**
 *
 * @author gcopes
 */
public class Rectangulo {
    private float lado1, lado2;
    
    public Rectangulo(){
        
    }
    
    public Rectangulo(float lado1, float lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public float calcular_area(float lado1, float lado2){
        return lado1*lado2;
    }
}
