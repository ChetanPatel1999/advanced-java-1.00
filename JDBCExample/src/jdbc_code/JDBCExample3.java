package jdbc_code;

import java.sql.*;

public class JDBCExample3 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/collage";
        String user = "root";
        String pass = "root123";
        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmnt = con.createStatement();
            String sql = "delete from student where rno in (102,103)";
            int row = stmnt.executeUpdate(sql);
            System.out.println(row + " row data delete succefully");
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
