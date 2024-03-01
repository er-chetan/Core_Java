import java.util.Scanner;

public class StringPractice1 {
    public static void main(String[] args) {
//        String s = "this is a first string";
//        String s1 = new String(" this is a first string");
//        String m = "android";
//        char a = 'b';
//        String f = "70091254592";
//        s = s.replaceAll("a", "b");
//        System.out.println(s.length());
//        System.out.println(s);
//        System.out.print(m.substring(0, 3));
//        System.out.println(f.substring(0, 4));
//        char[] carray = s1.toCharArray();
//
//        for (int i = carray.length - 1; i >= 0; i--) {// reversing string
//            System.out.print(carray[i]);
//        }
         char v;
         char[] s;
        Scanner obj = new Scanner(System.in);
        String S1 = obj.next();
        String S2 = obj.next();
        String S = S1 + S2;
        char[] rev = S.toCharArray();
        System.out.println("reverse");
        for (int i = rev.length - 1; i >= 0; i--) {// reversing string

        }


    }
}
