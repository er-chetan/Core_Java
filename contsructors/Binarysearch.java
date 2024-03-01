package contsructors;
import java.util.Scanner;
public class Binarysearch {
    int[] marks;
    public Binarysearch(int[] m){
        this.marks=m;
    }
    public void searching(){
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int ii=0;
        int li=marks.length-1;
        boolean find=false;
        int mi=(ii+li)/2;

        while(ii<=li){
            if(num==marks[mi]){
                System.out.println("element find at"+" "+mi);
                find=true;
                break;
            }else if(num>marks[mi]){
                ii=mi+1;
            }else if(num<marks[mi]){
                li=mi-1;
            }mi=(ii+li)/2;
        }if(find==false){
            System.out.println("element not find");
        }
    }
    public static void main(String[] args) {
        int[] marks={1,2,3,4,5,6,7,8,9,10,11};
        Binarysearch s=new Binarysearch(marks);
        s.searching();
    }
}
