

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String error = (String) (request.getAttribute("error"));
        %>
        <h1>Log-in Form :-</h1>
        <%
            if (error != null) {
        %>
        <p style="color:red"><%= error%></p>
        <% }
        %>
        <form action="loginservlet" method="get">
            Name : <input type="text" name="uname"/><br><br>
            PassWord : <input type="text" name="pass"/><br><br>
            <input type="submit" value="login" />
        </form>
    </body>
</html>
