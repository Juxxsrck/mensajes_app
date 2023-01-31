/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author THINKBOOK
 */
public class MensajesDAO {
    
    public static void crearMensajeDB(Mensajes mensaje){
        Conexion dbConnect = new Conexion();
        
        try(Connection conexion = dbConnect.get_connection()){
            PreparedStatement ps = null;
            try{
               String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?,?)";
               ps = conexion.prepareStatement(query);
               ps.setString(1, mensaje.getMensaje());
               ps.setString(2, mensaje.getAutorMensaje());
               ps.executeUpdate();
               System.out.println("mensaje creado");
            }catch(SQLException ex){
                System.out.println(ex);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public static void leerMensajeDB(){
        
    }
    
    public static void borrarMensajeDB(int id_menaje){
        
    }
    
    public static void actualizarMensajeDB(Mensajes mensaje){
        
    }
}
