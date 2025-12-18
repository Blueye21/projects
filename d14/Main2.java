public class Main2 {
    public static void main(String[] args) {
        Circle2 circle = new Circle2(5);
        Circle2 circle2 = new Circle2(10);
        Circle2 circle3 = new Circle2(15);
        System.out.println("Circle of radius: " + circle.getRadius());
        System.out.println("Area: " + circle.area());
        System.out.println("Circ: " + circle.circumference());
        System.out.println("Circle of radius: " + circle2.getRadius());
        System.out.println("Area: " + circle2.area());
        System.out.println("Circ: " + circle2.circumference());
        System.out.println("Circle of radius: " + circle3.getRadius());
        System.out.println("Area: " + circle3.area());
        System.out.println("Circ: " + circle3.circumference());
    }
}
