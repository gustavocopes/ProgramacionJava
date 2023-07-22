/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancias.persistencia;

import java.sql.ResultSet;

/**
 *
 * @author gcopes
 */
public class FamiliasDAO extends DAO {
    
    public void consultarFamilia() throws Exception{
        try{
            String sql = "SELECT nombre FROM familias WHERE num_hijos >= 3 AND edad_minima < 10 ";
            ResultSet rs = consultas(sql);
            while(rs.next()){
                System.out.println(rs.getString("nombre"));
            }
        }catch(Exception e){
            throw e;
        }
    }
    
}
