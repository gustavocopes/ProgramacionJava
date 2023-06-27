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
public class Profesor extends Empleados{
    protected String departamento;

  
    public Profesor(String departamento, Integer incorporacion, Integer despacho, String nombre, Integer dni, String estadoCivil) {
        super(incorporacion, despacho, nombre, dni, estadoCivil);
        this.departamento = departamento;
    }

    public Profesor() {
    }


    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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
    
    public void cambioDepartamento(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nuevo departamento: ");
        departamento =  sc.next();
    }
    
}
