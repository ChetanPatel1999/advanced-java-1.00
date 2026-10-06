package Studentpkg;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStudent {

    public static void main(String[] args) {
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            String sql = "insert into student values(108,'raka',45.89,'banglore')";
            int row = st.executeUpdate(sql);
            System.out.println(row + " row added succefully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
