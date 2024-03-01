import java.util.Scanner;

public class AreaOfrectangle {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the breadth");
        int b=obj.nextInt();
        Scanner s=new Scanner(System.in);
        System.out.println("enter the height");
        int h=s.nextInt();
        int area =b*h/2;
        System.out.println("area of rectangle"+"="+area);
    }
}
