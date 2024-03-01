package Inheritance.herrical;

import java.util.Scanner;

public class linear extends StringOperation {
    int[] array={1,2,3,4,5,6,7,8,9};
    public void displayArray(){
        System.out.println("########## ARRAY AND INDEX ###########@");
        System.out.println();
        System.out.println("array");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        System.out.println();
        System.out.println("index");
        for(int i=0;i<array.length;i++){
            System.out.print(i+" ");
        }

        }
    public void linearsearch(){
        Scanner obj = new Scanner(System.in);
        System.out.println("\nenter the number for found");
        int num = obj.nextInt();

        for(int i=0;i<array.length;i++){
            if(num==array[i]){
                System.out.println("number found at"+" " +i);
                break;
            }

        }
    }

    public static void main(String[] args) {
        linear l1=new linear();
        l1.displayArray();
        l1.linearsearch();
        l1.display();
        System.out.println();
        l1.Arraysum();
    }
}
