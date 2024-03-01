package ExceptionHandling;

public class ExceptionExample {
    public void printdivid() {
        int a = 56;
        int b = 9;
        int c =0;
        int[] mixelement = {34, 5, 6, 78};

        try {
            c = a / b;
            System.out.println(mixelement[5]);
        }catch (ArithmeticException e) {
            System.out.println("in airthamtic exception");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException es)
        {
            System.out.println("in index exception");
            es.printStackTrace();
        }

        System.out.println("this si again statemn");
        System.out.println(c);
    }


    public static void main(String[] args) {
        ExceptionExample eone = new ExceptionExample();
        eone.printdivid();

    }
}
