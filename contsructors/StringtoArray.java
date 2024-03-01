package contsructors;

import Inheritance.Student;

public class StringtoArray extends Student {
     String marks;
     public void linear(){
          marks=marks.replaceAll("a","b");
         System.out.println(marks);
     }
     public static void main(String[] args){

         StringtoArray c1=new StringtoArray();
         c1.linear();
         c1.name="chetan";
         c1.roll=2;
         c1.printdetail();
         c1.a=3;
         c1.b=6;
         c1.add();
     }
}
