package LocalinnerClass;

import Inheritance.example.A;
import STATIC.Additon;

public class Aditon {
    int a;
    int b;
    public void sum(){
        System.out.println(a+b);
        class Substraction {
            int c;
            int d;
            public void sub(){
                System.out.println(c-d);
            }
        }
        Substraction s=new Substraction();
        s.c=12;
        s.d=15;
        s.sub();
    }

    public static void main(String[] args) {
        Aditon e=new Aditon();
        e.a=10;
        e.b=12;
        e.sum();
    }

}

