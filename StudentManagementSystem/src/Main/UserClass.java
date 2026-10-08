package Main;

import Model.Student;
import dao.StudentDAO;
import java.util.Scanner;

public class UserClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO(); // 
        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Student");
            System.out.println("2. Update Student");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Display All Students");
            System.out.println("0. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt(); //1

            switch (choice) {
                case 1:
                    System.out.println("<--- insert student details --->");
                    System.out.print("Enter Rno: ");
                    int rno = sc.nextInt();
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Course: ");
                    String course = sc.next();
                    System.out.print("Enter Fees: ");
                    Float fees = sc.nextFloat();
                    Student s = new Student(rno, name, course, fees);
                    dao.insertStudent(s);
                    break;
                case 2:
                    System.out.println("<--- Update student details --->");
                    System.out.print("Enter Rno: ");
                    rno = sc.nextInt();
                    System.out.print("Enter Name: ");
                    name = sc.next();
                    System.out.print("Enter Course: ");
                    course = sc.next();
                    System.out.print("Enter Fees: ");
                    fees = sc.nextFloat();
                    s = new Student(rno, name, course, fees);
                    dao.updateStudent(s);
                    break;
                case 3:
                    System.out.println("<--- Search student  --->");
                    System.out.print("Enter Rno: ");
                    rno = sc.nextInt();
                    dao.searchStudent(rno);
                    break;
                case 4:
                    System.out.println("<--- Delete student  --->");
                    System.out.print("Enter Rno: ");
                    rno = sc.nextInt();
                    dao.deleteStudent(rno);
                    break;

                case 5:
                    dao.displayStudent();
                    break;
                case 0:
                    System.out.println("\n<--- thanks for using my Student managemenet System --->\n");
                    break;
                default:
                    System.out.println("\nplease enter  right number");
            }

        } while (choice != 0);

    }
}
