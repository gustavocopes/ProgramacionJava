/*
 Método getDiscriminante(): devuelve el valor del discriminante (double).
El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, 
para que esto ocurra, el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
para que esto ocurra, el discriminante debe ser igual que 0.

 */
package Servicio;

import calculadora.Raices;

/**
 *
 * @author gcopes
 */
public class RaicesServicios {
    Raices r1 = new Raices();
    
    public double getDiscriminante(Raices r1){
        double disc;
        disc = Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC();
        return disc;
    }
    
    public boolean tieneRaices(Raices r1){
        boolean sol = true;
        double disc = getDiscriminante(r1);
        if (disc >= 0){
            System.out.println("El sistema tiene dos soluciones");
            return true;
        }
        else{
            return false;
        }

}
    public boolean tieneRaiz(Raices r1){
        boolean sol = true;
        double disc = getDiscriminante(r1);
        if (disc == 0){
            
            return sol;
        }
        else{
            return sol;
        }

    }
   // Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true,
//imprime las 2 posibles soluciones.
    public void obtenerRaices(Raices r1){ //(-b±√((b^2)-(4*a*c)))/(2*a)
        if(tieneRaices(r1) == true){
            System.out.println("El sistema tiene dos posibles soluciones");
            double raiz = -(r1.getB()+Math.sqrt((Math.pow(r1.getB(), 2) - (4 * r1.getA() * r1.getC())))) / (2 * r1.getA());
            System.out.println("Las raices son " + raiz + " y " + (-raiz));
            
        }
    }
    
    /**Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ 
true imprime una única raíz. Es en el caso en que se tenga
una única solución posible.
* 
     * @param r1
*/
    public void obtenerRaiz(Raices r1){
       if(tieneRaiz(r1) == true){
            System.out.println("El sistema tiene una única solución");
            double raiz = -(r1.getB()+Math.sqrt((Math.pow(r1.getB(), 2) - (4 * r1.getA() * r1.getC())))) / (2 * r1.getA());
            System.out.println("La raíz es " + raiz);
    }
    }
       /**Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
y mostrará por pantalla las posibles soluciones que tiene nuestra 
ecuación con los métodos obtenerRaices() o obtenerRaiz(), 
según lo que devuelvan nuestros métodos y en caso de no existir solución,
se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) 
Solo varía el signo delante de -b
     * @param r1
*/
       public void calcular(Raices r1){
            if(tieneRaices(r1) == true){
            System.out.println("El sistema tiene dos posibles soluciones");
            double raiz = -(r1.getB()+Math.sqrt((Math.pow(r1.getB(), 2) - (4 * r1.getA() * r1.getC())))) / (2 * r1.getA());
            System.out.println("Las raices son " + raiz + " y " + (-raiz));
            
        } 
            else if (tieneRaiz(r1) == true){
            System.out.println("El sistema tiene una única solución");
            double raiz = -(r1.getB()+Math.sqrt((Math.pow(r1.getB(), 2) - (4 * r1.getA() * r1.getC())))) / (2 * r1.getA());
            System.out.println("La raíz es " + raiz);
    }
       
       else {
            System.out.println("El sistema no tiene raíces");
}

}
}



