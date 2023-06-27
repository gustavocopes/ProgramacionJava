/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public abstract class Facultad {
    Scanner sc = new Scanner(System.in);
    protected String nombre;
    protected Integer dni;
    protected String estadoCivil;

    public Facultad() {
    }

    public Facultad(String nombre, Integer dni, String estadoCivil) {
        this.nombre = nombre;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public void cargarPersonas(){
        
    }
    public void cambioCivil(){
        
        System.out.println("Ingrese su nuevo estado civil: ");
        estadoCivil = sc.next();
        
    }
    
    public void menu(){
        int opc = 0;
        do{
        System.out.println("-------------MENÚ------------------------");
        System.out.println("\n");
        System.out.println("1.Cambiar el estado civil.");
        System.out.println("2.Reasignar despacho.");
        System.out.println("3.Matricular estudiante a un curso.");
        System.out.println("4.Cambio de departamento a profesor.");
        System.out.println("5.Cambiar sección de personal.");
        System.out.println("6.Finalizar.");
        System.out.println("\n");
        System.out.println("Ingrese la operación que desea realizar: ");
        opc =  sc.nextInt();
        switch(opc){
            case 1: 
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default: System.out.println("Ingres una opción válida: ");
            opc = sc.nextInt();
        }       
        }while(opc !=6);
    }
}
