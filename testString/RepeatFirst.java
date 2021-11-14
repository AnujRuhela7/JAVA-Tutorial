package testString;

import java.util.Scanner;

public class RepeatFirst
{
    String str, fArr[];
    int len;
    Scanner sc = new Scanner(System.in);
    RepeatFirst()
    {
        System.out.print("String : ");
        str = sc.nextLine();
        len = str.length();
        fArr = str.split("");
    }
    public void repeatFirst()
    {
        for (int i = 0; i < len; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                System.out.print(fArr[j]);
            }
        }
    }
}
class RepeatFirstMain
{
    public static void main(String[] args)
    {
        RepeatFirst obj = new RepeatFirst();
        obj.repeatFirst();
    }
}