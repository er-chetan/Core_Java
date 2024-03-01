package Array;

import java.util.Scanner;

public class InoutArray {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int row= obj.nextInt();
        System.out.println("enter the number of columns");
        int column = obj.nextInt();
        if(row==column){
            int[][] marks= new int[row][column];
            for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                    int element = obj.nextInt();
                    marks[i][j]=element;
                    System.out.print(marks[i][j]);
                }
                System.out.println();
            }
        }else{
            System.out.println("row is not equal to column");
        }


    }
}
