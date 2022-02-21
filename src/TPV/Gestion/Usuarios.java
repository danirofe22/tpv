/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPV.Gestion;

import TPV.Model.Usuario;
import java.util.ArrayList;



public class Usuarios {
    private ArrayList<Usuario> listadoUsuarios;

    public Usuarios() {
        this.listadoUsuarios = new ArrayList<Usuario>();
    }

    public Usuarios(ArrayList<Usuario> listadoUsuarios) {
        this.listadoUsuarios = listadoUsuarios;
    }
    
    
    public void add(Usuario usuario){
        this.listadoUsuarios.add(usuario);
    }
    
    public Usuario get(int pos){
        return this.listadoUsuarios.get(pos);
    }

    public ArrayList<Usuario> getListadoUsuarios() {
        return listadoUsuarios;
    }

    public void setListadoUsuarios(ArrayList<Usuario> listadoUsuarios) {
        this.listadoUsuarios = listadoUsuarios;
    }
    
    
    public Usuario buscarUsuario(int login){
        Usuario user = null;
        for (int i = 0; i < this.listadoUsuarios.size(); i++) {
            if(this.listadoUsuarios.get(i).getLogin()==login){
                user = this.listadoUsuarios.get(i);
            }
            
        }
        return user;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "listadoUsuarios=" + listadoUsuarios + '}';
    }
    
    
    
}
