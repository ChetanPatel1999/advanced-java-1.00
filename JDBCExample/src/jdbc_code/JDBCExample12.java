package jdbc_code;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class JDBCExample12 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/collage";
        String user = "root";
        String pass = "root123";
        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            String sql = "select * from student";
            ResultSet rs = st.executeQuery(sql);
            System.out.println("rno  name    per   city");
            while (rs.next()) {
                System.out.print(rs.getInt("rno") + "  ");
                System.out.print(rs.getString("name") + "  ");
                System.out.print(rs.getFloat("per") + "  ");
                System.out.println(rs.getString("city") + "  ");
            }

            rs.beforeFirst();  // its set cursor at begining of resultset

            System.out.println("<=================================>");
            System.out.println("rno  name    per   city");
            while (rs.next()) {
                System.out.print(rs.getInt("rno") + "  ");
                System.out.print(rs.getString("name") + "  ");
                System.out.print(rs.getFloat("per") + "  ");
                System.out.println(rs.getString("city") + "  ");
                if (rs.getInt("rno") == 104) {
                    break;
                }
            }
            con.close();

        } catch (SQLException E) {
            E.printStackTrace();
        }
    }
}
