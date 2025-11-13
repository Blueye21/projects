package java.d9;

class Superclass {
    int number = 56;
}

class Subclass extends Superclass {
    int number = 96;

    void printNumber() {
        System.out.println(number);
    }
}

public class supper {
    public static void main(String[] args) {
        Subclass s = new Subclass();
        s.printNumber();
    }
}