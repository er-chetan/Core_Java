import java.util.Scanner;

public class Compare2 {
    public static void main(String[] args){
        System.out.println("enter the number");
        Scanner obj1=new Scanner(System.in);
        int x=obj1.nextInt();
        System.out.println("enter the number");
        Scanner obj2=new Scanner(System.in);
        int y=obj2.nextInt();
        System.out.println("enter the number");
        Scanner obj3=new Scanner(System.in);
        int z=obj3.nextInt();
        System.out.println("enter the number");
        Scanner obj4=new Scanner(System.in);
        int s=obj4.nextInt();

        if(x>y&&x>z&&x>s) {
            System.out.println(x+"is greator than"+ y+" and"+ z+" and"+s);
        }else if(y>x&&y>z&&y>s) {
            System.out.println (y+" is greator than"+ x+" and"+ z+" and"+s);
        }else if(z>y&&z>x&&z>s) {
            System.out.println(z+" is greator than"+ x+" and"+ y+" and"+s);
        }else if(s>y&&s>x&&s>z) {
            System.out.println(s+" is greator than"+ x+" and"+ z+" and"+y);
        }

    }
}