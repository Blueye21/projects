package cohding.java.d6;
import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        while (true) {
            int n = scn.nextInt();
            scn.close();
            boolean prime = false;

            for (int div = 2; div + div <= n; div++) {
                if (n % div == 0) {
                    prime = true;
                    break;
                }
            }

            if (prime) {
                System.out.println("unprime");
            } else {
                System.out.println("prime");
            }
        }
    }
}
