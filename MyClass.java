class FinalDemo
{
    int num1;
    int num2;
    FinalDemo()
    {
        num1 = 50_000;
        num2 = 1_45_000;                // Underscores are ignored while compilation
    }
    public void show()
    {
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
public class MyClass
{
    public static void main(String[] args)
    {
        FinalDemo obj = new FinalDemo();
        obj.num1 = 78;
        obj.num2 = 79;
        obj.show();
        FinalDemo obj2 = obj;
        obj2.show();

    }
}