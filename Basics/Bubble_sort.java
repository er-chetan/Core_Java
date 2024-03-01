import java.util.Scanner;

public class Bubble_sort {
    public void display(){
        int temp=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the length of an array");
        int n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("array before sorting");
        for(int i=0;i<arr.length;i++){
            int element= obj.nextInt();
            arr[i]=element;
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("array after sorting");
        for(int i=0;i< arr.length;i++){
            for(int j=1;j< arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        Bubble_sort b1=new Bubble_sort();
        b1.display();
    }
}
