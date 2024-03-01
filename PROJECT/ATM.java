package PROJECT;

import java.util.Scanner;

public class ATM {
    String name ;
    String number;
    String address;
    String id;
    int pin;
    int money;


    public void AccountOpen(){
        System.out.println("############  WELCOME TO STATE BANK OF INDIA  ##############");
        System.out.println("CREATE YOUR ACCOUNT");
        Scanner obj1=new Scanner(System.in);
        System.out.println("ENTER YOUR NAME");
        name = obj1.next();
        System.out.println("ENTER YOUR PHONE NUMBER");
        number= obj1.next();
        System.out.println("ENTER YOUR ADDRESS ");
        address= obj1.next();
        System.out.println("EMPLOYEE ID ");
        System.out.println(name.substring(0,3)+number.substring(0,3));
        System.out.println("CREATE YOUR PIN");
        pin= obj1.nextInt();
        System.out.println("DEPOSITE THE MONEY");
        money=obj1.nextInt();

    }

    public void Optionchoose(){
        System.out.println("############# NOW YOUR ACCOUNT IS OPENED IN OUR BANK ##############");
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter your pin");
        int t=obj1.nextInt();
        if(t==pin) {

            int m;
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
                int r = obj1.nextInt();
                switch (r) {
                    case 1:
                        Scanner obj2 = new Scanner(System.in);
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
                        Scanner obj3 = new Scanner(System.in);
                        System.out.println("enter the amount to deposite");
                        int y = obj3.nextInt();
                        m = money + y;
                        System.out.println(" available balance" + " " + m);
                        break;
                    case 3:
                        Scanner obj4 = new Scanner(System.in);
                        System.out.println("enter your previous pin");
                        int d = obj4.nextInt();
                        if (r == d) {
                            System.out.println("enter your new pin");
                            int c = obj1.nextInt();
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

    public static void main(String[] args) {
        ATM a1=new ATM();
        a1.AccountOpen();
        a1.Optionchoose();
    }
}
