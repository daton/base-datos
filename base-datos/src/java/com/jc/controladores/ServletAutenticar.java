/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.controladores;

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
public class ServletAutenticar extends HttpServlet {


    protected void doPost(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //paso 1, por medio del request pedir un parametro, en este caso
        //el nombre
          String name=request.getParameter("nombre");
          String pas=request.getParameter("password");
          out.println("Bienvenido "+name);
          if(pas.equals("hola")){
          RequestDispatcher despachar= request.getRequestDispatcher("/maldito-gobierno-corrupto.html");
          despachar.forward(request, response);
          }else{
              request.setAttribute("valor", "los datos estan mal");
              RequestDispatcher despachar= request.getRequestDispatcher("/autenticar.jsp");
          despachar.forward(request, response);
          }
      
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
