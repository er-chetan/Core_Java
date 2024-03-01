import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        int i;
        int s = 0;
        double p;
        System.out.println("enter the 10 marks of subject");
        for (i = 1; i <= 5; i++) {
            System.out.println("marks" + i);
            Scanner obj = new Scanner(System.in);
            int r = obj.nextInt();
            s = s + r;
        }
        p = s * 100 / 500;
        System.out.println("percentage of marks" + "=" + p);

        if (p>=90) {
            System.out.println("grade = A+");
        }else if(p>=70 && p<90 ){
            System.out.println("grade = A");
        }else if(p>=50&&p<70){
            System.out.println("grade = B");
        }else if(p>=33&&p<50){
            System.out.println("grade = C");
        }else if(p<33){
            System.out.println("grade = F");
        }
    }
}