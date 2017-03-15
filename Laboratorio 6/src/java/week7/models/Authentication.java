/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.models;

/**
 *
 * @author Alexis Blanco Gonzalez 1725357
 */
public class Authentication {
    public static boolean authenticate(String usuario, String password) {

        
        user user = new user();
        
        if(usuario.equals(user.getUsuario()) && password.equals(user.getPassword())) {
            return true;
        }
        else {
            return false;
        }
    }
}