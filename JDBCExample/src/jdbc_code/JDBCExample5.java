package jdbc_code;

import java.sql.*;
import java.util.Scanner;

public class JDBCExample5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/collage";
        String user = "root";
        String pass = "root123";
        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmnt = con.createStatement();
            int rno;
            System.out.println("student Update : ");
            System.out.print("Enter rno : ");
            rno = sc.nextInt();

            String field;
            System.out.print("Enter field name which you want update (name,per,city) : ");
            field = sc.next();

            String name;
            float per;
            String city;
            String sql = null;

            if (field.equals("name")) {
                System.out.print("Enter name : ");
                name = sc.next();
                sql = "update student set " + field + " = '" + name + "' where rno=" + rno;
            }

            if (field.equals("per")) {
                System.out.print("Enter per : ");
                per = sc.nextFloat();
                sql = "update student set " + field + " = " + per + " where rno=" + rno;
            }

            if (field.equals("city")) {
                System.out.print("Enter city : ");
                city = sc.next();
                sql = "update student set " + field + " = '" + city + "' where rno=" + rno;
            }
            int row = stmnt.executeUpdate(sql);
            System.out.println(row + " row update succefully");
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
