/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancias.persistencia;
import java.sql.*;
/**
 *
 * @author gcopes
 */
public abstract class DAO {
    
    protected Connection conexion = null;
    protected Statement sentencia = null;
    protected  ResultSet seleccion = null;
    private final String URL = "dbc:mysql://localhost:3306/estancias_exterior";
    private final String PASS = "root";
    private final String USER = "root";
    
    protected void conectarBase() throws SQLException{
    try{
    conexion = DriverManager.getConnection(URL, USER, PASS);
    
}catch(SQLException e){
    throw e;
}
    }
    
    protected void desconectarBase() throws Exception{
        try{
            if (conexion != null){
                conexion.close();
            }
            if (seleccion != null){
                seleccion.close();
            }
            if (sentencia != null){
                sentencia.close();
            }
        }catch(Exception e){
            throw e;
        }
    }
    
    protected void modificarBase(String sql) throws Exception{
        try{
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
            
        }catch(Exception e){
            throw e;
        }finally {
            desconectarBase();
        }
    }
    
    protected ResultSet consultas(String sql) throws Exception{
        try{
            conectarBase();
            sentencia = conexion.createStatement();
            seleccion = sentencia.executeQuery(sql);
            return seleccion;
        }catch(Exception e){
            throw e;
        }
    }
}
