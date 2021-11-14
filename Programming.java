import java.util.Scanner;

public class Programming
{
    Programming()
    {
        System.out.println("I Love Programming Languages.");
    }
    Programming(String str)
    {
        System.out.println("I Love " + str);
    }
}
class ProgrammingMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Programming obj1 = new Programming();
        Programming obj2 = new Programming("my Mom & Dad!");
        System.out.println("What you love ? ");
        Programming obj3 = new Programming(sc.nextLine());
    }
}
