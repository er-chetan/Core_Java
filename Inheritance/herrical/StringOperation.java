package Inheritance.herrical;

public class StringOperation extends ArrayOperation  {
    public void display(){
        String name="my name is chetan";
        System.out.println(name);
        char[] s= name.toCharArray();
        for(int i=s.length-1;i>=0;i--){
            System.out.print(s[i]);
        }
    }

//    public static void main(String[] args) {
//
//         StringOperation s1=new StringOperation();
//         s1.display();
//        System.out.println();
//         s1.Arraysum();
//
//    }
}
