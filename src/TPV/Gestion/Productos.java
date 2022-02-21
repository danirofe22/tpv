/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPV.Gestion;

import TPV.Model.Producto;
import java.util.ArrayList;

/**
 *
 * @author drofe
 */
public class Productos {
    private ArrayList<Producto> listadoProductos;

    public Productos() {
    }

    public Productos(ArrayList<Producto> listadoProductos) {
        this.listadoProductos = listadoProductos;
    }

    public ArrayList<Producto> getListadoProductos() {
        return listadoProductos;
    }
    
    public Producto get(int pos){
        return this.listadoProductos.get(pos);
    }

    public void setListadoVentas(ArrayList<Producto> listadoProductos) {
        this.listadoProductos = listadoProductos;
    }
    
    public Producto buscarProducto(int idProducto){
        Producto prod = null;
        for (int i = 0; i < this.listadoProductos.size(); i++) {
            if(listadoProductos.get(i).getIdProducto()==idProducto){
                prod = this.buscarProducto(i);
            }
        }
        return prod;
    }

    @Override
    public String toString() {
        return "Productos{" + "listadoProductos=" + listadoProductos + '}';
    }
    
    
}
