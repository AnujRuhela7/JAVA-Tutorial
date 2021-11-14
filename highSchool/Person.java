package highSchool;

public class Person
{
    static class Student
    {
        String name;
        int age;
    }
    String gender;
    String bloodGroup;
}

class Teacher extends Person
{
    int salary;
    String subject;
}

class CollegeStudent extends Person.Student
{
    int year;
    String branch;
}

class Test
{
    public static void main(String[] args) {

    }
}