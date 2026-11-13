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
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.PrintWriter;

@WebServlet("/addStudent")
public class AddStudent extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("uname");
        int rno = Integer.parseInt(request.getParameter("rno"));
        float per = Float.parseFloat(request.getParameter("per"));
        String city = request.getParameter("city");
        System.out.println(name + rno + per + city);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/collage?useSSL=false";
            String user = "root";
            String pass = "root123";
            Connection con = DriverManager.getConnection(url, user, pass);
            String sql = "insert into student values (?,?,?,?) ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, rno);
            ps.setFloat(3, per);
            ps.setString(4, city);
            PrintWriter rsp = response.getWriter();
            rsp.println("<html>");
            rsp.println("<body>");
            rsp.println("<h1>Student added successfully</h1>");
            rsp.println("<hr>");
            rsp.println("<a href='form.jsp'>add more student</a>");
            rsp.println("</body>");
            rsp.println("</html>");
            int row = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
