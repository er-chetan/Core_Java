package Abstraction.Calculator;

public class class2 extends Calinfo{
    public void printinfo(){
        System.out.println("ENTER YOUR CHOICE ");
        System.out.println("1.ADDITION");
        System.out.println("2.SUBSTRACTION");
        System.out.println("3.MULTIPLY");
        System.out.println("4.DIVIDE");
        System.out.println("5.REMENDER");
        System.out.println("ENTER THE YOUR CHOICE");
    }
    public static void main(String[] args) {
        class2 c1=new class2();
        c1.printinfo();
        int d= c1.calculation(8,4);
        System.out.println(d);
    }
}
