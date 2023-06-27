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
public class Empleados extends Facultad {
    protected Integer incorporacion;
    protected Integer despacho;

    public Empleados() {
    }

    public Empleados(Integer incorporacion, Integer despacho, String nombre, Integer dni, String estadoCivil) {
        super(nombre, dni, estadoCivil);
        this.incorporacion = incorporacion;
        this.despacho = despacho;
    }
    
    public Integer getIncorporacion() {
        return incorporacion;
    }

    public void setIncorporacion(Integer incorporacion) {
        this.incorporacion = incorporacion;
    }

    public Integer getDespacho() {
        return despacho;
    }

    public void setDespacho(Integer despacho) {
        this.despacho = despacho;
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
public void cambioDespacho(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese nuevo despacho: ");
    despacho = sc.nextInt();
}
   
}
