/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.controladores;

import com.jc.model.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author campitos
 */
public class ServletActualizarProducto extends HttpServlet {

  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         int id=  Integer.parseInt( request.getParameter("id"));
         float precio=Float.parseFloat(request.getParameter("precio"));
        try{
        Conexion c=new Conexion();
        Connection con=c.conectarse();
     CallableStatement callate=
             con.prepareCall("{call ACTUALIZAR_PRODUCTO(?,?)}");
        callate.setInt(1,id);
        callate.setFloat(2,precio);
      
        callate.execute();
        
        out.println("Se actualizo el producto");
        }catch(Exception e){
        out.println(e.getMessage());    
        }
      
    }
}