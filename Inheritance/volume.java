package Inheritance;

public class volume extends Student {
    int r ;
    int l;
    int b;
    double area;
    double pie=3.13;

    public volume(int radius ,int length,int breadth ,int a,int b,int roll){
//        super(a,b,roll);
        this.r=radius;
        this.l=length;
        this.b=breadth;
    }

    public void circle(){
        area = pie*r*r;
        System.out.println(" area of circle"+area);
    }
    public void rectangle(){
        area = l*b;
        System.out.println("area of rectangle"+area);
    }
    public void square(){
        area=l*l;
        System.out.println("area of square"+area);
    }
    public void cone(){
        area =(pie*r*r*l)/3;
        System.out.println("area of cone"+area);
    }

    public static void main(String[] args) {
//        volume c1=new volume(5,7,9);
//        c1.circle();
//        c1.rectangle();
//        c1.square();
//        c1.cone();
    }
}
