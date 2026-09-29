package jdbc_code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample1 {

    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/collage";
            String userName = "root";
            String pass = "root123";
            Connection con = DriverManager.getConnection(url, userName, pass);
            System.out.println("java application connect database succefully");

        } catch (SQLException e) {
            System.out.println("some error find");
            e.printStackTrace();
        }
    }

}
