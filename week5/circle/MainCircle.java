package week5.circle;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setOrigin(0.0 , 0.0);
        circle1.setRadius(2.0);
        System.out.println("Area of cir1 = " + circle1.getArea());
        System.out.println("Circumference of cir1 = " + circle1.getCircumference());

        Circle circle2 = new Circle();
        circle2.setOrigin(1.0 , 2.0);
        circle2.setRadius(3.0);
        System.out.println("Area of cir2 = " + circle2.getArea());
        System.out.println("Circumference of cir2 = " + circle2.getCircumference());

        Circle circle3 = new Circle();
        circle3.setOrigin(3.0 , 5.0);
        circle3.setRadius(1.0);
        System.out.println("Area of cir3 = " + circle3.getArea());
        System.out.println("Circumference of cir3 = " + circle3.getCircumference());
        
        Circle circle4 = new Circle();
        circle4.setOrigin(-1.0 , -10.0);
        circle4.setRadius(-1.0);
        System.out.println("Area of cir4 = " + circle4.getArea());
        System.out.println("Circumference of cir4 = " + circle4.getCircumference());

        System.out.println("Is circle 1 intersect circle 2: " + circle1.intersected(circle2.getOrigin1(), circle2.getOrigin2(), circle2.getRadius()));
        System.out.println("Is circle 1 intersect circle 3: " + circle1.intersected(circle3.getOrigin1(), circle3.getOrigin2(), circle3.getRadius()));
    }
}
