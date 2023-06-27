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
public class PersonalServicio extends Empleados {

    protected String seccion;

    public PersonalServicio(String seccion, Integer incorporacion, Integer despacho, String nombre, Integer dni, String estadoCivil) {
        super(incorporacion, despacho, nombre, dni, estadoCivil);
        this.seccion = seccion;
    }

    public PersonalServicio() {
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
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

    public void trasladoSeccion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la nueva sección del empleado: ");
        seccion = sc.next();
    }
}
