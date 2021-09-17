import java.util.Scanner;

public class ArrayDemo
{
    int eID;
    String eName;
    String gender;
    Scanner sc = new Scanner(System.in);
    ArrayDemo()
    {
        System.out.print("Employee ID : ");
        eID = sc.nextInt();
        sc.nextLine();
        System.out.print("Employee Name : ");
        eName = sc.nextLine();
        System.out.print("Gender : ");
        gender = sc.next();
    }
    void show()
    {
        System.out.println("Employee ID : " + eID);
        System.out.println("Name : " + eName);
        System.out.println("Gender : " + gender);
    }
}
class ArrayMain
{
    public static void main(String[] args)
    {
        ArrayDemo arr[] = new ArrayDemo[3];
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Employee " + (i+1) + " Details :");
            arr[i] = new ArrayDemo();
        }
        for (int i = 0; i < arr.length ; i++)
        {
            arr[i].show();
        }
    }
}