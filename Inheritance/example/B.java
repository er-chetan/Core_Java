package Inheritance.example;

public class B extends A {
    int b;
    public B(int b,int a){
        super(a);
         this.b=b;
    }
    public void printdetail_2(){
        System.out.println(b);
        System.out.println(super.a);
        super.printdetail_1();
    }
}
