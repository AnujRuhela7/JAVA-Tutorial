package student;
import java.util.Scanner;

public class Student
{
    protected String name;
    private int rollNo;
    public Student()
    {
        name = "Anuj Ruhela";
        rollNo = 14;
    }
    public Student(String nm, int rn)
    {
        name = nm;
        rollNo = rn;
    }
    public void printValue()
    {
        System.out.println("Name : " + name);
        System.out.println("Roll No. : " + rollNo);
    }
}
