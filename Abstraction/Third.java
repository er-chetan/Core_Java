package Abstraction;

public class Third extends First{

    @Override
    public int calculator(int a, int b) {
        return a*b;
    }
    public void remender(int a,int b){
        System.out.println("remender"+" "+(a%b));
    }
}
