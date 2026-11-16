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

@WebServlet("/updateStudent")
public class UpdateStudent extends HttpServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int rno = Integer.parseInt(request.getParameter("rno"));
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/collage?useSSL=false";
            String user = "root";
            String pass = "root123";
            Connection con = DriverManager.getConnection(url, user, pass);
            String sql = "select * from student where rno = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, rno);
            ResultSet rs = ps.executeQuery();
            PrintWriter pw = response.getWriter();
            
            pw.println("<html>");
            pw.println("<body>");
            if (rs.next()) {
                pw.println("<h1>Student update  : </h1>");
                pw.println("<form action='modifyStudent' method='get' >");
                pw.println("<b>Name :<b/> <input type='text' value='" + rs.getString("name") + "'  name='uname' placeholder='Enter your name' required  /><br><br>");
                pw.println(" <b>Rno :<b/> <input type='text' readonly value='" + rs.getInt("rno") + "'  name='rno' placeholder='Enter your rno' required  /><br><br>");
                pw.println("<b>Percent :<b/> <input type='text' value='" + rs.getFloat("per") + "' name='per' placeholder='Enter your percent' required  /><br><br>");
                pw.println("<b>City :<b/> <input type='text' value='" + rs.getString("city") + "' name='city' placeholder='Enter your city' required  /><br><br>");
                pw.println("<input type='submit' value='Update Student' />");
                pw.println("</form>");
            } else {
                pw.println("<h1>not exixt this rno student</h1>");
            }
            
            pw.println("<hr>");
            pw.println("<a href='index.html'>Home</a>");
            pw.println("<a href='updateStudent.jsp'>Update Student</a>");
            pw.println("</body>");
            pw.println("</html>");
            
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
