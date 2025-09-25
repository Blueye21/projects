import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        System.out.println(str);

        int num = scn.nextInt();
        System.out.println(num);

        float flnum = scn.nextFloat();
        System.out.println(flnum);
        scn.close();
    }
}