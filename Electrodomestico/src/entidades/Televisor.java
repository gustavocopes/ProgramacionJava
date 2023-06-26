/*
 Se debe crear también una subclase llamada Televisor con los siguientes 
atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los
atributos
heredados.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class Televisor extends Electrodomesticos{
    private double resolucion;
    private boolean sintonizador = false;

    public Televisor() {
        
    }

    public Televisor(double resolucion, boolean sintonizador, double precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Televisor(double resolucion, boolean sintonizador) {
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    /*Método crearTelevisor(): este método llama a crearElectrodomestico()
    de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.*/
    public void crearTelevisor(){
        Scanner sc = new Scanner(System.in);
        crearElectrodomestico();
        System.out.println("Ingrese la cantidad de pulgadas: ");
        setResolucion(sc.nextDouble());
        System.out.println("Posee sintonizador: s/n");
        if(sc.next().equalsIgnoreCase("s")){
            setSintonizador(true);
        }
        precioFinal();
    }
    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.*/
    
    @Override
    public void precioFinal(){
        double precioEnergia = 0;
        double precioPeso = 0 ;
        System.out.println("energia" + getConsumoEnergetico());
        switch(getConsumoEnergetico()){
            case 'A': precioEnergia = 1000d;
            break;
            case 'B':precioEnergia = 800d;
            break;
            case 'C':precioEnergia = 600d;
            break;
            case 'D': precioEnergia = 500d;
            break;
            case 'E':precioEnergia = 300d;
            break;
            case 'F': precioEnergia = 100d;
            break;
        }
        if(getPeso()> 0 && getPeso() <19){
            precioPeso = 100;
        }
        if(getPeso()> 19 && getPeso() <49){
            precioPeso = 500;
        }
        if(getPeso()> 49 && getPeso() <79){
            precioPeso = 800;
        }
        if(getPeso()> 80){
            precioPeso = 1000;
        }
        setPrecio(getPrecio() + precioEnergia + precioPeso);
        if (getResolucion() > 40) {
            setPrecio(getPrecio() * 1.3);
        }
        if (isSintonizador()){
            setPrecio(getPrecio() + 500);
        }
         System.out.println("El precio final del televisor es: $" + getPrecio());
    }
}
