/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.model;

import java.sql.*;
import java.util.ArrayList;

public class DAOAlmacen {
  
    public void guardar(Almacen almacen){
         try{
      Connection con=Conexion.conectarse();
     CallableStatement callate=con.prepareCall("{call guardar_almacen(?,?)}");
 
        callate.setInt(1,almacen.getNumero_almacen());
        callate.setString(2,almacen.getUbicacion_almacen());
      
        callate.execute();
  
        System.out.println("Almacen Guardado con éxito");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void actualizar(Almacen almacen){
        
    }
    
    public Almacen buscarPorId(Integer id){
        
        return null;
    }
    
    public ArrayList<Almacen> buscarTodos(){
        
        return null;
    }
    
    public  void borrar(Integer id){
        
    }
    
}
