/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPV.Gestion;

import TPV.Model.Venta;
import java.util.ArrayList;

/**
 *
 * @author drofe
 */
public class Ventas {
     private ArrayList<Venta> listadoVentas;

    public Ventas() {
         this.listadoVentas = new ArrayList<Venta>();
    }

    public Ventas(ArrayList<Venta> listadoVentas) {
        this.listadoVentas = listadoVentas;
    }

    public Venta get(int pos){
        return this.listadoVentas.get(pos);
    }
    
    public ArrayList<Venta> getListadoVentas() {
        return listadoVentas;
    }

    public void setListadoVentas(ArrayList<Venta> listadoVentas) {
        this.listadoVentas = listadoVentas;
    }
    
    public ArrayList<Venta> buscarVenta(int numticket){
        ArrayList<Venta> ventabuscada= null;
        for (int i = 0; i < this.listadoVentas.size(); i++) {
            if(listadoVentas.get(i).getNumeroTicket()==numticket){
                ventabuscada.add(this.listadoVentas.get(i));
            }
        }
        return ventabuscada;
    }

    @Override
    public String toString() {
        return "Ventas{" + "listadoVentas=" + listadoVentas + '}';
    }
     
     
}
