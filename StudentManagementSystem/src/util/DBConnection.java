package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnection() {
        Connection con = null;
        try {
            String url = "jdbc:mysql://localhost:3306/student_db";
            String user = "root";
            String password = "root123";
            con = DriverManager.getConnection(
                    url, user, password
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}

