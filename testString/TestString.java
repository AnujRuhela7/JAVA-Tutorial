package testString;

public class TestString
{
    public static void main(String[] args)
    {
        String str = "Anuj";
        String str2 = "deepanshi";
        String str3 = new String("Anuj");
        String str4 = new String("Deepanshi");
        System.out.println("str.equals(str2) : " + str.equals(str2));
        if (str == str2)
            System.out.println("str == str2 : True");
        else
            System.out.println("str == str2 : False");
        System.out.println("str3.equals(str4) : " + str3.equals(str4));
        if (str3 == str4)
            System.out.println("str3 == str4 : True");
        else
            System.out.println("str3 == str4 : False");
        System.out.println(str.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
    }
}
