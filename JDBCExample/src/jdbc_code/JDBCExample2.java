package jdbc_code;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
//import java.sql.*;
public class JDBCExample2 {

    public static void main(String[] args) throws SQLException {
        try {
            
            String url = "jdbc:mysql://localhost:3306/collage";
            String user = "root";
            String pass = "root123";
            Connection con = DriverManager.getConnection(url, user, pass);
            
            
            Statement stmnt = con.createStatement();
            String sql1 = "insert into student values(101,'ram',56.89,'ujjain')";
            String sql2 = "insert into student values(102,'shyam',78.89,'indore'),(103,'vikas',18.89,'ratlam')";
            String sql3 = "delete from student where rno=101";
            int row = stmnt.executeUpdate(sql3);
            System.out.println(row + " row insert sussefully in student table");
            con.close();
        } catch (SQLException e) {
            System.out.println("some thing wrong");
            e.printStackTrace();
        }
    }

}
