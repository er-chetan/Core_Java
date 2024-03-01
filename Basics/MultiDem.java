public class MultiDem {//MULTI DEMENSIONAL ARRAY
    public static void main(String[] args){
        int[][] marks= {{1,2,3,},{4,5,6},{7,8,9}};
        int sum=0;
        int[][] mark=new int[marks.length][marks.length];
        int[][]c={{1,2,3},{4,5,6},{7,8,9}};
        int[][]s=new int[3][3];
        long mul=1l;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(marks[i][j]+" ");
                sum=sum+marks[i][j];
                mul=mul*marks[i][j];
            }
            System.out.println();
        } System.out.println("sum of elements"+" "+sum);
          System.out.println("multiplication of element"+" "+mul);

          //copy an array//

        System.out.println("coppied array");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                mark[i][j]=marks[i][j];
                System.out.print(mark[i][j]+" ");
            }System.out.println();
        }

    }
}
