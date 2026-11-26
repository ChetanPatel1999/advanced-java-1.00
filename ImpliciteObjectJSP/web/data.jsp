<%-- 
    Document   : data
    Created on : 26 Nov, 2026, 2:52:09 PM
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
            String name = request.getParameter("uname");
            if(name.equals("ram"))
            {
                response.sendRedirect("loginsucces.jsp");
            }
        %>
        <h1>my name is <%= name%></h1>
        <h1>username is wrong</h1>
        <h1><%= session.getAttribute("age") %></h1>
        
    </body>
</html>
