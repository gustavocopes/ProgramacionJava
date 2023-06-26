/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class Lavadora extends Electrodomesticos{
    private double carga;

    public Lavadora() {
        
    }

    public Lavadora(double carga, double precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga ;
    }

    public Lavadora(double carga) {
        this.carga = carga;
    }
    /*Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.*/

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

   public void crearLavadora(){
       Scanner sc = new Scanner(System.in);
       crearElectrodomestico();
       System.out.println("Ingrese la carga del lavarropas: ");
       setCarga(sc.nextDouble());
       precioFinal();
   }
    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.*/
   @Override
   public void precioFinal(){
       double precioEnergia= 0;
        double precioPeso = 0 ;
        System.out.println("energia " + getConsumoEnergetico());
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
       if(getCarga() > 30){
           setPrecio(getPrecio() + 500);
       }
       System.out.println("Color" + getColor());
       System.out.println("El precio final del lavarropas es: $" + getPrecio());
   }
}
