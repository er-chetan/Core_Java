package StringJavaTpoint;

import Abstraction.First;

import java.lang.reflect.Array;

public class Anagram {
    boolean free=false;
   public void charsame(){
       String s1="my name is chetan";
        s1=s1.replaceAll("//s"," ");
       String s2="chetan is my name ";
       s2=s2.replaceAll("//s"," ");
//       char[] arr1=s1.toCharArray();
//       char[] arr2=s2.toCharArray();
       System.out.println(s1+" "+s2);


   }

    public static void main(String[] args) {
        Anagram a1=new Anagram();
        a1.charsame();
    }
}
