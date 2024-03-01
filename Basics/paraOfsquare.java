import java.util.Scanner;

public class paraOfsquare {
    public static void main(String[] args){
        Scanner obj1=new Scanner(System.in);
        System.out.println("enter the length=");
        int a= obj1.nextInt();
        int pos=4*a*a;
        System.out.println("parameter of square"+"="+pos);

        Scanner obj2=new Scanner(System.in);
        System.out.println("enter the length");
        int l=obj2.nextInt();

        Scanner obj3=new Scanner(System.in);
        System.out.println("enter the breadth");
        int b=obj3.nextInt();

        int por=2*(l+b);
        System.out.println("parameter of rectangle"+"="+por);

        Scanner obj4=new Scanner(System.in);
        System.out.println("enter the radius");
        int r=obj4.nextInt();

        double pie=3.13;
        double poc=2*pie*r;
        System.out.println("parameter of circle"+"="+poc);


    }
}
