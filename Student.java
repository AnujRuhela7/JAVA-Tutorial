import java.util.Scanner;

public class Student
{
    String name;
    Student()
    {
        name = "Unknown";
    }
    Student(String nm)
    {
        name = nm;
    }
    public void printName()
    {
        System.out.println("Name : " + name);
    }
}
class StudentMain
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Anuj");
        Student s2 = new Student("Gaurav");
        Student s3 = new Student();
        Student s4 = new Student();
        s1.printName();
        s2.printName();
        s3.printName();
        s4.printName();
    }
}
