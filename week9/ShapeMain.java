package week9;

public class ShapeMain {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Shape shape2 = new Rectangle(5, 10);
        Shape shape3 = new Cube(5, 10, 8);

        System.out.println(shape1);
        System.out.println(shape2);
        System.out.println(shape3);
    }
}