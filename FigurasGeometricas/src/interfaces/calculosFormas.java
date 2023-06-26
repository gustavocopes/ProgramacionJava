/*
Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá,
los dos métodos para calcular el área, el perímetro y el valor de PI como constante.
 */
package interfaces;

/**
 *
 * @author gcopes
 */
public interface calculosFormas {
    public double calculoArea();
    public double calculoPerimetro();
    public final double PI = 3.1415;
}
