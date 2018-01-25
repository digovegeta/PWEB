<%-- 
    Document   : file
    Created on : 24-Jan-2018, 10:21:01
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
        <jsp:useBean id="v" class="Negocio.Regras" scope="session"/>
        <jsp:setProperty name="v" property="*"/>
        <jsp:getProperty name="v" property="result"/>
        <form>
            Informe o número<input type="text" name="numero"/> 
            <input type="submit" value="Verificar"/>
        </form>
        <jsp:getProperty name="v" property="tentativas"/>
    </body>
</html>
