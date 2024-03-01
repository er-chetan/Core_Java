package Inheritance.example;

import java.util.Scanner;

public class C  extends B{
    int c;
    public C(int a,int b,int c){
        super(b,a);
        this.c=c;
    }
    public void printdetail_3(){
        System.out.println(c);
        System.out.println(super.b);
        super.printdetail_2();
    }

    public static void main(String[] args) {
        C obj=new C(1,2,3);

        obj.printdetail_3();
    }
}
