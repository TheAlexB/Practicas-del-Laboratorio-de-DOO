/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio4.models;

/**
 *
 * @author Alexis Blanco Gonzalez 
 */
public class Authentication{
    
    
    
    public static boolean authenticate(String usuario, String contrasena) {
//
        User user=new User();
        
        if(usuario.equals(user.obtenerUsuario()) && contrasena.equals(user.obtenerContrasena())) {
            return true;
        }
        else {
            return false;
        }
    }
}
