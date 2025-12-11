public class d131 {
    public static void main(String[] args) {
        Shape shape = new Shape("Heptagon", 7);
        Circle circle = new Circle("Circle", 5, false);
        Circle sphere = new Circle("Sphere", 10, true);

        shape.act();
        System.out.println(shape.getName() + " has " + shape.getSides() + " sides.");

        circle.act();
        System.out.println(circle.getName() + " has a radius of " + circle.getSides() + " and is " + (circle.getIsSphere() ? "a sphere" : "not a sphere"));

        sphere.act();
        System.out.println(sphere.getName() + " has a radius of " + sphere.getSides() + " and is " + (sphere.getIsSphere() ? "a sphere" : "not a sphere"));
    }
}
