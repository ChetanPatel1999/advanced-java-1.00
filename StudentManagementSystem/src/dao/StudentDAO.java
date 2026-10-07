package dao;

import Model.Student;
import util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;

public class StudentDAO {
//insert data 

    public void insertStudent(Student s) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "insert into student values(?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, s.rno);
            pst.setString(2, s.name);
            pst.setString(3, s.course);
            pst.setFloat(4, s.fees);
            int row = pst.executeUpdate();
            if (row > 0) {
                System.out.println("\nstudent insert succesfully !\n");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    //update student 
    
}
