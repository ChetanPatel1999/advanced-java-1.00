package studentDetails;

public class Student {

    private String name;
    private int age;

    public void setStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("student info : ");
        System.out.println("name : " + name);
        System.out.println("age : " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudent("ram", 25);
        s1.display();
    }
}
