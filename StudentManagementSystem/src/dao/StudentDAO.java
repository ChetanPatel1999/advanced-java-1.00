package dao;

import Model.Student;
import com.mysql.cj.jdbc.PreparedStatementWrapper;
import util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

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
    public void updateStudent(Student s) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "update student set name = ?,course= ? , fees=? where rno = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, s.name);
            pst.setString(2, s.course);
            pst.setFloat(3, s.fees);
            pst.setInt(4, s.rno);
            int row = pst.executeUpdate();
            if (row > 0) {
                System.out.println("\nstudent update succesfully !\n");
            } else {
                System.out.println("\nstudent not found !\n");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //serach student 
    public void searchStudent(int rno) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "select * from student where rno = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, rno);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                System.out.println("\n<=== student details ===>");
                System.out.println("rno : " + rs.getInt("rno"));
                System.out.println("name : " + rs.getString("name"));
                System.out.println("course : " + rs.getString("course"));
                System.out.println("fees : " + rs.getInt("fees"));
                System.out.println("<------------------------------->\n");
            } else {
                System.out.println("\nstudent not found!\n");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //delete student
    public void deleteStudent(int rno) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "delete from student where rno= ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, rno);
            int row = pst.executeUpdate();
            if (row > 0) {
                System.out.println("\nstudent " + rno + " delete succefully! \n");
            } else {
                System.out.println("\nstudent not found\n");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //display student 
    public void displayStudent() {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "select * from student";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            System.out.println("\n<======= student details ======= >");
            System.out.println(" rno    name    course    fees");
            System.out.println("<------------------------------->");
            while (rs.next()) {
                System.out.print(rs.getInt("rno") + "  ");
                System.out.print(rs.getString("name") + "   ");
                System.out.print(rs.getString("course") + "    ");
                System.out.println(rs.getInt("fees") + "  ");
                System.out.println("<------------------------------->");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
