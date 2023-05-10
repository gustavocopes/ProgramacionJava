
package main;

import entidades.Ahorcado;
import servicios.AhorcadoService;

/**
 *
 * @author Gustavo
 */
public class AhorcadoMain {

    public static void main(String[] args) {
                
       AhorcadoService as = new AhorcadoService();
       Ahorcado jg1 = new Ahorcado();
       
       as.juego(jg1);
       }
}
