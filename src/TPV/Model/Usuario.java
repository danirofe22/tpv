/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPV.Model;

import javax.swing.ImageIcon;




public class Usuario {
    private String nombre;
    private String apellidos;
    private int login;
    private int password;
    private ImageIcon img;
    private int rol;
    
    public Usuario(){
        this.nombre = "";
        this.apellidos = "";
        this.login = 0;
        this.password = 0;
        this.img = new ImageIcon();
        this.rol = 0;
    }

    public Usuario(String nombre, String apellidos, int login, int password, ImageIcon img, int rol) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.login = login;
        this.password = password;
        this.img = img;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getLogin() {
        return login;
    }

    public int getPassword() {
        return password;
    }

    public ImageIcon getImg() {
        return img;
    }

    public int getRol() {
        return rol;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setImg(ImageIcon img) {
        this.img = img;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", login=" + login + ", password=" + password + ", img=" + img + '}';
    }
    

   
    
}
