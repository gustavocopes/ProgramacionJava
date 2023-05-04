/*

 */
package servicios;

import java.util.Arrays;

/**
 *
 * @author gcopes
 */
public class ArregloServicio {
    
    /**Método inicializarA recibe un arreglo por parámetro 
     * y lo inicializa con números aleatorios.*/
    public void inicializarA(float[] arreglo){
        
        for (int i = 0; i < arreglo.length; i++) {
            
            Arrays.fill(arreglo, i, i + 1,(float) (Math.random()*10));
            
        }
    }
    /**Método mostrar recibe un arreglo por parámetro y
     * lo muestra por pantalla.*/
    
    public void mostrar(float[] arreglo){
        System.out.println(Arrays.toString(arreglo) );
        
    }
    
    /**Método ordenar recibe un arreglo por parámetro 
     * y lo ordena de mayor a menor.*/
    
    public void ordenar(float[] arreglo){
        Arrays.sort(arreglo);
        for (int i = arreglo.length -1; i >=0; i--) {
            System.out.print("[" + arreglo[i] + "]");
        }
        
    }
    
    /**Método inicializarB copia los primeros 10 números del arreglo A 
     * en el arreglo B. Luego llenar las últimas 10 posiciones del arreglo
     * B con 0.5.*/
    public void inicializarB(float[] arregloA, float[] arregloB){
         for (int i = 0; i < 10; i++) {
            
            Arrays.fill(arregloB, i, i + 1,arregloA[i]);
            
        }
         for (int i = 10; i < arregloB.length; i++) {
            Arrays.fill(arregloB, i, i+1, (float) 0.5);
        }
         
    }
}
