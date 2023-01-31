/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.mensajes_app;

import java.sql.Connection;

/**
 *
 * @author THINKBOOK
 */
public class Inicio {
     public static void main(String[] args){
        Conexion conexion = new Conexion();
        try(Connection cnx = conexion.get_connection()){
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
