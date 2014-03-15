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
    Conexion con;
    
    public DAOUsuario(){
        con=new Conexion();
    }
    
    public void insertar(Usuario u)throws Exception{
     Connection cone=   con.conectarse();
   CallableStatement callate=  cone.prepareCall("{call insertar_usuario(?,?,?)}");
   callate.setInt(1,u.getId());
   callate.setString(2,u.getNombre());
   callate.setFloat(3, u.getSueldo());
   callate.executeUpdate();
   callate.close();
   cone.close();
   System.out.println("Se inserto el registro con exito");
    
 }
    
    public ArrayList<Usuario> buscarTodos()throws Exception {
        ArrayList<Usuario> todos=new ArrayList<Usuario>();
        Connection cone=con.conectarse();
        Statement st=cone.createStatement();
        ResultSet res=st.executeQuery("select * from usuario1");
        Usuario u=new Usuario();
        while(res.next()){
            u.setId(res.getInt(1));
            u.setNombre(res.getString(2));
            u.setSueldo(res.getFloat(3));
            todos.add(u);
        }
        
       return todos; 
    }
}
