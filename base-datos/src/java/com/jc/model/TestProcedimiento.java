/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.model;

import java.sql.CallableStatement;
import java.sql.Connection;

/**
 *
 * @author campitos
 */
public class TestProcedimiento {
    public static void main(String args[])throws Exception{
        Conexion c=new Conexion();
        Connection con=c.conectarse();
        CallableStatement callate=con.prepareCall("{call insertar_prueba2(?,?)}");
        callate.setString(1,"Juan Carlos Campos");
        callate.registerOutParameter(2,java.sql.Types.INTEGER);
        callate.execute();
        int pk=callate.getInt(2);
        System.out.println("El id insertado es:"+pk);
    }
    
}
