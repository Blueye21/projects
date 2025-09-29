package vsc.cohding.java.acp;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
        scn.close();
    }
}
