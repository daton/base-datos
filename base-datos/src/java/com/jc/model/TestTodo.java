/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.model;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author campitos
 */
public class TestTodo {
    public static void main(String...x)throws Exception{
        System.out.println("probando usuario");
        
        
        DAOUsuario dao=new DAOUsuario();
       
        ArrayList<Usuario> us= dao.buscarTodos();
        for(Usuario un:us){
            System.out.println(un.getId()+"-"+un.getNombre()+"-"+un.getSueldo());
       
        }
        System.out.println("termino de leer "+us.size()+ " usuarios");
    }
}
