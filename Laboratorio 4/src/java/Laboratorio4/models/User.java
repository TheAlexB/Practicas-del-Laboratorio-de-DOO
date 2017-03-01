/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio4.models;

/**
 *
 * @author Alexis Blanco 
 */
public class User {
    private String usuario;
    private String contrasena;
    private String email;
    private String nombre;
    private String apellidos;
    private String ocupacion;
    
    
    public User()
    {
        usuario="Alexis";
        contrasena="23213";
        email="alex.son2013@hotmail.com";
        nombre="Alexis";
        apellidos="Blanco Gonzalez";
        ocupacion="Estudiante";
    }
    
    public String getUsuario()
    {
        return usuario;
    }
    
    public String getContrasena()
    {
        return contrasena;
    }
    public String toString()
    {
        return usuario + contrasena + email + nombre + apellidos + ocupacion;
    }
}
