/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.controladores;

import com.jc.model.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author campitos
 */
public class ServletAutenticarUsuario extends HttpServlet {

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          response.setContentType("text/html;charset=UTF-8");
            
            PrintWriter salida=response.getWriter();
            
        try {
          
            String usuario=   request.getParameter("usuario");
            String password=request.getParameter("password");
            
            
            System.out.println("El usuario es "+usuario+" El password es "+password);
            
            Conexion.conectarse(usuario, password);
            
            System.out.println("Si te autenticaste");
            
            salida.println("Si te autenticaste");
            //RequestDispatcher despachador=   request.getRequestDispatcher("/principal.html"); 
           // despachador.forward(request, response);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            salida.println(ex.getMessage());
        }
     
        
        
       
    }
}