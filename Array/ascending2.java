package Array;

public class ascending2 {
    public static void main(String[] args){
        int[] arr={40,20,70,100,130,60};
        int temp=arr[0];
        for(int i=0;i<arr.length;i++){
            if(temp<arr[i]){

                temp=arr[i];
            }
        }
        System.out.println(temp);
    }
}
