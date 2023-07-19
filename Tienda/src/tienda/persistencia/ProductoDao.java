/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.sql.ResultSet;

/**
 *
 * @author gcopes
 */
public class ProductoDao extends DAO{
    
    public void productoTodos() throws Exception {
        try {
            String sql = "SELECT nombre FROM producto";
            ResultSet rs = consultarBase(sql);
            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString("nombre"));
            }

        } catch (Exception e) {
            throw e;
        }
    }
    public void precioProducto() throws Exception{
        try{
            String sql = "SELECT nombre, precio FROM producto";
            ResultSet rs = consultarBase(sql);
            while(rs.next()){
                System.out.println("Nombre: " + rs.getString("nombre") + ", Precio: $" + rs.getString("precio"));
            }}catch(Exception e){
                    throw e;
                    }
        }
    
     public void precioRango() throws Exception{
        try{
            String sql = "SELECT nombre, precio FROM producto WHERE precio > 120 AND precio < 202";
            ResultSet rs = consultarBase(sql);
            while(rs.next()){
                System.out.println("Nombre: " + rs.getString("nombre") + ", Precio: $" + rs.getString("precio"));
            }}catch(Exception e){
                    throw e;
                    }
        }
     
      public void busqueda() throws Exception{
        try{
            String sql = "SELECT nombre FROM producto Where nombre LIKE '%Portátil%'";
            ResultSet rs = consultarBase(sql);
            while(rs.next()){
                System.out.println("Nombre: " + rs.getString("nombre"));
            }}catch(Exception e){
                    throw e;
                    }
        }
      public void precioBarato() throws Exception{
        try{
            String sql = "SELECT nombre, precio FROM producto ORDER BY precio LIMIT 1";
            ResultSet rs = consultarBase(sql);
            while(rs.next()){
                System.out.println("Nombre: " + rs.getString("nombre") + ", Precio: $" + rs.getString("precio"));
            }}catch(Exception e){
                    throw e;
                    }
        }
       public void insertarProducto() throws Exception{
        try{
            String sql = "INSERT INTO producto VALUES(12,'HP-3000',698.52,4)";
            insertarModificarEliminar(sql);
            }catch(Exception e){
                    throw e;
                    }
        }
       
       public void editarProducto(int cod, String item, double costo) throws Exception{
        try{
            
            String sql = "UPDATE producto SET nombre = '" + item + "', precio = " + costo + " WHERE codigo = " + cod;
            insertarModificarEliminar(sql);
            }catch(Exception e){
                    throw e;
                    }
        }
    }

