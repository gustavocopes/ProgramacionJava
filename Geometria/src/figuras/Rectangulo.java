/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. 
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario.
También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura.
Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.

.
 */
package figuras;

import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class Rectangulo {
    private float base;
    private float altura;
    
    public Rectangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
        
    }
       public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void crearRectangulo(){
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Ingrese la base: ");
        base = sc.nextFloat();
        System.out.println("Ingrese la altura: ");
        setAltura(sc.nextFloat());
        
    }
    public float superficie(){
        return base * altura;
    }
    public float perimetro(){
        return (base + altura) * 2;
    }
    
    public void dibujo(){
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        

    }

 
    }

