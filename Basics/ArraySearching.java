import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args){
        System.out.println("enter the number");
        Scanner obj=new Scanner(System.in);
        int[] marks={40,50,90,60,70,30};
        int r= obj.nextInt();
        boolean find=false;
        for(int i=0;i< marks.length;i++){
            if(r==marks[i]){
                find=true;
                System.out.println("element is found at"+i);
            }
        }
       if(find==false){
             System.out.println("element is not found");
        }

    }
}
