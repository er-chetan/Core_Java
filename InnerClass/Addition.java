package InnerClass;

import Inheritance.example.A;

public class Addition {
    int a;
    int b;
    public  void sum(){
        System.out.println(a+b);
    }
    class Substraction{
        int c,d;
        public void sub(){
            System.out.println(c-d);
        }
    }//substraction

    public static void main(String[] args) {
        Addition a1=new Addition();
        a1.a=10;
        a1.b=12;
        a1.sum();
        Addition.Substraction s1=a1.new Substraction();
        s1.c=5;
        s1.d=10;
        s1.sub();
        System.out.println(s1.c+s1.d);
    }
}//addtion

