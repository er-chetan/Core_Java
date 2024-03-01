package Inheritance.herrical;

public class ArrayOperation {

    public void Arraysum(){
        int[] marks={1,2,3,4,5,6,7,8};
        int sum=0;
        for(int i=0;i<marks.length;i++){
            sum=sum+marks[i];
        }
        System.out.println(sum);
    }

//    public static void main(String[] args) {
//        ArrayOperation a1=new ArrayOperation();
//        a1.Arraysum();
//    }
}
