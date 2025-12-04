package cohding.java.d12;

import java.util.Scanner;

class Multiply {
    int result;

    public void times(int one, int two) {
        try {
            result = one * two;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("temp");
        }
    }

    public void display() {
        System.out.println(result);
    }
}

public class d122 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("First number");
        int first = s.nextInt();
        System.out.println("Second number");
        int second = s.nextInt();

        Multiply m = new Multiply();
        m.times(first, second);
        m.display();

        s.close();
    }
}
