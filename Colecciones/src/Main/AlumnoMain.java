/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import entidades.Alumno;
import java.util.Scanner;
import servicios.AlumnoService;

/**
 *
 * @author gcopes 
 */
public class AlumnoMain {

    
    public static void main(String[] args) {
        AlumnoService as = new AlumnoService();
        Scanner sc = new Scanner(System.in);
        
        as.crearAlumno();
        
        as.mostrarAlumno();
        System.out.println("Ingrese el nombre del alumno: ");
        String a1 =  sc.next();
        as.metodoFinal(a1);
    }

}
