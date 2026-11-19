<%@ page import="javax.servlet.http.HttpSession"  %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
//        String name = (String) (request.getAttribute("user"));
        String name = (String) session.getAttribute("user");
    %>
    <body>
        <h1>Dashbord page :</h1>
        <h4>welcome user <%= name%></h4>
        <a href="homepage.jsp">Home page</a>
        <a href="aboutpage.jsp">About page</a>
        <a href="logout.jsp">logout</a>
    </body>
</html>
