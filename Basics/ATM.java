
import java.util.Scanner;

public class ATM {
    public static void main(String[] args){
        int w=1254;
        System.out.println("WELCOME TO UNION BANK OF INDIA");
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the pin ");
            int n= obj.nextInt();
            if(w==n) {

                int money = 10000;
                int m;
                System.out.println("username:Akash singh");
                System.out.println();
                System.out.println();
                for(int i=1;i<100;i++) {
                    System.out.println("please choose the following option");
                    System.out.println("choose 1: cash withdraw");
                    System.out.println("choose 2: Deposite");
                    System.out.println("choose 3: update pin");
                    System.out.println("choose 4: check balance");
                    System.out.println("choose 5: exit");
                    System.out.println();
                    System.out.println();
                    System.out.println("enter your choice");
                    int r = obj.nextInt();
                    switch (r) {
                        case 1:
                            Scanner obj1 = new Scanner(System.in);
                            System.out.println("enter the amount to withdraw cash");
                            int s = obj1.nextInt();
                            if (money > s) {
                                m = money - s;

                                System.out.println("available balance" + "=" + m);
                            } else {
                                System.out.println("insufficient balance please try again");
                            }
                            break;
                        case 2:
                            Scanner obj2 = new Scanner(System.in);
                            System.out.println("enter the amount to deposite");
                            int y = obj2.nextInt();
                            m = money + y;
                            System.out.println(" available balance" + " " + m);
                            break;
                        case 3:
                            Scanner obj3 = new Scanner(System.in);
                            System.out.println("enter your previous pin");
                            int d = obj3.nextInt();
                            if (n == d) {
                                System.out.println("enter your new pin");
                                int c = obj3.nextInt();
                                d = c;
                                System.out.println("your new pins is :" + d);
                            }
                            break;
                        case 4:
                            System.out.println("available balance" + " " + money);
                            break;
                        case 5:
                            System.out.println("exit");
                            break;
                    }System.out.println();
                    System.out.println();
                    if(r==5){
                        break;
                    }
                }
            }else{
                System.out.println("enter invalid pin");
            }
    }
}
