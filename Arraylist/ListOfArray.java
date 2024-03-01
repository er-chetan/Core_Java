package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ListOfArray {
    public void list(){
        ArrayList <Integer> marks=new ArrayList<>();
//        marks.add(14);
//        marks.add(34);
//        marks.add(55);
//        marks.add(52);
//        marks.add(98);
//        System.out.println("list of an array");
//        System.out.print(marks.get(0)+" ");
//        System.out.print(marks.get(1)+" ");
//        System.out.print(marks.get(2)+" ");
//        System.out.print(marks.get(3)+" ");
//        System.out.print(marks.get(4)+" ");
//        System.out.println();
        System.out.println("array list by na user");
        Scanner sone =new Scanner(System.in);
        System.out.println("enter the number of element in array list");
        int n= sone.nextInt();
        System.out.println("enter the element");
        for(int i=0;i<n;i++){
            int element = sone.nextInt();
            marks.add(element);
        }
        System.out.println("print the element");
        for(int i=0;i<marks.size();i++){
            System.out.print(marks.get(i)+" ");
        }
    }

    public static void main(String[] args) {
        ListOfArray l1=new ListOfArray();
        l1.list();
    }
}
