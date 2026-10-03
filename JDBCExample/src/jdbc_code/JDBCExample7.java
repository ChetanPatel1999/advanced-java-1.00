package JDBCExample7;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class JDBCExample7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String url = "jdbc:mysql://localhost:3306/collage";
            String user = "root";
            String pass = "root123";
            Connection con = DriverManager.getConnection(url, user, pass);
            int rno;
            String name;
            float per;
            String city;
            System.out.println("Enter student info :");
            System.out.print("Enter rno : ");
            rno = sc.nextInt();
            System.out.print("Enter name : ");
            name = sc.next();
            System.out.print("Enter per : ");
            per = sc.nextFloat();
            System.out.print("Enter city : ");
            city = sc.next();
            String sql = "insert into student values(?,? ,?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, rno);
            pst.setString(2, name);
            pst.setFloat(3, per);
            pst.setString(4, city);
            int row = pst.executeUpdate();
            System.out.println(row + " row data insert succefully");
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
