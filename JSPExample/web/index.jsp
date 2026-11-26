
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
            int age = 45;

            int square(int num) {
                return num * num;
            }
        %>
        <%
            int res = square(9);
            out.println(res);
            int a = 12;
            int b = 5;
            int c = a + b;
            out.println(c);
            if (a > 7) {
                out.print("hello students");
            }
            for (int i = 1; i <= 5; i++) {
                out.print(i);
            }
        %>

        <h1>   <%= square(4) %>   </h1>
        <h1>   <%=  12 + 50  %>   </h1>
        <h1>   <%=  res %>   </h1>
    </body>
</html>
