public class Area {
    int r ;
    int w;
    int b;
    int l;
    double area;
    double pie= 3.13;

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
    public static void main(String[] args){
        Area c=new Area();
        c.r=4;
        c.b=5;
        c.l=9;
        c.w=6;
        c.circle();
        c.rectangle();
        c.square();
        c.cone();
    }
}
