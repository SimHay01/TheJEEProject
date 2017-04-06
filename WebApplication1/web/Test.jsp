<%-- 
    Document   : Test
    Created on : 6 avr. 2017, 11:58:20
    Author     : Simon Hay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <jsp:useBean id="bean1" class="jeu.Jeu" scope="session"/>
        
        <% bean1.initialisation(); %>

    </body>
</html>
