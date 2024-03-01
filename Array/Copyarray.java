package Array;

import java.util.Scanner;

public class Copyarray {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size= obj.nextInt();
        int[] c = new int[size];
        int[] d = new int[c.length];
        System.out.println("enter the elments in first array");
        for(int i=0;i<size;i++){
            int element= obj.nextInt();
            c[i]=element;
        }

        System.out.println("copy array");
        for (int i = 0; i < d.length; i++){
            d[i]=c[i];
            System.out.print(d[i]+" ");
        }


    }
}

