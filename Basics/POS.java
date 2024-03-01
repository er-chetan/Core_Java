import java.util.Scanner;

public class POS {
    public static void main(String[] args){
        System.out.println("enter the number");
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        if(x>0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }
    }
}
