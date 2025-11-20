package cohding.java.d6;
import java.util.Scanner;

public class primegenerator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

        for (int n = low; n <= high; n++) {
            boolean count = false;

            for (int div = 2; div + div <= n; div++) {
                if (n % div == 0) {
                    count = true;
                    break;
                }
            }

            if (count == false && n > 1) {
                System.out.println(n);
            }
        }
        scn.close();
    }
}
