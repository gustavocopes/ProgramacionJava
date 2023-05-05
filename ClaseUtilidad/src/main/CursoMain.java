/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Curso;
import java.util.Scanner;
import servicios.CursoService;

/**
 *
 * @author GCopes
 */
public class CursoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Curso c1 = new Curso();
        CursoService cs = new CursoService();
        
        cs.crearCurso(c1);
        cs.calcularGananciaSemanal(c1);
        
    }
    
}
