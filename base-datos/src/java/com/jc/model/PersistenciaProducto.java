/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.model;

/**
 *
 * @author campitos
 */
//Vamos a agregar el paquete java.sql, 
//pues necesitamos clases que contienen a sql
import java.sql.*;
import java.util.*;
import org.codehaus.jackson.map.ObjectMapper;
public class PersistenciaProducto {
    
   public static String buscarTodosLosProducto() throws Exception{
       //Primero. Nos conectamos a Oracle
     Connection con=Conexion.conectarse();
     //Segundo. Generamos un statement de sql con la conexion anterior
     Statement st=con.createStatement();
     //Tercero. Llevamos a cabo la consulta (select * from producto)
    ResultSet res=st.executeQuery("select * from producto");
    int indice=0;
    ArrayList<Producto> productos=new ArrayList<Producto>();
    
    while(res.next()){
             Integer id=res.getInt(1);
     String descripcion=res.getString(2);
           String marca=res.getString(3);
      String categoria= res.getString(4);
        Float precio=   res.getFloat(5);
        //llenamos el ArrayList en cada vuelta
        productos.add(new Producto(id, 
                descripcion, marca, categoria, precio));
        
   
        
    }
    
    //El paso final, transformamo a objeto json con jackson
    ObjectMapper maper=new ObjectMapper();

     st.close();
     con.close();
     return maper.writeValueAsString(productos); 
   }

    public static void main(String[] args) throws Exception {
        System.out.println(buscarTodosLosProducto());  
    }
   
}
