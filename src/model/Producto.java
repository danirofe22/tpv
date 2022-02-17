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
    private String tipo;

    public Producto() {
        this.nombre = "";
        this.pvp = 0.0f;
        this.stock = 0;
        this.idProducto = 0;
        this.tipo = "";
    }
    
    

    public Producto(String nombre, float pvp, int stock, int idProducto, String tipo) {
        this.nombre = nombre;
        this.pvp = pvp;
        this.stock = stock;
        this.idProducto = idProducto;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
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

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", pvp=" + pvp + ", stock=" + stock + ", idProducto=" + idProducto + ", tipo=" + tipo + '}';
    }
    

    
}
