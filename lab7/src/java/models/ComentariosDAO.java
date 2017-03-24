/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * Alexis Blanco Gonzalez 1725357
 */
public class ComentariosDAO {
    private Connection conexion;
    private void abrirConexion() throws SQLException{
        String dbURI = "jdbc:derby://localhost:1527/Comentarios";
        String username = "fcfm";
        String password = "lsti01";
        conexion = DriverManager.getConnection(dbURI, username, password);
    }
    private void cerrarConexion() throws SQLException{
        conexion.close();
    }
    public void insertar(ComentariosPOJO commBlan){
       try{
           abrirConexion();
           String sqlInsert = "insert into COMENTARIOS values ('"+commBlan.getNombre()+"','"+commBlan.getComentario()+"')";
           Statement stmtGon = conexion.createStatement();
           stmtGon.executeUpdate(sqlInsert);
           cerrarConexion();
       }catch(Exception ex){
       }
    }
    public ArrayList buscar(ComentariosPOJO Blan){
        
        ArrayList<ComentariosPOJO> comentarios = new ArrayList();
        try{
            abrirConexion();
            String sqlBuscar = "select * from COMENTARIOS where NOMBRE = '" + Blan.getNombre()+"' and COMENTARIO like '%"+Blan.getComentario()+ "%'";            
            Statement Gun = conexion.createStatement();
            ResultSet mensajes = Gun.executeQuery(sqlBuscar);
            while(mensajes.next()){
                String nombre = mensajes.getString("Nombre");
                String comentario = mensajes.getString("Comentario");
                ComentariosPOJO commentArm = new ComentariosPOJO();
                commentArm.setNombre(nombre);
                commentArm.setComentario(comentario);
                comentarios.add(commentArm);
            }
            cerrarConexion();
        }catch(Exception ex){
        }
        return comentarios;
    }
    
}
