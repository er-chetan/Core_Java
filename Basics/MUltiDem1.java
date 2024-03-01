public class MUltiDem1 {
        public static void main(String[] args) {
            int[][] marks = {{1, 2, 3,}, {4, 5, 6}, {7, 8, 9}};
            int[][]c={{1,2,3},{4,5,6},{7,8,9}};
            int[][]s=new int[3][3];
            int[][]mul=new int[3][3];
            int[][] div=new int[3][3];

            System.out.println("first array");
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print(marks[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("second array");
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("sum of two array");
            for(int i=0;i< marks.length;i++){
                for(int j=0;j< c.length;j++){
                    s[i][j]=marks[i][j]+c[i][j];
                    System.out.print(s[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("multiplication of two array");
            for(int i=0;i< marks.length;i++){
                for(int j=0;j< c.length;j++){
                    mul[i][j]=marks[i][j]*c[i][j];
                    System.out.print(mul[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("divsion of array");
            for(int i=0;i< marks.length;i++){
                for(int j=0;j< c.length;j++){
                    div[i][j]=marks[i][j]/c[i][j];
                    System.out.print(div[i][j]+" ");
                }
                System.out.println();
            }
        }
}
