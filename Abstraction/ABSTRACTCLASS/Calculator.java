package Abstraction.ABSTRACTCLASS;

import javax.swing.*;
import java.util.Scanner;

public class Calculator {
    int c;
    public void printinfo(){
        System.out.println("ENTER YOUR CHOICE ");
        System.out.println("1.ADDITION");
        System.out.println("2.SUBSTRACTION");
        System.out.println("3.MULTIPLY");
        System.out.println("4.DIVIDE");
        System.out.println("5.REMENDER");
        System.out.println("ENTER THE YOUR CHOICE");
        Scanner obj=new Scanner(System.in);
        int r=obj.nextInt();
        System.out.println("enter the value of a");
        int a=obj.nextInt();
        System.out.println("enter the value of b");
        int b=obj.nextInt();
        switch (r){
            case 1:
                AdditionChild a1=new AdditionChild();
                c=a1.add(a,b);
                System.out.println(c);
                break;
            case 2:
                 SubstractionChild s1=new SubstractionChild();
                 c=s1.sub(a,b);
                System.out.println(c);
                break;
            case 3:
                MultiplyChild m1=new MultiplyChild();
                c=m1.mul(a,b);
                System.out.println(c);
                break;
            case 4:
                DivideClass d1=new DivideClass();
                c=d1.div(a,b);
                System.out.println(c);
                break;
            case 5:
                 RemenderChild r1=new RemenderChild();
                 c=r1.rem(a,b);
                System.out.println(c);
                break;
            default:
                System.out.println("invalid number");
                break;
        }


    }

    public static void main(String[] args) {
        Calculator c1=new Calculator();
        c1.printinfo();
    }
    }

