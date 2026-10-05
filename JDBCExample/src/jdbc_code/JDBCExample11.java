package jdbc_code;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class JDBCExample11 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/collage";
        String user = "root";
        String pass = "root123";
        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "select * from student";
            ResultSet rs = st.executeQuery(sql);
            rs.next(); //move to first 1row
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getFloat(3) + " ");
            System.out.println(rs.getString(4) + " ");

            rs.next();
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getFloat(3) + " ");
            System.out.println(rs.getString(4) + " ");

            rs.next();
            System.out.print(rs.getInt("rno") + " ");
            System.out.print(rs.getString("name") + " ");
            System.out.print(rs.getFloat("per") + " ");
            System.out.println(rs.getString("city") + " ");

//          rs.first(); // its set cursor at first position
            rs.previous(); // its move cursor at previus position
            System.out.print(rs.getInt("rno") + " ");
            System.out.print(rs.getString("name") + " ");
            System.out.print(rs.getFloat("per") + " ");
            System.out.println(rs.getString("city") + " ");
            con.close();

        } catch (SQLException E) {
            E.printStackTrace();
        }
    }
}
