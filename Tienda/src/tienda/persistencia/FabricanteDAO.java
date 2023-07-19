/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

/**
 *
 * @author gcopes
 */
public class FabricanteDAO extends DAO {
    
     public void insertarFabricante() throws Exception{
        try{
            String sql = "INSERT INTO fabricante VALUES(10,'Dell')";
            insertarModificarEliminar(sql);
            }catch(Exception e){
                    throw e;
                    }
        }
}
