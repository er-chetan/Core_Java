public class Cylinder extends Circle {
    double height;

    public Cylinder(double height,double radius) {
        super(radius);
        this.height=height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getvolume(){
        return super.getarea()*height;
    }

    @Override
    public double getarea(){
        return 2.0*radius*Math.PI*height;
    }
//    @Override
    public String display(){
        return "Cylinder[height=" + height + "," + super.display() + "]";
    }

    public static void main(String[] args) {
        Cylinder c1=new Cylinder(1.1,2.1);
        System.out.println(c1.getarea());
        System.out.println(c1.getvolume());
        System.out.println(c1.getRadius());
        System.out.println(c1.display());


    }

}

