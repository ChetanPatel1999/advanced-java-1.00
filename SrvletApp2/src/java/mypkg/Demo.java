package mypkg;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;

@WebServlet("/mydemo")
public class Demo extends HttpServlet {

    public void init() {
        System.out.println("init is called ");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("do get method is called from Demo servlet");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>do get method is called from Demo servlet</h1>");
        out.println("</body>");
        out.println("</html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("do post method is called");
    }

    public void destroy() {
        System.out.println("destroy method is called ");
    }

}
