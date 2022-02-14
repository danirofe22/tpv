/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.File;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import model.Conexion;
import model.ConsultasDb;
import model.GestionBlob;
import model.Producto;
import model.Usuario;
import model.Venta;

/**
 *
 * @author drofe
 */
public class Tpv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
        //Gestor de consultas a la base de datos
        ConsultasDb cdb = new ConsultasDb();
        GestionBlob blob = new GestionBlob(); 
        
        File f = new File("img\\6.jpg");
        
        
        Usuario user = new Usuario("David","Jimenez",0,4321, null);
        Usuario user1 = new Usuario("Jose","Perez",0,4321, null);
        Usuario user2 = new Usuario("Alejandr", "Lopez",0,4321, null);
        
        
        blob.setFotoEmpleado(1243, f);
        //cdb.insertarUsuario(user2);
       
        //cdb.insertarUsuario(user1);
        
   
        
        
        
        
        
        
        
        
        
        
        
        
        //Usuarios para prubas
//        Usuario user = new Usuario("jose","rofe",1234,1234, new ImageIcon());
//        Usuario user1 = new Usuario("dani","jimenez",1002,4321,new ImageIcon());
//        Usuario user2 = new Usuario("mario","fernandez",1003,4321,new ImageIcon());
//        Usuario user3 = new Usuario("miguel","velasco",0,4321,new ImageIcon());
//        
//        Producto prod = new Producto("cafe solo", 1.20f, 100, 1);
//        Producto prod1 = new Producto("cafe cortado", 1.20f, 100, 2);
//        Producto prod2 = new Producto("cafe con leche", 1.20f, 100, 0);
//        Producto prod3 = new Producto("cafe manchado", 1.20f, 100, 0);
//        
//        Venta venta1 = new Venta(1, 0, 2);
//        Venta venta2 = new Venta(2, 0, 3);
//        Venta venta3 = new Venta(2, 0, 2);
//        Venta venta4 = new Venta(3, 0, 1);
        
        
//        cdb.insertarProducto(prod);
//        cdb.insertarProducto(prod1);
//        cdb.insertarProducto(prod2);

//        cdb.insertarVenta(venta1);
//        cdb.insertarVenta(venta2);
//        cdb.insertarVenta(venta3);
//        cdb.insertarVenta(venta4);
//        cdb.insertarVenta(venta4);
//       
//
//        System.out.println(cdb.listarProductos());
       
//        cdb.modificarUsuario(user);
//        cdb.insertarUsuario(user1);
//        cdb.insertarUsuario(user3);
        
        
    }
    
}
