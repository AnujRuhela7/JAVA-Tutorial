public class MethodHiding
{
    public static void m1()
    {
        System.out.println("method of super class");
    }
}
class Child extends MethodHiding
{
    public static void m1()
    {
        System.out.println("method of child class");
    }
}
class TestHiding
{
    public static void main(String[] args) {
        Child obj1 = new Child();
        MethodHiding obj2 = new MethodHiding();
        MethodHiding obj3 = new Child();
        
    }
}
