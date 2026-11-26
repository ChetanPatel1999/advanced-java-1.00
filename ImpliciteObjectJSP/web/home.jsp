<%-- 
    Document   : home.jsp
    Created on : 26 Nov, 2026, 2:36:48 PM
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

            request.setAttribute("name", "chetan patel");
            out.print(request.getAttribute("name"));
            out.print("hello students");
            session.setAttribute("age", 50);
        %>
 
    </body>
</html>
