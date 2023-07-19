/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author gcopes
 */
public abstract class DAO {
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    
    private final String USER = "root";
    private final String PASS = "root";
    private final String DATABASE = "tienda";

    protected void conectarBase() throws ClassNotFoundException {
    try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            conexion = (Connection) DriverManager.getConnection(url, USER, PASS);
        } catch (SQLException ex) {
            Connection con = null;
            ex.printStackTrace();
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
    
    protected void desconectarBase() throws Exception {
        try{
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        }catch (Exception e){
            throw e;
        }
            
    }
    
    protected void insertarModificarEliminar(String sql) throws Exception{
        try{
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        }catch (SQLException | ClassNotFoundException e){
            throw e;
        }finally{
            desconectarBase();
        }
}
    protected ResultSet consultarBase(String sql) throws Exception{
        try{
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            return resultado;
        }catch(Exception e){
            throw e;
        }
    }
    }
