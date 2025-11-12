package cohding.java.d8;
import java.util.Scanner;

class Main {
    void run(int first, String operator, int second) {
        Float result = null;
        String error = null;
        switch (operator) {
            case "+":
                result = (float) first + second;
                break;
            case "-":
                result = (float) first - second;
                break;
            case "*":
                result = (float) first * second;
                break;
            case "/":
                if (second != 0) {
                    result = (float) first / second;
                    break;
                } else if (second == 0) {
                    error = "[503] Cannot divide by zero";
                    break;
                } else if (first == 0 && second == 0) {
                    error = "[503] Result is undefined";
                    break;
                }
            default:
                error = "[520] Unrecognized operator: '" + operator + "'";
                break;
        }
        if (error != null) {
            System.out.println(error);
        } else {
        System.out.println(result);
        }
    }
}

public class calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Main m = new Main();
        boolean run = true;
        while (run) {
            System.out.println("Calculator");
            System.out.println("Decimal mode disabled");
            System.out.println("First number:");
            int firstnum = s.nextInt();
            System.out.println("Operator: (+, -, *, /)");
            String operator = s.next();
            System.out.println("Second number:");
            int secondnum = s.nextInt();

            m.run(firstnum, operator, secondnum);
        }
        s.close();
    }
}
