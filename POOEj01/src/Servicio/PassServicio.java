/*
● Ingresar datos de usuarios (usando el constructor. 
HACER INGRESO DE DATOS FIJOS (no por teclado)
● Crear un método para ingresar una contraseña (crearPass). 
En este método, debemos validar que la longitud sea correcta.
(10). En caso de ser correcto, almaceno la contraseña.
Si ingreso a esta opción del menú, indefectiblemente deberá dejar
su contraseña asignada.
● Crear un método para analizar la contraseña(analizarPass). Donde:
o SI Existe al menos una letra z : Es nivel MEDIO
o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
o Si ninguna condición se cumple es nivel BAJO
● Crear los métodos correspondientes para modificar el nombre o DNI. 
Atención! Primero
debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
acceso a modificar los datos.
 */
package Servicio;

import Entidades.Pass;
import java.util.Scanner;

/**
 *
 * @author gcopes
 */
public class PassServicio {
    Scanner sc = new Scanner(System.in);
    boolean clave = false;
    //String clave;
    public String crearPass(Pass usuario){
        
        System.out.println("Ingrese nueva contraseña: ");
        usuario.setPass(sc.next());
                        
        while((usuario.getPass().length()) != 10 ){
            System.out.println("La contraseña debe tener 10 caracteres");
            usuario.setPass(sc.next());
        }
        System.out.println("Contraseña guardada!");
        clave = true;
        
        return usuario.getPass();
        
    }
    public void analizarPass(Pass usuario){
        int contZ = 0;
        int contA = 0;
        for (int i = 0; i < 10; i++) {
            //System.out.println(usuario.getPass().substring(i,i+1));
            if ("z".equalsIgnoreCase(usuario.getPass().substring(i,i+1))) {
                contZ++;
            
        }
            else if ("a".equalsIgnoreCase(usuario.getPass().substring(i,i+1))){
                contA++;
        }
            
        }
        if (contZ >=1 && contA < 2) {
            System.out.println("Contraseña NIVEL MEDIO");
            
        }
        else if (contZ > 1 && contA >=2){
        System.out.println("Contraseña NIVEL ALTO");
        }   
        else {System.out.println("Contraseña NIVEL BAJO");}
        
        
    }
    
    public void modificarNombre(Pass usuario){
        if(clave == true){
        System.out.println("Ingrese un nuevo nombre: ");
        usuario.setNombre(sc.next());
        }
        else {
            System.out.println("Debe ingresar la contraseña para acceder a esta opción.");
        }
    }
     public void modificarDNI(Pass usuario){
        if(clave == true){
        System.out.println("Ingrese un nuevo DNI: ");
        usuario.setDNI(sc.nextInt());
        }
        else {
            System.out.println("Debe ingresar la contraseña para acceder a esta opción.");
        }}
     
}
