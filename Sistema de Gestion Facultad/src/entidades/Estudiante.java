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
public class Estudiante extends Facultad {
    Scanner sc = new Scanner(System.in);
    protected String curso;

    public Estudiante() {
    }

    
    public Estudiante(String curso, String nombre, Integer dni, String estadoCivil) {
        super(nombre, dni, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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
    public void nuevaMatriculacion(){
        
        System.out.println("Ingrese el curso a matricular: ");
        curso = sc.next();
    }
    
    
}
