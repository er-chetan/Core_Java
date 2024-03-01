package Inheritance.herrical;

import Inheritance.example.B;

import java.util.Scanner;

public class Binary extends StringOperation {
    int[] array;

    public Binary(int[] a){
        this.array=a;
    }
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
        public void binarysearch(){
            Scanner obj=new Scanner(System.in);
            System.out.println("\nenter the number for found");
            int num= obj.nextInt();
            int ii=0;
            int li=array.length-1;
            boolean find =false;
            int mi=(ii+li)/2;

            while (ii <= li) {
                if(num==array[mi]){
                    System.out.println("element find at "+mi);
                    find=true;
                    break;
                }
                else if(num>array[mi]){
                    ii=mi+1;
                }else if(num<array[mi]){
                    li=mi-1;
                }
                mi=(ii+li)/2;
            }
            if(find=false){
                System.out.println("element not found");
            }
        }

    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6,7,8,9};
        Binary b1=new Binary(a);
        b1.displayArray();
        b1.binarysearch();
        b1.display();
        System.out.println();
        b1.Arraysum();
    }
}
