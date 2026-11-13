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

@WebServlet("/deleteStudent")
public class DeleteStudent extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int rno = Integer.parseInt(request.getParameter("rno"));
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/collage?useSSL=false";
            String user = "root";
            String pass = "root123";
            Connection con = DriverManager.getConnection(url, user, pass);
            String sql = "delete from student where rno= ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, rno);
            int res = ps.executeUpdate();
            PrintWriter pw = response.getWriter();

            pw.println("<html>");
            pw.println("<body>");
            if (res == 1) {
                pw.println("<h1>Student Delete succefully</h1>");
            } else {
                pw.println("<h1>some error at delete</h1>");
            }
            
            pw.println("<hr>");
            pw.println("<a href='index.html'>Home</a>");
            pw.println("</body>");
            pw.println("</html>");

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
