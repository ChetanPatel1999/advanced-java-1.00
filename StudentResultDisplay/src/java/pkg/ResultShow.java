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
        PrintWriter out = response.getWriter();
        String name = request.getParameter("t1"); // shyam
        String stdName = null;
        String rno = null;
        String per = null;
        String gread = null;
        boolean stfind = true;
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
            case "yogesh":
                stdName = "yogesh mandloi";
                rno = "104";
                per = "75.56";
                gread = "B Gread";
                break;
            default:
                stfind = false;
                out.println("<html>");
                out.println("<body style=\"font-family: cursive;background-color: skyblue\">");
                out.println("<h1>Student not found</h1>");
                out.println("<a href='result.jsp' >Go to Form</a>");
                out.println("</body>");
                out.println("</html>");

        }

        if (stfind) {
            out.println("<html>");
            out.println("<body style=\"font-family: cursive;background-color: skyblue\">");
            out.println("<h1> Student Result Card :</h1>");
            out.println("<hr>");
            out.println("<h2> Student name : " + stdName + " </h2>");
            out.println("<h2> Student rno : " + rno + " </h2>");
            out.println("<h2> Student per : " + per + " </h2>");
            out.println("<h2> Student Gread : " + gread + " </h2>");
            out.println("<hr>");
            out.println("<a href='result.jsp' >Go to Form</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
