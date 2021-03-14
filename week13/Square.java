package week13;

public class Square extends Arbitrary {
    public Square(double side) {
        area = side * side;
    }

    public double getArea() {
        return area;
    }
}