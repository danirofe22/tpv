/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import java.sql.Blob;
import javax.imageio.ImageIO;

/**
 *
 * @author drofe
 */
public class GestionBlob {
    Conexion con;
    
    public GestionBlob(){
        this.con = new Conexion();
    }
    
    
    /**
     * Metodo para agregar una foto a la base de datos de un usuario
     * @param login
     * @param f
     * @throws FileNotFoundException
     * @throws SQLException 
     */
    public void setFotoEmpleado(int login, File f){
       
        PreparedStatement pstm;
        FileInputStream fis;
        String sql;

        //Conexion con la base de datos
        con.conectar();
        
        try {
            sql = "UPDATE usuarios SET imagen = ? WHERE login = ?";
            //Abro el archivo en un flujo de fichero
            fis = new FileInputStream(f);
            //Preparamos la sentencia
            pstm = con.conexion.prepareStatement(sql);
            //Pasamos los parametros a la sentencia
            pstm.setBinaryStream(1, fis,(int) f.length());
            pstm.setInt(2, login);
            pstm.executeUpdate(sql);
            
            //Desconexion con la base de datos
            con.desconectar();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestionBlob.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al cargar la imagen para subir el archivo "+ ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(GestionBlob.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar la sentencia "+ ex.getMessage());
        }
    }
    public ImageIcon getBlobBd(int login){
        ImageIcon img = null;
        PreparedStatement pstm;
        int blobLength;
        byte[] blobAsBytes;
        String sql;
        
        this.con.conectar();
        
        sql = "SELECT imagen FROM usuarios WHERE login = ?";
        try {
            pstm = con.conexion.prepareStatement(sql);
            pstm.setInt(1, login);
            
            ResultSet rs = pstm.executeQuery(sql);
            while(rs.next()){
                Blob blob = rs.getBlob("imagen");
                blobLength = (int) blob.length();
                blobAsBytes = blob.getBytes(1, blobLength);
                final BufferedImage bfImg = ImageIO.read(new ByteArrayInputStream(blobAsBytes));
                img = new ImageIcon(bfImg);
                
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(GestionBlob.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar la sentencia sql que devuelve una imagen del usuario "+ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(GestionBlob.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al ejecutar flujos de entrada y salida al pedir una imagen a la base de datos para el usuario "+ ex.getMessage());
        }
        return img;
    }
}


