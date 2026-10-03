package jdbc_code;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.sql.*;
import java.util.Scanner;

public class JDBCExample9 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/collage";
        String user = "root";
        String pass = "root123";
        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            int rno;
            System.out.println("student Delete : ");
            System.out.print("Enter rno : ");
            rno = sc.nextInt();
            
            String sql = "delete from student where rno = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, rno);
            int row = pst.executeUpdate();
            System.out.println(row + " row delete succefully");
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
