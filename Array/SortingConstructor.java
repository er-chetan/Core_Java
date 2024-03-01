package Array;

public class SortingConstructor {
    int[] marks;
    public SortingConstructor(int[] marks){
        this.marks=marks;
    }
    public void sorting(){
        int[] localarray=marks;
        System.out.println();
        System.out.println("ascending order");
        for(int i=0;i<localarray.length;i++){
            for(int j=i+1;j< localarray.length;j++){
                if(localarray[i]> localarray[j]){//20,40,10
                    int temp=localarray[i];
                    localarray[i]=localarray[j];
                    localarray[j]=temp;
                }
            }
        }

        for(int i=0;i< localarray.length;i++){
            System.out.print(localarray[i]+" ");
        }
        System.out.println();
    }
//    public void Copyarrayggg(){
//        int[] son=marks;
//        System.out.println("copy array");
//        int[] r=new int[son.length];
//        for(int i=0;i<son.length;i++){
//            r[i]=son[i];
//            System.out.print(r[i]+" ");
//        }
//    }



     public static void main(String[] args){
        int[] markss={-6,3,-8,10,5,-7,-9,12,-4,2};
         SortingConstructor s1= new SortingConstructor(markss);
         s1.sorting();
//         s1.Copyarrayggg();


     }
}
