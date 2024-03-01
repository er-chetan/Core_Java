public class EqualMatrix {
    public static void main(String[] args) {

        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        boolean find = false;
        System.out.println("first array");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("second array");
        for (int r = 0; r < b.length; r++) {
            for (int s = 0; s < b.length; s++) {
                System.out.print(b[r][s] + " ");
            }
            System.out.println();

        }
        first:
        for(int i=0;i<a.length;i++){
            second:
            for(int j=0;j<b.length;j++){
                if(a[i][j]!=b[i][j]){
                    find=true;
                    break first;
                }
            }
        }

            if(find==false){
            System.out.println("matrix equal");
        }else{
                System.out.println("matrix is not equal");
            }
    }
}