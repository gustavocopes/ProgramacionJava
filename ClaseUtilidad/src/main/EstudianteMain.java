/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import entidades.Estudiante;
import java.util.Scanner;
import servicios.EstudianteServicio;
 /*
 * @author gcopes 
 */
public class EstudianteMain {

    
    public static void main(String[] args) {
   EstudianteServicio n1 = new EstudianteServicio();
        
        n1.crearEstudiantes();
        n1.calcularPromedio();
        n1.mostrarPromedio();
        n1.compararNotas();
        n1.mostrarAlumnos();
        
    }
    
}