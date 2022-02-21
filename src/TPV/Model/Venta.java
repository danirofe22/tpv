/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPV.Model;




public class Venta {
    private int idProducto;
    private int numeroTicket;
    private int cantidad;
    private int idVenta;

    public Venta() {
        this.idProducto = 0;
        this.numeroTicket = 0;
        this.cantidad = 0;
        this.idVenta = 0;
    }

    public Venta(int idProducto, int numeroTicket, int cantidad, int idVenta) {
        this.idProducto = idProducto;
        this.numeroTicket = numeroTicket;
        this.cantidad = cantidad;
        this.idVenta = idVenta;
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

    public int getIdVenta() {
        return idVenta;
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

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    @Override
    public String toString() {
        return "Venta{" + "idProducto=" + idProducto + ", numeroTicket=" + numeroTicket + ", cantidad=" + cantidad + ", idVenta=" + idVenta + '}';
    }

    
    
    
}
