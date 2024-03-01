package Array;

public class asending {
    public static void main(String[] args){
        int[] marks={40,50,90,30};
         int s;
         for(int i=0;i< marks.length;i++){//this outer loop for traverse of array//
              for(int j=i+1;j<4;j++){ //for compare
                    if(marks[i]>marks[j]){// marks[i] value is changed if condtion is true//
                      int temp=marks[i];//for swaping
                      marks[i]=marks[j];
                      marks[j]=temp;
                  }
              }
         }
        System.out.println("elements in ascending order");
         for(int i=0;i< marks.length;i++){
             System.out.print(marks[i]+" ");
         }
        System.out.println();
        System.out.println("max value");
        System.out.println(marks[marks.length-1]);
        System.out.println("min value");
        System.out.println(marks[0]);
    }
}
