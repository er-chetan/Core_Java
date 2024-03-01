import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class sumMUL {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number of terms");
        int x= obj.nextInt();
        int s=0;
        int m=1;

        for(int i=1;i<=x;i++){
            System.out.println(i);
            s=s+i;
            m=m*i;
        }
        System.out.println("sum of n numbers");
        System.out.println(s);
        System.out.println("multiplication of n numbers");
        System.out.println(m);
    }

}
