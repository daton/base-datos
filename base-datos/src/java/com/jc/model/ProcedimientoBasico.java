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
     CallableStatement callate=con.prepareCall("{call guardar_almacen(?,?)}");
        callate.registerOutParameter(1,java.sql.Types.INTEGER);
        callate.setInt(1,321);
        callate.setString(2,"Ecatepec");
      
        callate.execute();
  
        System.out.println("Almacen Guardado con éxito");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
