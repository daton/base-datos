/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.controladores;

/**
 *
 * @author campitos
 */
import com.jc.model.Conexion;
import java.sql.*;
import oracle.jdbc.OracleTypes;
public class InvocacionCursor {
    public static void main(String[] args) {
        try{
       Connection con=     Conexion.conectarse();
      CallableStatement callate= con.prepareCall("{call obtener_almacen(?)}");
      callate.registerOutParameter(1, OracleTypes.CURSOR);
      callate.executeUpdate();
      ResultSet res=(ResultSet) callate.getObject(1);
     
      while(res.next()){
       Integer numero=   res.getInt(1);
       String ubicacion=res.getString(2);
          System.out.println("Numero "+numero+" Ubicacion "+ubicacion);
          
      }
         
        }catch(Exception e){
            
        }
    }
}
