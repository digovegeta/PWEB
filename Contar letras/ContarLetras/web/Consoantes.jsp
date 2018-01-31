<%-- 
    Document   : Consoantes
    Created on : 30-Jan-2018, 19:50:16
    Author     : Diogo Cardoso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consoantes</title>
    </head>
    <body>
        <jsp:useBean id="v" class="Negocio.Letras" scope="page" />
        <jsp:setProperty name="v" property="*" />
        a quantidade de consoantes existente na palavra é
        <jsp:getProperty name="v" property="consoantes" />
    </body>
</html>
