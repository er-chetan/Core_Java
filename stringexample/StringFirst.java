package  stringexample;

import java.util.Locale;
import java.util.Scanner;

 public class StringFirst{
        public static void main(String[] args){
//            Scanner obj=new Scanner(System.in);
//            System.out.println("enter the string");
//            String s= obj.nextLine();
            String s="it is my string";
            System.out.println(s.toUpperCase(Locale.ROOT));
            System.out.println(s.length());
            System.out.println(s.charAt(4));
            System.out.println(s.indexOf('s'));
            System.out.println(s.indexOf("st"));
            System.out.println(s.substring(3,12));

            char[] carray=s.toCharArray();

            for(int i=carray.length-1;i>=0;i--){// reversing string
                System.out.print(carray[i]);
            }
        }
    }


