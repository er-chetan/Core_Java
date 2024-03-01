package Array;

import java.util.Scanner;

public class Binarysearch {
    public static void main(String[] args){
        int[] array ={1,2,3,4,5,6,7,8,9,10,11};
        System.out.println("enter the number to found index");
        Scanner obj=new Scanner(System.in);
        int num= obj.nextInt();


        int ii=0;
        int li= array.length-1;
        boolean find = false;
        int mi=(ii+li)/2;
        while(ii<=li){

            if(num==array[mi]){
                System.out.println("element find at"+mi);
                find=true;
                break;
            }else if(num>array[mi]){
                ii=mi+1;
            }else if(num<array[mi]){
                li=mi-1;
            }
            mi=(ii+li)/2;

        }if(find==false){
            System.out.println("element not found");
        }
    }
}
