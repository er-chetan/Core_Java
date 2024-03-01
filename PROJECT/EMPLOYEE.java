package PROJECT;

import java.util.Scanner;

public class EMPLOYEE {
     String name;
     double  salary;
     int num;
    public void EntryInfo(){
        Scanner obj=new Scanner(System.in);
        System.out.println("########## HOW MANY EMPLOYYE INFORMATION YOU WANT TO ENTER #########");
        num= obj.nextInt();
        for(int i=1;i<num+1;i++){
            System.out.println("enter the name of "+i+" "+"employee");
             name =obj.next();
            System.out.println("enter the salary of "+i+" "+"employee");
             salary= obj.nextDouble();
            System.out.println("Enter The PF percentage");
            int b= obj.nextInt();
            System.out.println("EMPLOYEE PF");
            double pf=(salary*b)/100;
            System.out.println("PF of employee"+" "+ pf);
            System.out.println("salary without PF");
            double sl=salary-pf;
            System.out.println(sl);
        }
    }

    public static void main(String[] args) {
        EMPLOYEE e1=new EMPLOYEE();
        e1.EntryInfo();
    }

}
