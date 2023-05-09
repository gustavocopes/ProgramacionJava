/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Ahorcado;
import java.util.Scanner;
import servicios.AhorcadoService;

/**
 *
 * @author Gustavo
 */
public class AhorcadoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       AhorcadoService as = new AhorcadoService();
       Ahorcado jg1 = new Ahorcado();
       
       as.juego(jg1);
       }}
