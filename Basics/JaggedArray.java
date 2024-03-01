import java.util.Scanner;
public class JaggedArray {
    public static void main(String[] args){
       Scanner obj= new Scanner(System.in);
        System.out.println("now enter the row of an array");
        int row= obj.nextInt();
        String[][] marks=new String[row][];
        System.out.println("now enter column of an array");
        for(int i=0;i<row;i++){
            int column= obj.nextInt();
            marks[i]=new String[column];
        }
        System.out.println("now enter the elment");
        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                String element= obj.next();
                marks[i][j]=element;
            }
        }
        for(int i=0;i< marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
            System.out.println();
        }
    }
}

