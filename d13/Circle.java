public class Circle extends Shape {
    private boolean isSphere;

    public Circle(String name, int sides, boolean isSphere) {
        super(name, sides);
        this.isSphere = isSphere;
    }

    public boolean getIsSphere() {
        return isSphere;
    }

    @Override
    public void act() {
        System.out.println("The circle circles");
    }
}