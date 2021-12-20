import java.util.Scanner;

public class Wrapper
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Given No. = " + args[0]);
        System.out.println("Binary Equivalent = " + Integer.toBinaryString(Integer.parseInt(args[0])));
        System.out.println("Octal Equivalent = " + Integer.toOctalString(Integer.parseInt(args[0])));
        System.out.println("Hexadecimal Equivalent = " + Integer.toHexString(Integer.parseInt(args[0])));

    }
}
