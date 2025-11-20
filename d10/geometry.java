package cohding.java.d10;

class Math {
    public double sum() {
        return 0;
    }
}

class Addition extends Math {
    private double one;
    private double two;

    public Addition(double one, double two) {
        this.one = one;
        this.two = two;
    }

    @Override
    public double sum() {
        return one + two;
    }
}

class Multiplication extends Math {
    private double one;
    private double two;

    public Multiplication(double one, double two) {
        this.one = one;
        this.two = two;
    }

    @Override
    public double sum() {
        return one * two;
    }
}

public class geometry {
    public static void main(String[] args) {
        Math[] math = new Math[2];
        math[0] = new Addition(1, 2);
        math[1] = new Multiplication(2, 5);

        System.out.println("Sum: " + math[0].sum());
        System.out.println("Sum: " + math[1].sum());
    }
}
