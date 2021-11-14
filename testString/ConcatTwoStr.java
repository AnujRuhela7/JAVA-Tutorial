package testString;

import java.util.Scanner;

public class ConcatTwoStr
{
    String str1,str2, sArr1[], sArr2[], str3;
    int l1, l2;
    Scanner sc = new Scanner(System.in);
    ConcatTwoStr()
    {
        System.out.print("1st String : ");
        str1 = sc.nextLine();
        System.out.print("2nd String : ");
        str2 = sc.nextLine();
        str3 = "";
    }
    public void join()
    {
        sArr1 = str1.split("");
        sArr2 = str2.split("");
        l1 = sArr1.length;
        l2 = sArr2.length;
        if (l1 <= l2)
        {
            for (int i = 0; i < l1; i++)
            {
                str3 += sArr1[i] + sArr2[i];
            }
            for (int i = l1 ; i < sArr2.length; i++)
            {
                str3 += sArr2[i];
            }
        }
        else if (l1 > l2)
        {
            for (int i = 0; i < l2; i++)
            {
                str3 += sArr1[i] + sArr2[i];
            }
            for (int i = l2 ; i < sArr1.length; i++)
            {
                str3 += sArr1[i];
            }
        }
        System.out.println(str3);
    }
}
class ConcatMain
{
    public static void main(String[] args)
    {
        ConcatTwoStr obj = new ConcatTwoStr();
        obj.join();
    }
}
