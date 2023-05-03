/*

 */
package servicios;

import entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class CadenaServicio {
/**  Método mostrarVocales(), deberá contabilizar la cantidad 
 * de vocales que tiene la frase ingresada. */
    Scanner sc = new Scanner(System.in);
    //Cadena chain = new Cadena();
    int cont = 0;
    public void mostrarVocales(Cadena chain){
        for (int i = 0; i < chain.getLongitud(); i++) {
            if(chain.getFrase().substring(i, i+1).equalsIgnoreCase("a") || chain.getFrase().substring(i, i+1).equalsIgnoreCase("e") || chain.getFrase().substring(i, i+1).equalsIgnoreCase("i") || chain.getFrase().substring(i, i+1).equalsIgnoreCase("o") || chain.getFrase().substring(i, i+1).equalsIgnoreCase("u")){
                cont++;
            }
        }
        System.out.println("La cantidad de vocales es: " + cont);
        
    }
 /**Método invertirFrase(), deberá invertir la frase ingresada y mostrarla 
  * por pantalla. Por ejemplo: Entrada: "casa blanca",
  * Salida: "acnalb asac"
     * @param chain.*/
    
    public void invertirFrase(Cadena chain){
        for (int i = chain.getLongitud()-1; i <= 0; i--) {
            System.out.print(chain.getFrase().charAt(i));
        }
        
                System.out.println("");
                
    }
    
/** Método vecesRepetido(String letra), recibirá un carácter ingresado por 
 * el usuario y contabilizar cuántas veces se repite el carácter en la frase,
 * por ejemplo:
 * Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
}*/
    public void vecesRepetido(Cadena chain, String letra){
        int cont = 0;
        
        for (int i = 0; i < chain.getLongitud(); i++) {
            if(chain.getFrase().substring(i, i+1).equalsIgnoreCase(letra)){
                cont++;
            }
        }
        System.out.println("La cantidad de veces que se repite " + letra + " es: " + cont);
    }
    
/**Método compararLongitud(String frase), deberá comparar la longitud de 
 * la frase que compone la clase con otra nueva frase ingresada por el 
 * usuario.
}*/
    
    public void compararLongitud(Cadena chain, String frase){
        
        if(chain.getLongitud() == frase.length()){
            System.out.println("Ambas frases tienen la misma longitud");
            
        }
        else{
            System.out.println("Las longitudes de las frases son distintas");
        }
    }
/**Método unirFrases(String frase), deberá unir la frase contenida en la
 * clase Cadena con una nueva frase ingresada por el usuario y mostrar 
 * la frase resultante.*/
    
    public void unirFrase(String frase, Cadena chain){
        
        
        System.out.println(frase + " " + (chain.getFrase()));
    }
    
/**Método reemplazar(String letra), deberá reemplazar todas las letras “a”
 * que se encuentren en la frase, por algún otro carácter seleccionado por 
 * el usuario y mostrar la frase resultante.*/
    
    public void reemplazar(String letra, Cadena chain){
        
        for (int i = 0; i < chain.getLongitud(); i++) {
            if(chain.getFrase().substring(i, i+1).equalsIgnoreCase("a")){
                System.out.print(letra);
            }
            else {
                System.out.print(chain.getFrase().substring(i, i+1));
            }
            
    }
        
}
/** Método contiene(String letra), deberá comprobar si la frase contiene
 * una letra que ingresa el usuario y devuelve verdadero si la contiene
 * y falso si no.*/
    
public void contiene(String letra, Cadena chain){
    boolean encontrado = false;
     int indice = 0;
        do {
            if(chain.getFrase().substring(indice, indice + 1 ).equals(letra)){
            encontrado = true;
            
            }
            indice++;
        }while (!encontrado);
        System.out.println("el indice es " + indice);
        if(encontrado) {
            System.out.println("La frase contiene la letra " + letra);
        }
        else{
            System.out.println("Esta letra " + letra  + " no está contenida en la frase");
        }
}
}





