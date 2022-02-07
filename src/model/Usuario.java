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
public class Usuario {
    private String nombre;
    private String apellidos;
    private int login;
    private int password;

    public Usuario(String nombre, String apellidos, int login, int password) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.login = login;
        this.password = password;
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

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", login=" + login + ", password=" + password + '}';
    }
    
    
}
