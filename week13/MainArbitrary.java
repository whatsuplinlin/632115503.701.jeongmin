package week13;

public class MainArbitrary {
    public static void main(String[] args) {
        Arbitrary circle = new Circle(12.0);
        Arbitrary square = new Square(5.5);
        Arbitrary triangle = new Triangle(10.0, 20.0);

        System.out.println("The area of the circle is " + circle.getArea());
        System.out.println("The area of the square is " + square.getArea());
        System.out.println("The area of the triangle is " + triangle.getArea());
    }
}