package myservlate;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;

@WebServlet("/mytest/data")
public class Test extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>this my Test servlate</h1>");
        out.println("<a href=''>home</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
