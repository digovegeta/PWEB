<%-- 
    Document   : Outros
    Created on : 30-Jan-2018, 19:50:34
    Author     : Diogo Cardoso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outros</title>
    </head>
    <body>
        <jsp:useBean id="v" class="Negocio.Letras" scope="page" />
        <jsp:setProperty name="v" property="*" />
        a quantidade de outros caracteres existente na palavra é
        <jsp:getProperty name="v" property="outros" />
    </body>
</html>
