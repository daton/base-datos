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
import java.sql.*;
import java.util.ArrayList;
public class DAOUsuario {
    static Conexion  con;
    
    public DAOUsuario(){
        con=new Conexion();
    }
    
    public void insertar(Usuario u)throws Exception{
     Connection cone=   con.conectarse();
   CallableStatement callate=  cone.prepareCall("{call insertar_usuario(?,?,?)}");
   callate.setInt(1,u.getId());
   callate.setString(2,u.getLogin());
   callate.setString(3, u.getPassword());
   callate.executeUpdate();
   callate.close();
   cone.close();
   System.out.println("Se inserto el registro con exito");
    
 }
    
    public static  ArrayList<Usuario> buscarTodos()throws Exception {
       ArrayList<Usuario> usuarios=new ArrayList<Usuario>();  
       //Primero nos conectamos a la base de datos
    Connection conexion= con.conectarse();
    //Crear un Statement de sql
     Statement st=  conexion.createStatement();
       ResultSet res=st.executeQuery("select * from usuario1 order by login");
       while(res.next()){
         int id=  res.getInt(1);
         String login=res.getString(2);
         String password=res.getString(3);
         Usuario u=new Usuario(id,login,password); 
         usuarios.add(u);
       }
       return usuarios;
    }
}
