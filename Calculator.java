public class Calculator
{
    static int powerInt(int num1, int num2)
    {
        return (int) Math.pow(num1,num2);
    }
    static double powerDouble(double num1, int num2)
    {
        return Math.pow(num1,num2);
    }
}
class CalculatorMain
{
    public static void main(String[] args)
    {
        System.out.println(Calculator.powerInt(7,2));
        System.out.println(Calculator.powerDouble(14.5,4));
    }
}
