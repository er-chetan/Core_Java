import java.util.Scanner;

public class Basic_ofjava {
    public static void main(String[] args) {
        System.out.println("enter the value");
        Scanner obj=new Scanner(System.in);
        int n= obj.nextInt();
        System.out.println("use of for loop for an array");
        int[] array=new int[n];//int[] array={1,2,3};
        for(int i=0;i<n;i++){
             int element= obj.nextInt();
             array[i]=element;
        }
        System.out.println("print an array");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }



}
