package ExceptionHandling;

public class NUllpoint {
    String id="hr";
    public void print() {
        try{
            if (id.equals("vr")) {
                System.out.println("same");
            }else{
                System.out.println("different");
            }
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        System.out.println("this is pointer");
    }

    public static void main(String[] args) {
        NUllpoint n1=new NUllpoint();
        n1.print();
    }
}
