import student.Student;
public class StudentMain extends Student
{
    public static void main(String[] args)
    {
//        Student s1 = new Student();
//        Student s2 = new Student("Gaurav Sahariya",21);
//        s1.printValue();
//        System.out.println();
//        s2.printValue();printValue
        /* when we inherit or import any class, then for accessing the attributes, methods we need to create the
        object of child class */
    StudentMain obj1 = new StudentMain();
        System.out.println(obj1.name);
    }


}
