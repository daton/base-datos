/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author campitos
 */
public class PersistenciaAvion {
    public static String buscarTodosLosAviones() throws Exception{
       //Primero. Nos conectamos a Oracle
     Connection con=Conexion.conectarse();
     //Segundo. Generamos un statement de sql con la conexion anterior
     Statement st=con.createStatement();
     //Tercero. Llevamos a cabo la consulta (select * from producto)
    ResultSet res=st.executeQuery("select * from avion");
    int indice=0;
    ArrayList<Avion> productos=new ArrayList<Avion>();
    
    while(res.next()){
             Integer id=res.getInt(1);
            String tipo=res.getString(2);
           Integer num_asientos=res.getInt(3);
    
        //llenamos el ArrayList en cada vuelta
        productos.add(new Avion(id, tipo,num_asientos));
        
   
        
    }
    
    //El paso final, transformamo a objeto json con jackson
    ObjectMapper maper=new ObjectMapper();

     st.close();
     con.close();
     return maper.writeValueAsString(productos); 
   }

}
