package pkg;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;

@WebServlet("/ResultShow")
public class ResultShow extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("uname");
        String stdName;
        String rno;
        String per;
        String gread;
        switch (name) {
            case "ram":
                stdName = "ram sharma";
                rno = "101";
                per = "90.56";
                gread = "A Gread";
                break;
            case "shyam":
                stdName = "shyam patel";
                rno = "102";
                per = "70.56";
                gread = "B Gread";
                break;
            case "rohit":
                stdName = "rohit patidar";
                rno = "103";
                per = "50.56";
                gread = "C Gread";
                break;
        }

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>"+name+"</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
