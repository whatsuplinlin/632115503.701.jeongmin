package week9;

public class Shape {
    public Shape() {}
    
    public String toString() {
        return "This is a shape.";
    }
}

class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public String toString() {
        return "This is a rectangle with width as " + width + " and height as " + height + ".";
    }
}

class Cube extends Rectangle {
    int length;

    public Cube(int width, int height, int length) {
        super(width, height);
        this.length = length;
    }

    public String toString() {
        return "This is a cube with the side of " + length + ".";
    }
}