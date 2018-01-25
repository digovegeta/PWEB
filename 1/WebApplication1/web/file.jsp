<%-- 
    Document   : File
    Created on : 23-Jan-2018, 20:02:15
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
        <jsp:useBean id="im" class="Negocio.IMC" scope="page"/>
            <jsp:setProperty name="im" property="*"/>
            <jsp:getProperty name="im" property="result"/>
            <form>
                  <input type="submit" value="Voltar" onclick="location.href='http://localhost:8080/Exercicio1/index.html'"/>
                  <a href="http://localhost:8080/Exercicio1/index.html">Voltar<a/>
            </form> 
    </body>
</html>
