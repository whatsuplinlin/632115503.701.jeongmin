package week13;

public class Circle extends Arbitrary {
    public Circle(double radius) {
        area = radius * radius * Math.PI;
    }

    public double getArea() {
        return area;
    }
}