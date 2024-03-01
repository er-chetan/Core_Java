import java.util.Scanner;

public class Concatinate_String2 {
        static String conRevstr2(String S1, String S2) {
            String e=new String() ;
            String S = S1 + S2;
            char[] rev = S.toCharArray();
            for (int i = rev.length - 1; i >= 0; i--) {// reversing string
                  e=e+rev[i];
            }
            return e;
        }
            public static void main(String[] args){

                Concatinate_String2 s1=new Concatinate_String2();
                String S1,S2;
                Scanner obj=new Scanner(System.in);
                S1=obj.next();
                S2=obj.next();
                String d=s1.conRevstr2(S1,S2);
                System.out.println(d);
            }
        }

