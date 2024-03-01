package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class linearSearch {
    ArrayList <Integer> marks=new ArrayList<>();
    boolean find = false;
    public void ArrayInfo(){
        System.out.println("enter the number of element");
        Scanner sone =new Scanner(System.in);
        int  size=sone.nextInt();
        System.out.println("enter the element");
        for(int i=0;i<size;i++){
            int element= sone.nextInt();
            marks.add(element);
        }
        System.out.println("print the element ");
        for(int i=0;i< marks.size();i++) {
            System.out.print(marks.get(i));
        }
    }

    public void search(){
        System.out.println("enetr the element to find the index");
        Scanner obj1=new Scanner(System.in);
        int m=obj1.nextInt();
        for(int i=0;i<marks.size();i++){
            if(marks.get(i)==m){
                System.out.println("element is found"+" "+i);
                find=true;
                break;
            }
        }if(find=false){
            System.out.println("invalid input");
        }
    }

    public static void main(String[] args) {
        linearSearch l1=new linearSearch();
        l1.ArrayInfo();
        l1.search();
    }
}
