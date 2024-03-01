package LocalinnerClass;

public class NUM_OP {
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


}
