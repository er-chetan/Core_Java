package Polymorphism.Overloading;

public class MIx implements Addtion,Substraction,Multiplication,Division,Remainder{
    @Override
    public void add(int a, int b) {
        System.out.println("sum is "+(a+b));
    }

    @Override
    public void add(float a, float b) {
        System.out.println("sum is "+(a+b));
    }

    @Override
    public void add(double a, double b) {
        System.out.println("sum is "+(a+b));
    }

    @Override
    public void add(long a, long b) {
        System.out.println("sum is "+(a+b));
    }

    @Override
    public void div(int a, int b) {
        System.out.println("Division of two number"+(a/b));
    }

    @Override
    public void div(float a, float b) {
        System.out.println("Division of two number"+(a/b));
    }

    @Override
    public void div(double a, double b) {
        System.out.println("Division of two number"+(a/b));
    }

    @Override
    public void div(long a, long b) {
        System.out.println("Division of two number"+(a/b));
    }

    @Override
    public void mul(int a, int b) {
        System.out.println("multiplication of two number+"+(a*b));
    }

    @Override
    public void mul(float a, float b) {
        System.out.println("multiplication of two number+"+(a*b));
    }

    @Override
    public void mul(double a, double b) {
        System.out.println("multiplication of two number+"+(a*b));
    }

    @Override
    public void mul(long a, long b) {
        System.out.println("multiplication of two number+"+(a*b));
    }

    @Override
    public void rem(int a, int b) {
        System.out.println("Remainder is "+(a/b));
    }

    @Override
    public void rem(float a, float b) {
        System.out.println("Remainder is "+(a/b));
    }

    @Override
    public void rem(double a, double b) {
        System.out.println("Remainder is "+(a/b));
    }

    @Override
    public void rem(long a, long b) {
        System.out.println("Remainder is "+(a/b));
    }

    @Override
    public void sub(int a, int b) {
        System.out.println("Substraction of two number is"+(a-b));
    }

    @Override
    public void sub(float a, float b) {
        System.out.println("Substraction of two number is"+(a-b));
    }

    @Override
    public void sub(double a, double b) {
        System.out.println("Substraction of two number is"+(a-b));
    }

    @Override
    public void sub(long a, long b) {
        System.out.println("Substraction of two number is"+(a-b));
    }
}
