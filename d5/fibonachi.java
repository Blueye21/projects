package cohding.java.d5;
import java.util.Scanner;

public class fibonachi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of terms: " );
        int n = scn.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci sequence up to " + n + " terms.");

        for (int i = 1; i<= n; i++) {
            System.out.println(first + "");

            int next = first + second;

            first = second;
            second = next;
        }

        scn.close();
    }
}