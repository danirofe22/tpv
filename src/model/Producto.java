/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author drofe
 */
public class Producto {
    private String nombre;
    private float pvp;
    private int stock;
    private int idProducto;

    public Producto() {
        this.nombre = "";
        this.pvp = 0.0f;
        this.stock = 0;
        this.idProducto = 0;
    }
    
    

    public Producto(String nombre, float pvp, int stock, int idProducto) {
        this.nombre = nombre;
        this.pvp = pvp;
        this.stock = stock;
        this.idProducto = idProducto;
    }

    public String getNombre(){
        return nombre;
    }

    public float getPvp(){
        return pvp;
    }

    public int getStock(){
        return stock;
    }
    
    public int getIdProducto() {
        return idProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPvp(float pvp) {
        this.pvp = pvp;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", apellidos=" + stock + ", pvp=" + pvp + ", idProducto=" + idProducto + '}';
    }
}
