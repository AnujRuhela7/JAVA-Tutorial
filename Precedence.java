// 9 September 2021
/* Q5. Design a program in java that identifies answer to the following questions: (a) What is called first during an object creation, a static block or a constructor?
(b) How many times each (a constructor and a static block) is executed? */
public class Precedence
{
    static int count;
    int num1;
    int num2;
    Precedence()
    {
        num1 = 10;
        num2 = 20;
        System.out.println("Precedence Class Non-Parameterized Constructor is invoked.");
    }
    Precedence(int a,int b)
    {
        num1 = a;
        num2 = b;
        System.out.println("Precedence Class Parameterized Constructor is invoked.");
    }
    static
    {
        System.out.println("Static Block is executed.");

    }
    {
        count++;
        System.out.println("Instance Block is executed");
    }
}
class PrecedenceMain
{
    public static void main(String[] args)
    {
        Precedence obj1 = new Precedence();
        Precedence obj2 = new Precedence(30,40);
        System.out.println("Total Number of objects created = " + Precedence.count);
        System.out.println("Constructor is called " + Precedence.count + " times.");
    }
}
