package cohding.java.d6;
import java.util.Scanner;

public class rotator {
    public static void print(String text, int num) {
        if (text == "number") {
            System.out.println(num);
            return;
        }
        System.out.println(text);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        print("Input a number:", 0);
        int number = scn.nextInt();
        print("How many times do you want to shift it?", 0);
        int k = scn.nextInt();

        int digits = (int) Math.log10(number) + 1;
        k = k % digits;
        int a = (int) Math.pow(10, k);
        int b = number % a;
        int c = number / a;

        int result = b * (int) Math.pow(10, digits - k) + c;

        print("number", result);

        scn.close();
    }
}