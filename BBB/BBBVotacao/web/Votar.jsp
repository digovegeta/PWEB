<%-- 
    Document   : Votar
    Created on : 01-Feb-2018, 15:21:38
    Author     : Diogo Cardoso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Votar page</title>
    </head>
    <body>
        <jsp:useBean id="voto" class="Negocio.Voto" scope="session" />
        <jsp:setProperty name="voto" property="*" />
        <jsp:getProperty name="voto" property="voto" />
    </body>
</html>
