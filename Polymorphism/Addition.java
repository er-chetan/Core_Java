package Polymorphism;

import Inheritance.example.A;

public class Addition {
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public float add(float a,float b){
         return a+b;
    }
    public double add(float a,double b){
         return a+b;
    }
    public  double add(double a, double b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Addition aone =new Addition();
        double d=aone.add(4.5f,7.5);
        System.out.println(d);
    }

}
