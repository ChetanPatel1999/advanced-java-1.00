package pkg;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.PrintWriter;
import java.sql.ResultSet;

@WebServlet("/displayStudent")
public class DisplayStudent extends HttpServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/collage?useSSL=false";
            String user = "root";
            String pass = "root123";
            Connection con = DriverManager.getConnection(url, user, pass);
            String sql = "select * from student";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            PrintWriter pw = response.getWriter();
            pw.println("<html>");
            pw.println("<body>");
            pw.println("<h1>Student List :- </h1>");
            pw.println("<table border='1' width='500' height='200' cellspacing='0' style='text-align:center'  >");
            pw.println("<tr>");
            pw.println("<th>Name</th>");
            pw.println("<th>Rno</th>");
            pw.println("<th>Per</th>");
            pw.println("<th>City</th>");
            pw.println("</tr>");
            while (rs.next()) {
                pw.println("<tr>");
                pw.println("<td>" + rs.getString("name") + "</td>");
                pw.println("<td>" + rs.getInt("rno") + "</td>");
                pw.println("<td>" + rs.getFloat("per") + "</td>");
                pw.println("<td>" + rs.getString("city") + "</td>");
                pw.println("</tr>");
            }
            
            pw.println("</table>");
            pw.println("<hr>");
            pw.println("<a href='index.html' >Home</a>");
            pw.println("<a href='form.jsp' >Add student</a>");
            pw.println("</body>");
            pw.println("</html>");
            
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
