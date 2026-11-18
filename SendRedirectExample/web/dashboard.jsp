
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        String name = (String)(request.getAttribute("user"));
    %>
    <body>
        <h1>Dashbord page :</h1>
        <h4>welcome user <%= name%></h4>
    </body>
</html>
