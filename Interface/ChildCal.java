package Interface;

import Abstraction.ABSTRACTCLASS.*;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class ChildCal extends Class2  {
    int r;

    public void printinfo() {
        System.out.println("ENTER YOUR CHOICE ");
        System.out.println("1.ADDITION");
        System.out.println("2.SUBSTRACTION");
        System.out.println("3.MULTIPLY");
        System.out.println("4.DIVIDE");
        System.out.println("5.REMENDER");
        System.out.println("ENTER THE YOUR CHOICE");
        Scanner obj = new Scanner(System.in);
        r = obj.nextInt();
        System.out.println("enter the value of a");
        int a=obj.nextInt();
        System.out.println("enter the value of b");
        int b=obj.nextInt();
        switch (r) {
            case 1:
                add(a,b);
            case 2:
                sub(a,b);
                break;
            case 3:
                mul(a,b);
                break;
            case 4:
                div(a,b);
                break;
            case 5:
                rem(a,b);
                break;
            default:
                System.out.println("invalid number");
                break;
        }
    }

    public static void main(String[] args) {
        ChildCal c1=new ChildCal();
        c1.printinfo();
    }
}
