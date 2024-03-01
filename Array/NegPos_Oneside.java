package Array;

import java.util.Scanner;

public class NegPos_Oneside {
    int N;
    Scanner obj=new Scanner(System.in);
    public void printinfo() {
        System.out.println("enter the number of  element :");
        N = obj.nextInt();
        int[] array = new int[N];
        System.out.println("enter the element");
        for (int i = 0; i < N; i++) {
            int element = obj.nextInt();
            array[i] = element;
        }
        System.out.println("array :");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("new array:");
        for (int i = 0; i < N; i++) {
            if (array[i] >= 0) {
                System.out.print(array[i]+" ");
            }
        }
        for (int i = 0; i < N; i++) {
            if (array[i] < 0) {
                System.out.print(array[i]+" ");
            }
        }
    }


    public static void main(String[] args) {
        NegPos_Oneside n1=new NegPos_Oneside();
        n1.printinfo();
    }
}
