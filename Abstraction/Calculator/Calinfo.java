package Abstraction.Calculator;

import java.util.Scanner;

public class Calinfo extends Calculator{
    int c;
    @Override
    public int calculation(int a, int b) {
        Scanner obj=new Scanner(System.in);
        int r=obj.nextInt();
         switch (r){
             case 1:
                 c=a+b;
                 break;
             case 2:
                  c=a-b;
                 break;
             case 3:
                  c=a*b;
                 break;
             case 4:
                  c=a/b;
                 break;
             case 5:
                  c=a%b;
                 break;
             default:
                 System.out.println("invalid number");
                 break;
         }
         return c;

    }

}
