package Array;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int first;
        for(int i= arr.length-1;i>=0;i--) {
            first = arr[i];
            System.out.print(first+" ");
        }
        }
}
