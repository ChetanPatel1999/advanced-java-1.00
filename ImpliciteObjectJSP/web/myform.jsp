<%-- 
    Document   : myform
    Created on : 26 Nov, 2026, 2:48:41 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%= session.getAttribute("age") %></h1>
        <form action="data.jsp" method="get">
            name <input type="text" name="uname" /><br><br>
            <input type="submit" />
        </form>
    </body>
</html>
