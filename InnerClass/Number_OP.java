package InnerClass;

import java.util.Scanner;

public class Number_OP {
    int num;

    public String even() {
        if (num % 2 == 0) {
            return "it is even number";
        } else {
            return "it an odd number";
        }
    }

    public String paildrome() {
        int temp, r, sum = 0;
        temp = num;
        while (temp > 0) {
            r = temp % 10;
            sum = (sum * 10) + r;
            temp = temp / 10;
        }
        if (num == sum) {
            return "it is a palindrome number";
        } else {
            return "not palindrome number";
        }
    }

    public String pronic() {
        String f = "vidur";
        for (int i = 0; i <= num; i++) {
            if (i * (i + 1) == num) {

                f = "pronic number";
                break;
            }
        }
        if (f.equals("vidur")) {
            return "its not pronic number";
        } else {
            return f;
        }
    }

    class ArraySearching {
        public void searching() {
            System.out.println("enter the number");
            Scanner obj = new Scanner(System.in);
            int[] marks = {40, 50, 90, 60, 70, 30};
            int r = obj.nextInt();
            boolean find = false;
            for (int i = 0; i < marks.length; i++) {
                if (r == marks[i]) {
                    find = true;
                    System.out.println("element is found at"+" " + i);
                }
            }
            if (find == false) {
                System.out.println("element is not found");
            }

        }
    }

    public static void main(String[] args){
        Number_OP s=new Number_OP();
        s.num=454;
        String result1=s.even();
        System.out.println(result1);
        String result2=s.paildrome();
        System.out.println(result2);
        String  result3=s.pronic();
        System.out.println(result3);
        Number_OP.ArraySearching e=s.new ArraySearching();
        e.searching();
    }
}

