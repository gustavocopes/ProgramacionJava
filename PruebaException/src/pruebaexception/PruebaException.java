/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebaexception;

/**
 *
 * @author gcopes 
 */
public class PruebaException {

    
    public static void main(String[] args) {
        
        Integer[] numero = new Integer[5]; 
        
        try{
            numero[6] = 5; 
        }catch (ArrayIndexOutOfBoundsException w){
           
            System.out.println("Error: fuera de límite");
        }catch (Exception a){
            System.out.println("fasd");
        }
    }

}
