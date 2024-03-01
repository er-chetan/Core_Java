package ExceptionHandling;

public class Arrayindex {
    public void print() {
        int[] array = {1, 2, 3, 4, 5};
        try{
            System.out.println(array[5]);
        }catch (  ArrayIndexOutOfBoundsException es){
            System.out.println("in index exception");
            es.printStackTrace();
        }
          System.out.println("this is again");
    }


    public static void main(String[] args) {
        Arrayindex a1 = new Arrayindex();
        a1.print();
    }

}
