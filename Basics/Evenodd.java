import java.util.Scanner;

public class Evenodd {
        public static void main(String[] args){
            System.out.println("enter the number");
            Scanner obj=new Scanner(System.in);
            int x=obj.nextInt();
            if(x%2==0){
                System.out.println("EVEN");
            }else{
                System.out.println("ODD");
            }
        }
    }

