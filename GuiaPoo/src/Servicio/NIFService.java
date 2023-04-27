/*
 En NIFService se dispondrá de los siguientes métodos:
Métodos getters y setters para el número de DNI y la letra.
Método crearNif(): le pide al usuario el DNI y 
con ese DNI calcula la letra que le corresponderá. 
Una vez calculado, le asigna la letra que le corresponde según
Método mostrar(): que nos permita mostrar el NIF 
(ocho dígitos, un guion y la letra en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método 
que funciona de la siguiente manera: Para calcular la letra se toma 
el resto de dividir el número de DNI por 23 (el resultado debe ser un número entre 0 y 22). 
El método debe buscar en un array (vector) de caracteres la posición 
que corresponda al resto de la división para obtener la letra correspondiente.

 */
package Servicio;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author GCopes
 */
public class NIFService {
    
    Scanner sc = new Scanner(System.in);
    NIF doc1 = new NIF();
    char[] poscLetra = new char[23];
    
    poscLetra[0] = "T";   
    poscLetra[1] = "R";  
    poscLetra[2] = "W";  
    poscLetra[3] = "A";  
    poscLetra[4] = "G";  
    poscLetra[5] = "M";  
    poscLetra[6] = "Y";  
    poscLetra[7] = "F";  
    poscLetra[8] = "P";  
    poscLetra[9] = "D";  
    poscLetra[10]= "X";  
    poscLetra[11] = "B";  
    poscLetra[12] = "N";  
    poscLetra[13] = "J";  
    poscLetra[14] = "Z";  
    poscLetra[15] = "S";  
    poscLetra[16] = "Q";  
    poscLetra[17] = "V";  
    poscLetra[18] = "H";  
    poscLetra[19] = "L";  
    poscLetra[20] = "C";  
    poscLetra[21] = "K"; 
    poscLetra[22] = "E";  
    
    
    
    
       
    
    public void crearNif(){
        System.out.println("Ingrese su DNI: ");
        doc1.setDNI(sc.nextLong());
        
    }
    public void calcularNIF(){
        double rest = doc1.getDNI()% 23;
         for(int i = 0; i < 23; i++){
             
}
         
        
    }
}
