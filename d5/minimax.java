package cohding.java.d5;

import java.util.Scanner;

public class minimax {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int number;
        char choice;

        do {
            System.out.println("Enter a number:");
            number = scn.nextInt();

            if (number > max) {
                max = number;
            } 

            if (number < min) {
                min = number;
            }

            System.out.println("Do you want to continue?");
            choice = scn.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);

        scn.close();
    }
}
