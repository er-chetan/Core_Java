package ExceptionHandling.CustomException;

public class Number_System  {
    public void check(int num) throws Invalid_Number{
        if(num%2!=0){
            Invalid_Number i1=new Invalid_Number("odd number");
            throw i1;
        }
    }

    public static void main(String[] args) {
        Number_System n1=new Number_System();
        try {
            n1.check(18);
            System.out.println("even number");
        } catch (Invalid_Number e) {
            e.printStackTrace();
        }
        System.out.println("it is number system");

    }
}
