/*
A través de un menú de opciones:
o A) ingresar la contraseña, recordar que antes de 
guardarla debe ser ingresada una contraseña valida).
o B) Mensaje al usuario que tipo de NIVEL es su contraseña
o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
dar permiso
o C) Modificar nombre, donde primero debe poner su contraseña
para dar permiso, SINO impedir cambios
o D) Modificar DNI, donde
 */
package pooej01;

import Entidades.Pass;
import Servicio.PassServicio;
import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class PassMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pass usu1 = new Pass("HolaMundoZ","Gustavo Copes", 30727345);
        PassServicio ps = new PassServicio();
        int opcion = 0;
        String clave;
        System.out.println("Ingrese una opción: ");
        
        do{
        System.out.println("-------MENÚ-------");
        System.out.println("1.Ingresar contraseña");
        System.out.println("2.Modificar contraseña");
        System.out.println("3.Modificar nombre");
        System.out.println("4.Modificar DNI");
        System.out.println("5.Salir\n");
        opcion = sc.nextInt();
        switch(opcion){
            case 1: ps.crearPass(usu1);
                    ps.analizarPass(usu1);
                    
                break;
            case 2: 
                
                System.out.println("Ingrese su contraseña: ");
                clave = sc.next();
                
               while (!clave.equals(usu1.getPass())){
                      System.out.println("Contraseña incorrecta!. Vuelva a ingresar la contraseña: ");
                        clave = sc.next();
                }
                if(clave.equals(usu1.getPass())){
                    ps.crearPass(usu1);
                    ps.analizarPass(usu1);
                    
                }
                break;
            case 3: ps.modificarNombre(usu1);
                break;
            case 4: ps.modificarDNI(usu1);
                break;
            case 5: System.out.println("Finalizado.");
            default:
            break;
                        
        }
        }while(opcion != 5);
    }
    
}
