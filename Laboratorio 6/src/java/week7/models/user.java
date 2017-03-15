/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.models;

/**
 *
 * @author Alexis Blanco Gonzalez 
 */
public class user {
    private String usuario;
    private String password;
    String email;
    String nombre;
    String apellido;
    String ocupacion;
    

    public user() {
        this.usuario = "Alexis";
        this.password="123";
        email= "alex.son2013@hotmail.com";
        nombre="Alexis";
        apellido="Blanco Gonzalez";
        ocupacion="Estudiante";
        
    }

    public String getUsuario() {
        return this.usuario;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public String getOcupacion(){
        return ocupacion;
    }
}
