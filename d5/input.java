package cohding.java.d5;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int number = scn.nextInt();
        int sum = 0;

        for(int i = 0; i <= number; i++) {
            sum += i;
        }
        System.out.println(sum);

        scn.close();
    }
}
