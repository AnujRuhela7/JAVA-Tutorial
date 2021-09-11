package Basic;
import java.util.Scanner;

public class EmpDetails
{
    private int eid;
    private String ename;

    public int getEid() {
        return eid;
    }


    public void setEid(int eid){
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
}

class EmployeeMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmpDetails e1 = new EmpDetails();
        e1.setEid(sc.nextInt());
        e1.setEname(sc.nextLine());
        System.out.println(e1.getEid());
        System.out.println(e1.getEname());
    }
}