public class Square extends Shape {
    private boolean isCube;

    public Square(String name, int sides, boolean isCube) {
        super(name, sides);
        this.isCube = isCube;
    }

    public boolean getIsCube() {
        return isCube;
    }

    @Override
    public void act() {
        System.out.println("The square squares");
    }
}