package circle;

public class Circle {
    private double origin1;
    private double origin2;
    private double radius;
    
    public Circle() {

    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setOrigin(double x, double y) {
        this.origin1 = x;
        this.origin2 = y;
        this.radius = 1;
    }

    public double getOrigin1() {
        return origin1;
    }

    public double getOrigin2() {
        return origin2;
    }

    public double getArea() { 
        if (radius <= 0) 
            return 0.0;
        else 
            return radius * radius * Math.PI;     
    }     
    
    public double getCircumference() { 
        if (radius <= 0) 
            return 0.0;
        else 
            return 2 * radius * Math.PI;     
    }     
    
    public String intersected(double x1, double y1, double r1) {
        double d = Math.sqrt(Math.pow((x1 - this.origin1), 2) + Math.pow((y1 - this.origin2), 2));
        if (Math.abs(r1 - this.radius) <= d && d <= (r1 + this.radius) )
            return "true";
        else 
            return "false";
    }
    
}
