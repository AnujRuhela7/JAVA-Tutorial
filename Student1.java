import java.util.Scanner;

public class Student1
{
    String name;
    Scanner sc = new Scanner(System.in);
    Student1()
    {
        name  =  sc.nextLine();
    }
    public void show()
    {
        System.out.println(name);
    }
}
