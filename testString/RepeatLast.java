package testString;

import java.util.Scanner;

public class RepeatLast
{
    String str, arr[];
    int n;
    Scanner sc = new Scanner(System.in);
    RepeatLast()
    {
        System.out.print("String : ");
        str = sc.nextLine();
        System.out.print("Number of repeating characters : ");
        n = sc.nextInt();
    }
    public void repeat()
    {

        arr = str.split("");
        for (int i = 0; i < n; i++)
        {
            for (int j = arr.length - n; j < arr.length; j++)
            {
                System.out.print(arr[j]);
            }
        }
    }
}
class RepeatMain
{
    public static void main(String[] args)
    {
        RepeatLast obj = new RepeatLast();
        obj.repeat();
    }
}