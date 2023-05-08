/*
 
 */
package servicios;

import entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author GCopes
 */
public class AhorcadoService {
    Scanner sc = new Scanner(System.in);
    
/**Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
 * Con la palabra del usuario, pone la longitud de la palabra, como la longitud del 
 * vector. Después ingresa la palabra en el vector, letra por letra, quedando 
 * cada letra de la palabra en un índice del vector. Y también, guarda la 
 * cantidad de jugadas máximas y el valor que ingresó el usuario.*/
    
    public void crearJuego(Ahorcado juego){
        
        System.out.println("Ingrese una palabra: ");
        String palabra = sc.next();
        //juego.setVector.length(palabra.length());
        String[] palabraSec = new String[palabra.length()];
        for (int i = 0; i < juego.getCantLetras(); i++) {
            palabraSec[i] = palabra.substring(i, i+1);
        }
        juego.setVector(palabraSec);
        System.out.println("Ingrese la cantidad de jugadas posibles: ");
        juego.setCantJugadas(sc.nextInt());
    }
    
/**Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
 * Nota: buscar como se usa el vector.length.*/

    public void longitud(Ahorcado juego){
        System.out.println("La longitud de la palabra es: " + juego.getCantLetras());
        
    }
    
/**Método buscar(letra):  este método recibe una letra dada por el usuario y busca 
 * si la letra ingresada es parte de la palabra o no. También informará si la letra 
 * estaba o no.*/
    
    public void buscar(String letra, Ahorcado juego){
        String[] palabra = juego.getVector();
        int cant = 0;
        for (int i = 0; i < juego.getCantLetras(); i++) {
            if (letra.equalsIgnoreCase(palabra[i])) {
                cant++;
                
        }}
        if (cant >= 1) {
            System.out.println("Muy bien! Esta letra se encuentra " +  cant  + " veces.");                
            
        }
        else {
            System.out.println("Esta letra no está en la palabra buscada!");
        }
        juego.setCantLetras(cant);
        
        
    }
    /**Método encontradas(letra):  que reciba una letra ingresada por el usuario 
     * y muestre cuantas letras han sido encontradas y cuántas le faltan. Este 
     * método además deberá devolver true si la letra estaba y false si la letra 
     * no estaba, ya que, cada vez que se busque una letra que no esté, 
     * se le restará uno a sus oportunidades.*/
    
    public boolean encontradas(String letra, Ahorcado juego){
         boolean encontrada =  false;
         System.out.println("Hasta el momento se han encontrado ");
        
        return encontrada;
    }
}
