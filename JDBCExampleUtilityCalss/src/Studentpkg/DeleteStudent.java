package Studentpkg;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteStudent {

    public static void main(String[] args) {
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            String sql = "delete from student where rno=104";
            int row = st.executeUpdate(sql);
            System.out.println(row + " row delete succefully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
