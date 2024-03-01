import java.util.Scanner;

public class Compare {
    public void compare_number(){
        System.out.println("enter the number");
        Scanner obj1=new Scanner(System.in);
        int x=obj1.nextInt();
        System.out.println("enter the number");
        Scanner obj2=new Scanner(System.in);
        int y=obj2.nextInt();
        System.out.println("enter the number");
        Scanner obj3=new Scanner(System.in);
        int z=obj3.nextInt();

        if(x>y&&x>z) {
            System.out.println("x is greator than y and z");
        }else if(y>x&&y>z) {
            System.out.println("y is greator than x and z");
        }else if(z>y&&z>x) {
            System.out.println("z is greator than x and z");
        }

    }

    public static void main(String[] args) {
        Compare c1=new Compare();
        c1.compare_number();
    }
}
