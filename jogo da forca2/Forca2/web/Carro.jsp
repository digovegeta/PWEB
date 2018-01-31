<%-- 
    Document   : Carros
    Created on : 30-Jan-2018, 20:47:15
    Author     : Diogo Cardoso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carro</title>
    </head>
    <body>
        <jsp:useBean id="v" class="Negocio.Forca" scope="session" />
        <jsp:setProperty name="v" property="*" />
        <jsp:getProperty name="v" property="resposta" /><br>
        
        <jsp:getProperty name="v" property="jogo" /><br>
        <jsp:getProperty name="v" property="letra" /><br>
        <br>
        <form action="Carro.jsp" method="GET">
            <input type="text" name="letra" maxlength="1" />
            <input type="submit" value="Verificar" />
        </form>
        <jsp:getProperty name="v" property="tentativas" />
        <jsp:getProperty name="v" property="letrasTentadas" /><br>
        <jsp:getProperty name="v" property="dica" /><br>
        <jsp:getProperty name="v" property="condicaoDeVitoria" /><br>
        
        
    </body>
</html>
