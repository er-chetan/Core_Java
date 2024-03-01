package Interface;

import java.util.Scanner;

public class Class2 implements Addition,Substraction,Multiplication,Divide,Reminder {

    int c;
    @Override
    public void add(int a, int b) {
        c=a+b;
        System.out.println("addition of two number"+" "+c);
    }

    @Override
    public void div(int a, int b) {
        c=a/b;
        System.out.println("division of two number"+" "+c);
    }

    @Override
    public void mul(int a, int b) {
        c=a*b;
        System.out.println("multiplication of two number"+" "+c);
    }

    @Override
    public void rem(int a, int b) {
        c=a%b;
        System.out.println("remainder of two number"+" "+c);
    }

    @Override
    public void sub(int a, int b) {
        c=a-b;
        System.out.println("substraction of two number"+" "+c);
    }
}

