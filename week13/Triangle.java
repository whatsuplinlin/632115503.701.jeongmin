package week13;

public class Triangle extends Arbitrary {
    public Triangle(double base, double height) {
        area = base * height / 2;
    }

    public double getArea() {
        return area;
    }
}