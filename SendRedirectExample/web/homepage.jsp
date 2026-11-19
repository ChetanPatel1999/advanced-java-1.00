<%-- 
    Document   : homepage
    Created on : 19 Nov, 2026, 2:51:33 PM
    Author     : PC
--%>
<%@ page import="javax.servlet.http.HttpSession"  %>
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
            if(name==null)
            {
                response.sendRedirect("login.jsp");
            }
        %>
        <h1>welcome <%= name%>  to home page </h1>
    </body>
</html>
