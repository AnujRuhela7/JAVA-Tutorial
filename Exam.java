public class Exam
{
    final double pi;
    public Exam()
    {
        pi = 3.14;
    }
    public Exam (double pi)
    {
        this.pi = pi;
    }
    public static void main(String[] args)
    {
        Exam obj = new Exam(22/7);
        System.out.println(obj.pi);
    }
}
