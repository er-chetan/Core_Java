package Inheritance.herrical;

public class Number_operation  extends ArrayOperation{
    int num;
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

//    public static void main(String[] args) {
//        Number_operation n1=new Number_operation();
//        n1.num=454;
//        String result=n1.paildrome();
//        System.out.println(result);
//        n1.Arraysum();
//    }
}
