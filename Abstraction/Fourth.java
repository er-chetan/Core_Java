package Abstraction;

public class Fourth extends First{

    @Override
    public int calculator(int a, int b) {
        return a/b;
    }

    public static void main(String[] args) {
         Second s1=new Second();
         int e= s1.calculator(8,4);
         System.out.println(e);
         Third t1=new Third();
         int d= t1.calculator(8,4);
         System.out.println(d);
         t1.remender(8,4);
         Fourth f1=new Fourth();
         int f= f1.calculator(8,4);
         System.out.println(f);
         f1.substraction(8,4);
    }
}
