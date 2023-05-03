/*
.
 */
package servicios;

import entidades.ParDeNumeros;

/**
 *
 * @author gcopes
 */
public class ParDeNumerosServicio {
    
    
/**Método mostrarValores que muestra cuáles son los dos números guardados.*/
    
    public void mostrarValores(ParDeNumeros par){
        System.out.println("Número 1: "+ par.getNum1() + ", y el número 2 es: " + par.getNum2());
        
    }
/**Método devolverMayor para retornar cuál de los dos atributos tiene el mayor
 * valor*/
    
    public double devolverMayor(ParDeNumeros par){
        double mayor;
        
        mayor = Math.max(par.getNum1(), par.getNum2());
        
        return mayor;
        
    }
    
/**Método calcularPotencia para calcular la potencia del mayor valor de la clase
 * elevado al menor número. Previamente se deben redondear ambos valores.*/
    
   public double calcularPotencia(double num, ParDeNumeros par){
       double potencia = 0;
       if (devolverMayor(par) == par.getNum1()) {
           potencia = Math.pow(Math.round(par.getNum1()),Math.round(par.getNum2()));
                  
       }else  {
           potencia = Math.pow(Math.round(par.getNum2()),Math.round(par.getNum1()));
       }
       
       return potencia;
       
   }
   
/**Método calculaRaiz, para calcular la raíz cuadrada del menor de los 
 * dos valores. Antes de calcular la raíz cuadrada se debe obtener el
 * valor absoluto del número.*/ 
   
public double calculaRaiz(ParDeNumeros par){
    double raiz = 0;

    if (devolverMayor(par) != par.getNum1()) {
           raiz =Math.round(Math.sqrt(Math.abs(par.getNum1())));
                  
       }else  {
           raiz = Math.round(Math.sqrt(Math.abs(par.getNum2())));
    }
    return raiz;
}
}

//public double calcularPotencia() { 
//    double mayor = devolverMayor(); 
//    double menor = mayor == par.getNumero1() ? par.getNumero2() : par.getNumero1();  
//    mayor = Math.round(mayor);        menor = Math.round(menor);        return Math.pow(mayor, menor);    }
//}
