<%-- 
    Document   : autenticar
    Created on : Apr 2, 2014, 6:22:23 PM
    Author     : campitos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <form action="autenticar" method="post" >
            
            <h2>Introduce tu nombre:</h2>
            <input type="text" id="nombre" name="nombre" /><br>
            
            <h2>Tu password</h2>
            <input type="password" id="password" name="password" /><br>
            
            <input type="submit" id="enviar" value="autenticar">
            ${valor}
        </form>   
    </body>
</html>
