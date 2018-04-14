/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.model;

/**
 *
 * @author campitos
 */

import java.sql.*;
public class Conexion {
    
    public static Connection conectarse(String usuario, String password)throws Exception{
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
       Class.forName("oracle.jdbc.OracleDriver");
       Connection con=DriverManager.getConnection(url,usuario,password);
       return con;
    }
    
    public static Connection conectarse()throws Exception{
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
       Class.forName("oracle.jdbc.OracleDriver");
       Connection con=DriverManager.getConnection(url,"system","system");
       return con;
    }
    
}
