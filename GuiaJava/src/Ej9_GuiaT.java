
import static jdk.nashorn.internal.objects.NativeMath.random;

/*
 Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
El programa deberá calcular y mostrar el resultado de la suma de los números leídos,
pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */

/**
 *
 * @author HP
 */
public class Ej9_GuiaT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num, suma;
       suma = 0;
        do {
            num =  (int) (Math.random() * 20);
            System.out.println(num);
            suma = num + suma;
            
        } while (num != 0);
        
        System.out.println("Se capturó el cero!!");
        System.out.println("La suma es:" + suma);
        
    }
    
}
