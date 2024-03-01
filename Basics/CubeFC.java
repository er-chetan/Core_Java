import java.util.Scanner;

public class CubeFC {
    public static void main(String[] args){
        System.out.println(" enter the number");
        Scanner obj= new Scanner(System.in);
        int r=obj.nextInt();

        if(r%2==0){
            System.out.println("number is even");
            int volume=r*r*r;
            System.out.println("volume of cube"+"="+volume);
        }else{
            System.out.println("number is odd");
            int FC=273+r;
            System.out.println("fahrenheit to celsius"+"="+FC);

        }
    }
}
