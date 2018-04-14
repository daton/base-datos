/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.controladores;

import com.jc.model.Almacen;
import com.jc.model.DAOAlmacen;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author T-102
 */
public class BuscarAlmacenPorId extends HttpServlet {

protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //En este caso no hay parametros enviados por el cliente
        //Simplemente generamos los oobjetos necesarios
        
      Integer id=     Integer.parseInt(request.getParameter("id"));
        
        ArrayList<Almacen> datos=new ArrayList<Almacen>();
        DAOAlmacen dao=new DAOAlmacen();
        
        //llenamos el arraylist
        datos=dao.buscarPoId(id);
        
        //Hacemos el mapeo a JSON
        ObjectMapper maper=new ObjectMapper();
        
        //Sacamos al cliente
        out.print(maper.writeValueAsString(datos));
        
        
        
        
   
    }
}