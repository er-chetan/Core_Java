package Array;

import Abstraction.First;

import java.util.Scanner;

public class Position_sum {
    int N, S,find=0;
    int add,add1=0;
    Scanner obj = new Scanner(System.in);

    public void print_array() {
        System.out.println("enter the number of element");
        N = obj.nextInt();
        System.out.println("enter the elements");
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            int element = obj.nextInt();
            array[i] = element;
        }
        System.out.print("Array is :");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nenter the sum which you find");
        S = obj.nextInt();
        First:
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                add=array[i]+array[j];
                add1=add1+add;
                if(S==add1){
                    System.out.println("index of number" + " " +(i+1)+ " " +(j+1));
                    find++;
                    break First;
                }
                array[i]=0;
            }
            add1=0;
        }if(find==0){
            System.out.println("sum is not find");
        }
    }

    public static void main(String[] args) {
        Position_sum p1=new Position_sum();
        p1.print_array();
    }
}
