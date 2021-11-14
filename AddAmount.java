import java.util.Scanner;

public class AddAmount
{
    int amount = 50;
    AddAmount()
    {
    }
    AddAmount(int amount)
    {
        this.amount += amount;
    }
    public void displayAmount()
    {
        System.out.println("Amount in Piggie Bank = " + amount);
    }
}
class AddAmountMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Add Amount : Rs.");
        AddAmount obj = new AddAmount(sc.nextInt());
        obj.displayAmount();
    }
}