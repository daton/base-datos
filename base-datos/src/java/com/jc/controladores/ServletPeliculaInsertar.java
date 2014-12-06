/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.controladores;

import com.jc.model.DAOPelicula;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author campitos
 */
public class ServletPeliculaInsertar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    //METODO HTTP   SENTENCIA SQL
    //POST-         INSERTAR DATOS
    //GET-          BUSCAR POR ID O TODOS
    //PUT -         PARA HACER UN UPDATE EN LA BASE DE DATOS
    //DELETE -      PARA BORRAR
    protected void doGet(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //PEDIMOS DATOS AL CLIENTE
       String titulo= request.getParameter("titulo");
       String sinopsis=request.getParameter("sinopsis");
       System.out.println("NOs lelgo el titulo:"+titulo);
      try{
            //Se invoca el procedimiento
         out.println( DAOPelicula.guardarPelicula(titulo, sinopsis));
            
            
      }catch(Exception e){  }
        
    }
}