package Inheritance.herrical;

import java.util.Scanner;

public class odd extends Number_operation{
    public void odd_number(){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the numner");
        int number=obj.nextInt();
        if(number%2==0){
            System.out.println("it is even number");
        }else{
            System.out.println("it is odd number");
        }
    }

    public static void main(String[] args) {
        odd o1=new odd();
        o1.odd_number();
        o1.num=454;
        String result=o1.paildrome();
        System.out.println(result);
        o1.Arraysum();
    }
}
