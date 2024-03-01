public class Reverse {


        int[] reverse()

        {
            int[] A={1,2,3,4,5};
            int B[]=new int[A.length];

            for(int i=A.length-1, j=0;i>=0;i--,j++)
            {
                B[j]=A[i];

            }
           return B;

        }
        public static void main(String[] args) {
            Reverse sc = new Reverse();
            int[] c =sc.reverse();
             for(int i=0;i<5;i++){
                 System.out.print(c[i]);
             }
        }

    }

