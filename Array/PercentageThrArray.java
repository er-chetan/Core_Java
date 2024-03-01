package Array;

import java.util.Scanner;

public class PercentageThrArray {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number of marks");
        int size= obj.nextInt();
        int[] marks= new int[size];
        int s=0;
        double p;
        System.out.println("enter the marks");
        for(int i=0;i<size;i++){
            int element= obj.nextInt();
            marks[i]=element;
        }

        for(int i=0;i<size;i++){
            s=s+marks[i];
        }System.out.println("sum of marks"+" "+s);
        p=(s*100)/(size*100);
        System.out.println(p);

        if(p>90) {
            System.out.println("+A");
        }else if(p<90 && p>=70){
            System.out.println("A");
        }else if(p<70&&p>=50){
            System.out.println("B");
        }else if(p<50&&p>=33){
            System.out.println("C");
        }else if(p<33){
            System.out.println("FAIL");
        }
    }
}