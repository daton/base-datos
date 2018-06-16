/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import oracle.jdbc.internal.OracleTypes;

/**
 *
 * @author campitos
 */
public class TestRefCursor {

    public static void main(String args[]) throws Exception {
        Conexion c = new Conexion();
        Connection con = c.conectarse();
        CallableStatement callate = con.prepareCall("{call buscar_peliculas(?)}");
        callate.registerOutParameter(1, OracleTypes.CURSOR);
        
        callate.execute();
        ResultSet res = (ResultSet) callate.getObject(1);
        while (res.next()) {
            System.out.println("Titulo " + res.getString(2)+" el id "+res.getInt(1));
        }
    }
    
}
