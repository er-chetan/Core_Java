package Polymorphism.Overloading;

import java.util.Scanner;

public class Calculator extends MIx  {
    int r;
    int n;
    int a,b;
    float c,d;
    double e,f;
    long x,y;
    Scanner obj=new Scanner(System.in);
    MIx m1=new MIx();

    public void calinfo(){
        System.out.println("1.ADDITON");
        System.out.println("2.SUBSTRACTION");
        System.out.println("3.MULTIPLICATION");
        System.out.println("4.DIVISION");
        System.out.println("5.REMINDER");
        System.out.println("ENTER YOUR CHOICE");

         n= obj.nextInt();
         switch (n){
             case 1:
                  numchoice("sum");
                  break;
             case 2:
                  numchoice("sub");
                 break;
             case 3:
                  numchoice("mul");
                 break;
             case  4:
                  numchoice("div");
                 break;
             case 5:
                 numchoice("rem");
                 break;

         }

    }
    public void numchoice(String keyword){
        System.out.println("1."+keyword+" WITH TWO INTEGERS");
        System.out.println("2."+keyword+"WITH TWO FLOAT");
        System.out.println("3."+keyword+" WITH TWO DOUBLE");
        System.out.println("4."+keyword+" WITH TWO LONG");
        System.out.println("ENTER YOUR CHOICE");
        r=obj.nextInt();
    }
    public void choice(){


        switch (n){
            case 1:
               if(r==1){
                   inttake();
                   m1.add(a,b);
               }else if(r==2){
                    floatake();
                   m1.add(c,d);
               }else if(r==3){
                   doubletake();
                   m1.add(e,f);
               }else if(r==4){
                    longtake();
                   m1.add(x,y);
               }
               break;
            case 2:
                if(r==1){
                    inttake();
                    m1.sub(a,b);
                }else if(r==2){
                    floatake();
                    m1.sub(c,d);
                }else if(r==3){
                    doubletake();
                    m1.sub(e,f);
                }else if(r==4){
                     longtake();
                     m1.sub(x,y);
                }
                break;
            case 3:
                if(r==1){
                    inttake();
                    m1.mul(a,b);
                }else if(r==2){
                    floatake();
                    m1.mul(c,d);
                }else if(r==3){
                    doubletake();
                    m1.mul(e,f);;
                }else if(r==4){
                    longtake();
                    m1.mul(x,y);
                }
                break;
            case 4:
                if(r==1){
                    inttake();
                    m1.div(a,b);
                }else if(r==2){
                    floatake();
                    m1.div(c,d);
                }else if(r==3){
                    doubletake();
                    m1.div(e,f);
                }else if(r==4){
                    longtake();
                    m1.div(x,y);
                }
                break;
            case 5:
                if(r==1){
                    inttake();
                    m1.rem(a,b);
                }else if(r==2){
                    floatake();
                    m1.rem(c,d);
                }else if(r==3){
                    doubletake();
                    m1.rem(e,f);
                }else if(r==4){
                    longtake();
                    m1.rem(x,y);
                }
                break;
        }
    }
    public void inttake(){
        System.out.println("ENTER THE VALUE OF A");
         int a=obj.nextInt();
        System.out.println("ENTER THE VALUE OF B");
         int b=obj.nextInt();

    }
    public void doubletake(){
        System.out.println("ENTER THE VALUE OF A");
         e=obj.nextDouble();
        System.out.println("ENTER THE VALUE OF B");
         f=obj.nextDouble();
    }
    public void floatake(){
        System.out.println("ENTER THE VALUE OF A");
         c=obj.nextFloat();
        System.out.println("ENTER THE VALUE OF B");
         d=obj.nextFloat();
    }
    public void longtake(){
        System.out.println("ENTER THE VALUE OF A");
        x=obj.nextLong();
        System.out.println("ENTER THE VALUE OF B");
        y=obj.nextLong();
    }

    public static void main(String[] args) {
        Calculator c1=new Calculator();
        c1.calinfo();
        c1.choice();
    }


}
