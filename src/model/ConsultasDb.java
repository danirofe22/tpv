/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author drofe
 */
public class ConsultasDb {
    private Conexion con;

    public ConsultasDb() {
        this.con = new Conexion();
    }
    
    /**
     * Consulta para agregar un usario a la tabla usuario
     * @param user
     * @return
     * @throws SQLException 
     */
    public boolean insertarUsuario(Usuario user) throws SQLException{
        boolean resultado = false;
        this.con.conectar();//Establezco la conexion con la base de datos
        Statement sentencia = this.con.conexion.createStatement();//Creo el nuevo flujo para la sentencia
        //Creo la sentencia sql
        String sql = String.format("INSERT INTO cafe.usuarios (nombre, apellidos, login, password) values ('%s','%s',%s,%s)", user.getNombre(),user.getApellidos(), user.getLogin(), user.getPassword());
        resultado = sentencia.execute(sql);//Ejecuto la sentencia sql
        this.con.desconectar();//Me desconecto de la base de datos
        return resultado;//Devuelto el resultado de ejecutar la sentencia.
    }
    /**
     * busca un empleado en la bbdd a partir de su login
     * @param login
     * @return 
     * @throws SQLException 
     */
    public boolean leerUsuario(int login) throws SQLException{
        boolean resultado = false;
        this.con.conectar();
        Statement sentencia = this.con.conexion.createStatement();
        String sql = String.format("SELECT * FROM cafe.usuarios WHERE login = %s", login);
        resultado  = sentencia.execute(sql);
        this.con.desconectar();
        return resultado;
    }
    /**
     * Consulta para eliminar un usuario 
     * @param user
     * @throws SQLException 
     */
    public boolean eliminarUsuario(Usuario user) throws SQLException{
        boolean resultado = false;
        this.con.conectar();
        Statement sentencia  = this.con.conexion.createStatement();
        String sql  = String.format("DELETE FROM usuarios WHERE login = %s", user.getLogin());
        resultado = sentencia.execute(sql);
        this.con.desconectar();
        return resultado;
    }
    
    public void modificarUsuario(Usuario user) throws SQLException{
        boolean resultado = false;
        this.con.conectar();
        Statement sentencia  = this.con.conexion.createStatement();
        String sql  = String.format("UPDATE cafe.usuarios SET nombre =('%s'), apellidos = ('%s'), login = (%s), password = (%s) WHERE login = (%s)", user.getNombre(), user.getApellidos(), user.getLogin(), user.getPassword(), user.getLogin());
        resultado = sentencia.execute(sql);
        this.con.desconectar();
    }
    
    public ArrayList<Integer> listarUsuarios() throws SQLException{
        ArrayList<Integer> listLogin = new ArrayList<Integer>();
        
        ResultSet rs;
        this.con.conectar();
        Statement sentencia = this.con.conexion.createStatement();
        String sql = "SELECT login FROM cafe.usuarios";
        sentencia.execute(sql);
        rs = sentencia.getResultSet();
        while(rs.next()){
            int i=1;
            listLogin.add(rs.getInt(i));
            i++;
        }
        return listLogin;
    }
    
    public boolean insertarProducto(Producto prod) throws SQLException{
        boolean resultado = false;
        this.con.conectar();//Establezco la conexion con la base de datos
        Statement sentencia = this.con.conexion.createStatement();//Creo el nuevo flujo para la sentencia
        //Creo la sentencia sql
        String sql = String.format("INSERT INTO cafe.productos (nombre, pvp, stock, idProducto) values ('%s',%s,%s,%s)", prod.getNombre(),prod.getPvp(), prod.getStock(), prod.getIdProducto());
        resultado = sentencia.execute(sql);//Ejecuto la sentencia sql
        this.con.desconectar();//Me desconecto de la base de datos
        return resultado;//Devuelto el resultado de ejecutar la sentencia.
    }
    
    public boolean eliminarProducto(Producto prod) throws SQLException{
        boolean resultado = false;
        this.con.conectar();
        Statement sentencia  = this.con.conexion.createStatement();
        String sql  = String.format("DELETE FROM cafe.productos WHERE idProducto = %s", prod.getIdProducto());
        resultado = sentencia.execute(sql);
        this.con.desconectar();
        return resultado;
    }
    
    public void modificarProducto(Producto prod) throws SQLException{
        boolean resultado = false;
        this.con.conectar();
        Statement sentencia  = this.con.conexion.createStatement();
        String sql  = String.format("UPDATE cafe.productos SET nombre =('%s'), pvp = (%s), stock = (%s), idProducto = (%s) WHERE idProducto = (%s)", prod.getNombre(), prod.getPvp(), prod.getStock(), prod.getIdProducto(), prod.getIdProducto());
        resultado = sentencia.execute(sql);
        this.con.desconectar();
    }
    
    public ArrayList<Producto> listarProductos() throws SQLException{
        ArrayList<Producto> listProducto = new ArrayList<Producto>();
        
        ResultSet rs;
        this.con.conectar();
        Statement sentencia = this.con.conexion.createStatement();
        String sql = "SELECT * FROM cafe.productos";
        sentencia.execute(sql);
        rs = sentencia.getResultSet();
        while(rs.next()){
            listProducto.add(new Producto(rs.getString(1),rs.getFloat(2), rs.getInt(3),rs.getInt(4)));
        }
        return listProducto;
    }
    
    
    
    
    
    
    
    
    public boolean insertarVenta(Venta venta) throws SQLException{
        boolean resultado = false;
        this.con.conectar();//Establezco la conexion con la base de datos
        Statement sentencia = this.con.conexion.createStatement();//Creo el nuevo flujo para la sentencia
        //Creo la sentencia sql
        String sql = String.format("INSERT INTO cafe.ventas (idProducto, numeroTicket, cantidad) values (%s,%s,%s)", venta.getIdProducto(),venta.getNumeroTicket(), venta.getCantidad());
        resultado = sentencia.execute(sql);//Ejecuto la sentencia sql
        this.con.desconectar();//Me desconecto de la base de datos
        return resultado;//Devuelto el resultado de ejecutar la sentencia.
    }
    
    public boolean eliminarVenta(Venta venta) throws SQLException{
        boolean resultado = false;
        this.con.conectar();
        Statement sentencia  = this.con.conexion.createStatement();
        String sql  = String.format("DELETE FROM cafe.ventas WHERE numeroTicket = %s", venta.getNumeroTicket());
        resultado = sentencia.execute(sql);
        this.con.desconectar();
        return resultado;
    }
    
    public void modificarProducto(Venta venta) throws SQLException{
        boolean resultado = false;
        this.con.conectar();
        Statement sentencia  = this.con.conexion.createStatement();
        String sql  = String.format("UPDATE cafe.ventas SET idProducto =(%s), numeroTicket = (%s), cantidad = (%s) WHERE numeroTicket = (%s)", venta.getIdProducto(), venta.getNumeroTicket(), venta.getCantidad(), venta.getNumeroTicket());
        resultado = sentencia.execute(sql);
        this.con.desconectar();
    }
    
    public ArrayList<Venta> listarVentas() throws SQLException{
        ArrayList<Venta> listVenta = new ArrayList<Venta>();
        
        ResultSet rs;
        this.con.conectar();
        Statement sentencia = this.con.conexion.createStatement();
        String sql = "SELECT * FROM cafe.ventas";
        sentencia.execute(sql);
        rs = sentencia.getResultSet();
        while(rs.next()){
            listVenta.add(new Venta(rs.getInt(1),rs.getInt(2), rs.getInt(3)));
        }
        return listVenta;
    }
}