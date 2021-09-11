import java.util.Scanner;

public class Student1
{
    String name;
    float percentage;
    Student1(String nm,int percent)
    {
        name = nm;
        percentage = percent;
    }
}
class Test
{
    public static void main(String[] args)
    {
        Student1 anuj = new Student1("Anuj", 90);
        Student1 anurag = new Student1("Anurag", 81);
        Student1 shivam = new Student1("Shivam", 87);
        if (anuj.percentage> anurag.percentage)
        {
            if(anuj.percentage> shivam.percentage)
                System.out.println("Name : " + anuj.name + " , Percentage : " + anuj.percentage + "%");
            else
                System.out.println("Name : " + shivam.name + " , Percentage : " + shivam.percentage + "%");
        }
        else
        {
            if(anurag.percentage> shivam.percentage)
                System.out.println("Name : " + anurag.name + " , Percentage : " + anurag.percentage + "%");
            else
                System.out.println("Name : " + shivam.name + " , Percentage : " + shivam.percentage + "%");
        }
    }
}
