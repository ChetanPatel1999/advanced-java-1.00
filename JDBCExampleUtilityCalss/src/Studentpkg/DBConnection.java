package Studentpkg;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class DBConnection {

    private static final String url = "jdbc:mysql://localhost:3306/collage";
    private static final String userName = "root";
    private static final String password = "root123";

    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

}
// DBconnection.getConnection()
