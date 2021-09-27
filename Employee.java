public class Employee
{
Scanner sc = new Scanner(System.in);
pnublic int Eid;
public int ESal;
public String EName;
public String CName;
Employee ()
{
System.out.println("Name : ");
EName = sc.nextLine();
System.out.println("Company Name : ");
CName = sc.nextLine();
System.out.println("Employee ID : ");
Eid = sc.nextint();
System.out.println("Employee Salary: ");
ESal = sc.nextint();
}
}
class EmployeeMain
{
public int n;
public static void main(String[] args)
{
System.out.println("Number of Objects :");
n = sc.nextInt();
Employee arr[] = new Employee [n];
for(int i = 0; i < n; i++)
{
arr[i] = new Employee();
}
}
