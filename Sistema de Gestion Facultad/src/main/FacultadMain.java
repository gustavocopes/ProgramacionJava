/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import entidades.Empleados;
import entidades.Estudiante;
import entidades.Facultad;
import entidades.PersonalServicio;
import entidades.Profesor;

/**
 *
 * @author gcopes
 */
public class FacultadMain {


    public static void main(String[] args) {
       //    public Estudiante(String curso, String nombre, Integer dni, String estadoCivil) {
        Facultad est1 = new Estudiante("Física", "Juan", 1534, "soltero");
        /*Profesor(String departamento, Integer incorporacion, Integer despacho, String nombre, Integer dni, String estadoCivil) */
        Facultad prof1 = new Profesor("Matemática", 2004, 3, "Gustavo Copes", 30727345, "soltero" );
        //    public PersonalServicio(String seccion, Integer incorporacion, Integer despacho, String nombre, Integer dni, String estadoCivil) {
        Facultad pers1 =  new PersonalServicio("Decanato", 2010, 2, "Pepe", 456132, "viudo");
        PersonalServicio pers2 =  new PersonalServicio("Biblio", 2001, 1, "Ana", 44556132, "casada");
    }

}
