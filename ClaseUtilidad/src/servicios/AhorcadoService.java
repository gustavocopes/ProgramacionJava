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
        
        String[] palabraSec = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            palabraSec[i] = palabra.substring(i, i+1);
        }
        juego.setVector(palabraSec);
        System.out.println("Ingrese la cantidad de jugadas posibles: ");
        juego.setCantJugadas(sc.nextInt());
        
    }
    
/**Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
 * Nota: buscar como se usa el vector.length.*/

    public void longitud(Ahorcado juego){
        System.out.println("La longitud de la palabra es: " + juego.getVector().length);
        
    }
    
/**Método buscar(letra):  este método recibe una letra dada por el usuario y busca 
 * si la letra ingresada es parte de la palabra o no. También informará si la letra 
 * estaba o no.*/
    
    public int buscar(String letra, Ahorcado juego){
        String[] palabra = juego.getVector();
        int cant = 0;
        ;
        for (int i = 0; i < juego.getVector().length; i++) {
            
            if (letra.equalsIgnoreCase(palabra[i])) {
                cant++;
                
        }}
        if (cant >= 1) {
            System.out.println("Muy bien! Esta letra se encuentra " +  cant  + " veces.");                
            
        }
        else {
            System.out.println("Esta letra no está en la palabra buscada!");
            
        }
        juego.setCantLetras(juego.getCantJugadas() + cant);
        return cant;
        
    }
    /**Método encontradas(letra):  que reciba una letra ingresada por el usuario 
     * y muestre cuantas letras han sido encontradas y cuántas le faltan. Este 
     * método además deberá devolver true si la letra estaba y false si la letra 
     * no estaba, ya que, cada vez que se busque una letra que no esté, 
     * se le restará uno a sus oportunidades.*/
    
    public boolean encontradas(String letra, Ahorcado juego){
         boolean encontrada =  false;
         System.out.println("Hasta el momento se han encontrado " + juego.getCantLetras());
         if (buscar(letra, juego) >= 1) {
             encontrada = true;
            }
         else {
             encontrada = false;
             juego.setCantJugadas(juego.getCantJugadas() - 1 );
         }
        return encontrada;
    }
    
    /**Método intentos(): para mostrar cuántas oportunidades le queda al jugador.*/
    
    public void intentos(Ahorcado juego){
        System.out.println("Le quedan " + juego.getCantJugadas() + " intentos.");
    }
    
    /**Método juego(): el método juego se encargará de llamar todos
     * los métodos previamente mencionados e informará cuando el 
     * usuario descubra toda la palabra o se quede sin intentos.
     * Este método se llamará en el main.*/
    
    public void juego(Ahorcado juego){
        int vueltas = 0;
       
       crearJuego(juego);
       longitud(juego);
        
        do {
            System.out.println("Ingrese una letra: ");
            String letra = sc.next();
            buscar(letra, juego);
            
            encontradas(letra, juego);
            boolean hallazgos = encontradas(letra, juego);
            if (hallazgos == false) {
                vueltas--;
                
            }
            intentos(juego);
        } while (juego.getCantJugadas() > 0 || juego.getCantLetras() < juego.getVector().length);
        
          

    }
}
