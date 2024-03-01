import java.util.Scanner;

public class Choice {
    int num;
    int r;
    Scanner obj=new Scanner(System.in);
    public void run(){
        int sum=0;
        System.out.println("enter the number");
        num=obj.nextInt();
        System.out.println("choose the following option");
        System.out.println("1.sum of digit");
        System.out.println("2.reverse of digit");
        System.out.println("3.multiplication of digit");
        System.out.println("4.paildrome");
        System.out.println("5.exit");
        System.out.println("enter your choice");
        int n=obj.nextInt();
        switch (n){
            case 1:
                while(num>0){
                     r=num%10;
                     sum=sum+r;
                     num=num/10;
                }
                System.out.println("sum of digit"+" "+sum);
                break;
            case 2:
                int reverse=0;
                while(num>0){
                    r=num%10;
                    reverse=(reverse*10)+r;
                    num=num/10;
                }
                System.out.println("reverse of digit"+" "+reverse);
        }

    }

    public static void main(String[] args) {
        Choice c1=new Choice();
        c1.run();
    }
}
