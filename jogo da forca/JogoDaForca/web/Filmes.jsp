<%-- 
    Document   : Filmes
    Created on : 30-Jan-2018, 20:46:41
    Author     : Diogo Cardoso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Filme</title>
    </head>
    <body>
        <jsp:useBean id="v" class="Negocio.Forca" scope="session" />
        <jsp:setProperty name="v" property="*" />
        <jsp:getProperty name="v" property="resposta" />
        <br>
        <form action="Filme.jsp" method="GET">
            <input type="text" name="letra" maxlength="1" />
            <input type="submit" value="Verificar"/>
        </form>
    </body>
</html>
