import java.util.Scanner;

public class CircleSphere {
    public static void main(String[] args){
        System.out.println("enter the radius");
        Scanner obj=new Scanner(System.in);
        int r=obj.nextInt();
        double pie=3.13;

        if (r>0){
            System.out.println("it is positive number");
            double c=pie*r*r;
            System.out.println("area of circle"+"="+c);
        }else{
            System.out.println("it is negative number");
            double s=4*pie*r*r/3;
            System.out.println("volume of sphere"+"="+s);

        }

    }
}
