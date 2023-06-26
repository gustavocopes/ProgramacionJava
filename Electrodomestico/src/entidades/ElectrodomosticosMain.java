/*
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos.
 */

package entidades;

import java.util.ArrayList;

/**
 *
 * @author gcopes 
 */
public class ElectrodomosticosMain {

    
    public static void main(String[] args) {
        ArrayList<Electrodomesticos> electros = new ArrayList();
        
        Lavadora lav1 = new Lavadora(40, 1000, "rojo", 'B', 90);
        Televisor tv1 = new Televisor(20, true, 1200, "blanco", 'A', 50);
        Lavadora lav2 = new Lavadora(10, 500, "Azul",'F', 20);
        Televisor tv2 = new Televisor(50, false, 1000, "magenta", 'H', 100);
        
        electros.add(tv2);
        electros.add(tv1);
        electros.add(lav2);
        electros.add(lav1);
        double contLv = 0;
        double contTv = 0;
        for (Electrodomesticos aux : electros) {
            aux.precioFinal();
            if(aux.getClass() == Lavadora.class){
                contLv = contLv + aux.getPrecio();                       
            }
            if(aux.getClass() == Televisor.class){
                contTv = contTv + aux.getPrecio();
            }
            }
        System.out.println("El precio de las lavadoras es: $" + contLv);
            System.out.println("El precio de los televisores es: $" + contTv);
            System.out.println("El precio total de los electrodomésticos es: $" + (contLv + contTv));
        
//        System.out.println("Lavarropas:");
//        lav.crearLavadora();
//        System.out.println("Televisor");
//        tv.crearTelevisor();
   }

}

