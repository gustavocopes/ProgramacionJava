/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.main;

import tienda.servicios.productoService;

/**
 *
 * @author gcopes
 */
public class Tienda {

    public static void main(String[] args) throws Exception {
        productoService ps = new productoService();
        
        ps.menu();
    }
}
