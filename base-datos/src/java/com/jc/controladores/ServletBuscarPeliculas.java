/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.controladores;

import com.jc.model.DAOPelicula;
import com.jc.model.Pelicula;
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
 * @author campitos
 */
public class ServletBuscarPeliculas extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        ArrayList<Pelicula> peliculas = DAOPelicula.buscarTodasPeliculas();
        ObjectMapper mapeo = new ObjectMapper();
        out.println(mapeo.writeValueAsString(peliculas));

    }
}
