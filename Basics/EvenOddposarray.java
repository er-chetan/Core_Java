public class EvenOddposarray {
    public static void main(String[] args){
        int[] array={1,2,3,4,5};
        System.out.println("element of even postion");
        for(int i=1;i< array.length;i=i+2){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("element of odd position");
        for(int i=0;i< array.length;i=i+2){
            System.out.print(array[i]+" ");
        }
    }
}
