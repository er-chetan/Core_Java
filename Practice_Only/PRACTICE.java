package Practice_Only;



import java.util.Scanner;

public class PRACTICE {
    public void display(){
        boolean find=true;
        Scanner obj=new Scanner(System.in);
        int[] array={78,45,89,56,85};
        System.out.println("ARRAY");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("enter the number which index you want");
        int input=obj.nextInt();

        for(int i=0;i< array.length;i++){
            if(array[i]==input){
                System.out.println("index is "+" "+i);
                find=false;
            }
        }if(find==true){
            System.out.println("invalid number you are entering");
        }


    }

    public static void main(String[] args) {
        PRACTICE p1=new PRACTICE();
        p1.display();
    }
}
