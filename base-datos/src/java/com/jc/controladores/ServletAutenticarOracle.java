/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.controladores;

import com.jc.model.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author campitos
 */
public class ServletAutenticarOracle extends HttpServlet {

 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //response.setContentType("application/vnd.ms-excel");
        
        PrintWriter out = response.getWriter();
     try{
     Conexion.conectarse(request.getParameter("usuario"),
             request.getParameter("password"),
             request.getParameter("sid"));
    RequestDispatcher despachador=  request.getRequestDispatcher("/sitio.html");
      despachador.forward(request, response);
      
     }catch(Exception e){ 
     RequestDispatcher despachador=  request.getRequestDispatcher("/error.html");
      despachador.forward(request, response);  
     }
    }
}