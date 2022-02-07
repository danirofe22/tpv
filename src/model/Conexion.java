/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *Permite crear conexion con servidor
 * @author drofe
 */
public class Conexion {

    //Constantes para establecer la conexion con la BBDD
    private final String usuario= "dani";
    private final String password = "1234";
    private final String host = "localhost";
    private final String db = "cafe";
    public Connection conexion;
    
    /**Adri
     * Establece conexion con la BBDD 
     */
    public void conectar(){
        try {
            //indicar el driver a cargar porque este gestor no tiene driver por defefecto
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Cadena de conexion direccion del servidor usuario y contraseña 
            conexion= DriverManager.getConnection("jdbc:mysql://"+host+"/"+db+"", usuario, password);
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al cargar el driver");
            
        }catch (SQLException ex) {
            System.out.println("Error al establecer la conexion"+ex.getMessage());
        }
    }
    
    /**
     * Desconecta la conexion del servidor
     */
    public void desconectar(){
        try {
            conexion.close();//Cierra la conexión
            
        } catch (SQLException ex) {
            System.out.println("Error al cerrar la conexion");
        }
    }
}
