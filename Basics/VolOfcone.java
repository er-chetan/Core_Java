import java.util.Scanner;

public class VolOfcone {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter any number");
        int number= obj.nextInt();

        System.out.println("Enter radius");
        int r=obj.nextInt();

        System.out.println("ENter heghit");
        int h=obj.nextInt();
        double pi =3.14;
        double volume=pi*r*r*h/3;
        System.out.println("volume of cone"+"="+volume);

        if((number%2)==0){
            System.out.println("it is a even number");

        }else{
            System.out.println("it is a odd number");
        }
    }
}
