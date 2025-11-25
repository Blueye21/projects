package cohding.java.d10;

class Shape {
    void volume() {

    }
}

class cube extends Shape {
    private double side;

    public cube(double side) {
        this.side = side;
    }

    @Override
    void volume() {
        System.out.println("Volume: " + (side * side * side));
    }
}

class rectangle extends Shape {
    private double length;
    private double width;
    private double height;

    public rectangle(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    void volume() {
        System.out.println("Volume: " + (length * width * height));
    }
}

class cylinder extends Shape {
    private double radius;
    private double height;
    private final double pi = 3.141592653;

    public cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    void volume() {
        System.out.println("Volume: " + (pi * radius * radius * height));
    }
}

public class geometrics {
    public static void main(String[] args) {
        Shape[] Shape = new Shape[3];
        Shape[0] = new cube(3);
        Shape[1] = new rectangle(2, 3, 4);
        Shape[2] = new cylinder(3, 5);
        for (Shape m : Shape) {
            m.volume();
        }
    }
}