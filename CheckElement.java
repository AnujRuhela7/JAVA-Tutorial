import java.util.Scanner;

public class CheckElement
{
    int[] arr;
    int len,s_num;
    Scanner sc = new Scanner(System.in);
    CheckElement()
    {
        System.out.println("Enter size of array");
        len = sc.nextInt();
        arr = new int[len];
    }
    public void getArray()
    {
        System.out.println("Enter Array Elements");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    public void gets_num()
    {
        System.out.println("Enter Search Element : ");
        s_num = sc.nextInt();
    }
    public void sElement()
    {
        int flag = 0,count = 0;
        for (int j : arr)
        {
            if (j == s_num)
            {
                flag = 1;
                System.out.println(count+1);
                System.exit(0);
            }
            else
            {
                flag = 0;
            }
            count++;
        }
        if (flag == 0)
            System.out.println(-1);
    }
}
class CheckElementMain
{
    public static void main(String[] args)
    {
        CheckElement obj = new CheckElement();
        obj.getArray();
        obj.gets_num();
        obj.sElement();
    }
}