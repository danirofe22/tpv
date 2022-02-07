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
public class Venta {
    private int idProducto;
    private int numeroTicket;
    private int cantidad;

    public Venta(int idProducto, int numeroTicket, int cantidad) {
        this.idProducto = idProducto;
        this.numeroTicket = numeroTicket;
        this.cantidad = cantidad;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public int getNumeroTicket() {
        return numeroTicket;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setNumeroTicket(int numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Venta{" + "idProducto=" + idProducto + ", numeroTicket=" + numeroTicket + ", cantidad=" + cantidad + '}';
    }
    
    
}
