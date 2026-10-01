package jdbc_code;

import java.sql.*;
import java.util.Scanner;

public class JDBCExample4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/collage";
        String user = "root";
        String pass = "root123";
        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmnt = con.createStatement();
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
            String sql = "insert into student values(" + rno + ",'" + name + "'," + per + ",'" + city + "')";
            int row = stmnt.executeUpdate(sql);
            System.out.println(row + " row addedd succefully");
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
