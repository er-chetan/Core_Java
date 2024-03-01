package Array;

import java.util.Scanner;

public class Sumofindex_Find {
    int N,S;
    int find=0;
    Scanner obj=new Scanner(System.in);
    public void print_array() {
        System.out.println("enter the number of element");
        N = obj.nextInt();
        System.out.println("enter the elements");
        int[] array = new int[N];
        for (int i = 0; i <N; i++) {
            int element = obj.nextInt();
            array[i] = element;
        }
        System.out.print("Array is :");
        for (int i = 0; i <N; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nenter the sum which you find");
        S= obj.nextInt();
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (S == array[i] + array[j]) {
                        System.out.println("index of number" + " " +(i+1)+ " " +(j+1));
                        find++;
                    }
                }
            }if(find==0){
            System.out.println("sum is not found");
        }
    }

    public static void main(String[] args) {
        Sumofindex_Find s1=new Sumofindex_Find();
        s1.print_array();
    }
}
