public class pattern {
    public static void main(String[] args){
         for(int i=1;i<=5;i++){
             for(int j=5-i;j>=1;j--){
                 System.out.print(" ");

             }

             for(int k=1;k<=i;k++){
                 System.out.print("*");
             }

             for(int m=2;m<=i-1;m++){
                System.out.print("*");
            }
             System.out.println();
         }
        }
    }

