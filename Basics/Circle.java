public class Circle {
    double radius;
    public Circle(double radius){
            this.radius=radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getarea(){
            return radius*radius*Math.PI;
    }

    public String display(){
            return "Circle[radius=" + radius + "]";
    }
}


