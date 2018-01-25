<%-- 
    Document   : file
    Created on : 24-Jan-2018, 11:33:59
    Author     : Diogo Cardoso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="v" class="Negocio.Convercao" scope="page"/>
        <jsp:setProperty name="v" property="*"/>
        <jsp:getProperty name="v" property="extenso"/>
    </body>
</html>
