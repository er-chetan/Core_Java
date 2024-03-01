package STATIC;

public class Additon {
    int a;
    int b;
    public  void sum(){
        System.out.println(a+b);
    }
    static class substarction{
        int c=34;
        int d=56;
        public void sub(){
            System.out.println(c-d);
        }
    }

    public static void main(String[] args) {
        Additon.substarction a1=new Additon.substarction();
        a1.c=10;
        a1.d=12;
        a1.sub();
        Additon s=new Additon();
        s.a=12;
        s.b=114;
        s.sum();
    }
}
