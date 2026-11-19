<%-- 
    Document   : aboutpage
    Created on : 19 Nov, 2026, 2:52:45 PM
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
        <%
           String name = (String) session.getAttribute("user");
        %>
        <h1>welcome to <%= name %> about page</h1>
    </body>
</html>
