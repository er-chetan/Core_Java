import java.util.Scanner;

public class InputinJAVA {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number of subject");
        int size=obj.nextInt();
        int[] marks=new int[size];
        System.out.println("enter the marks of subject");

        for(int i=0;i<size;i++){
            int element= obj.nextInt();//for input
            marks[i]=element;//store the value in array
        }
    }
}
