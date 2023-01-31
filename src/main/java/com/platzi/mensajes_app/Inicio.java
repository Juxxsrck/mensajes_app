/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.mensajes_app;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author THINKBOOK
 */
public class Inicio {
     public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);
         
         int opcion = 0;
         
         do {
             System.out.println("______________");
             System.out.println("Aplicacion de mensajes");
             System.out.println("1. Crear mensajes");
             System.out.println("2. Listar mensajes");
             System.out.println("3. Editar mensajes");
             System.out.println("4. Eliminar mensajes");
             System.out.println("5. Salir");
             //leemos la opcion del usuario
             opcion = sc.nextInt();
             
             switch (opcion){
                 case 1:
                     MensajesService.crearMensaje();
                     break;
                 case 2:
                     MensajesService.listarMensajes();
                     break;
                 case 3:
                     MensajesService.borrarMesaje();
                     break;
                 case 4:
                     MensajesService.editarMensaje();
                     break;
                 default:
                     break;
             }
         }while(opcion != 5);
         
    }
}
