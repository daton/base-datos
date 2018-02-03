/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.model;

import java.sql.CallableStatement;
import java.sql.Connection;

/**
 *
 * @author campitos
 */
public class ProcedimientoBasico {
    
    public static void main(String[] args){
        try{
      Connection con=Conexion.conectarse();
     CallableStatement callate=con.prepareCall("{call guardar_almacena(?,?)}");
 
        callate.setInt(1,567);
        callate.setString(2,"Neza");
      
        callate.execute();
  
        System.out.println("Almacen Guardado con éxito");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
