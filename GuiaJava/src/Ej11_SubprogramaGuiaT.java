/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, 
y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el carácter que se indica en la tabla 
y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. 

Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */

import java.util.Scanner;
public class Ej11_SubprogramaGuiaT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();// con nextLine registra los espacios incluidos
        
        while (!".".equalsIgnoreCase(frase.substring(frase.length()-1, frase.length()))) {
            System.out.println("La frase debe terminar con punto.  Ingrese nuevamente la frase: ");
            frase = sc.nextLine();
        }
        String retorno = encriptar(frase);
        System.out.println(retorno);
        
    }
    public static String encriptar(String frase){
        frase = frase.toLowerCase();
        String encriptado = "";
        for(int i=0; i < frase.length(); i++){
            String letra = frase.substring(i, i+1);
        
          
           switch(letra){
              
              case "a": letra = "@";
                 break;
              case "e": letra = "#";
                  break;
              case "i": letra = "$";
                  break;
              case "o": letra = "%";
                  break;
              case "u": letra = "*";
                break;
              
              default: letra =  letra;
            
          }  
          encriptado = encriptado + letra;
        }
         return encriptado;
    }
    
    
}
