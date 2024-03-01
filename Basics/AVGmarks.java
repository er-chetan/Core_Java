import java.util.Scanner;

public class AVGmarks {
    public static void main(String[] args){
        int i;
        int s=0;
        double a;
        System.out.println("enter the 10 marks of subject");
        for(i=1;i<=10;i++){
            System.out.println("marks"+i);
            Scanner obj=new Scanner(System.in);
            int r=obj.nextInt();
            s=s+r;
        }
        a=s/10;
        System.out.println("average of 10 marks"+"="+a);
    }
}
