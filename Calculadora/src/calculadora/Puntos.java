/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus atributos serán, x1, y1, x2, y2,
siendo cada x e y un punto. Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números
y los ingresa en los atributos del objeto. Después, a través de otro método calcular y devolver la distancia que existe entre los dos puntos
que existen en la clase Puntos. Para conocer como calcular la distancia entre dos puntos consulte el siguiente link:
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class Puntos {
    public float x1,y1,x2,y2;
    
    public Puntos(){
        
    }
    public Puntos(float x1, float y1, float x2, float y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public float getX1() {
        return x1;
    }

    public void setX1(float x1) {
        this.x1 = x1;
    }

    public float getY1() {
        return y1;
    }

    public void setY1(float y1) {
        this.y1 = y1;
    }

    public float getX2() {
        return x2;
    }

    public void setX2(float x2) {
        this.x2 = x2;
    }

    public float getY2() {
        return y2;
    }

    public void setY2(float y2) {
        this.y2 = y2;
    }
    
    public void crearPuntos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de x1: ");
        setX1(sc.nextFloat());
        System.out.println("Ingrese el valor de y1: ");
        setY1(sc.nextFloat());
        System.out.println("Ingrese el valor de x2: ");
        setX2(sc.nextFloat());
        System.out.println("Ingrese el valor de y2: ");
        setY2(sc.nextFloat());
    }
    
    public float distanciaPuntos(){
        float distancia = (float) Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        return distancia;
    } 
}
