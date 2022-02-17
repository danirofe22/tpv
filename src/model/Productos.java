/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author drofe
 */
public class Productos {
    private ArrayList<Producto> listadoVentas;

    public Productos() {
    }

    public Productos(ArrayList<Producto> listadoVentas) {
        this.listadoVentas = listadoVentas;
    }

    public ArrayList<Producto> getListadoVentas() {
        return listadoVentas;
    }

    public void setListadoVentas(ArrayList<Producto> listadoVentas) {
        this.listadoVentas = listadoVentas;
    }
    
    public Producto buscarProducto(int idProducto){
        Producto prod = null;
        for (int i = 0; i < this.listadoVentas.size(); i++) {
            if(listadoVentas.get(i).getIdProducto()==idProducto){
                prod = this.buscarProducto(i);
            }
        }
        return prod;
    }

    @Override
    public String toString() {
        return "Productos{" + "listadoVentas=" + listadoVentas + '}';
    }
    
    
}
