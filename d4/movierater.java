package cohding.java.d4;
import java.util.Scanner;

public class movierater {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter movie rating:");
        int rating = scn.nextInt();

        int category;

        if (rating>=90) {
            category = 5;
        } else if(rating>=75) {
            category = 4;
        } else if(rating>=50) {
            category = 3;
        } else if(rating>=25) {
            category = 2;
        } else if(rating>=0) {
            category = 1;
        }
        else {
            category = 3;
        }

        switch(category) {
            case 5:
                System.out.println("⭐ Excellent movie!!!");
                break;
            case 4:
                System.out.println("👍 Good movie");
                break;
            case 3:
                System.out.println("😐 Average movie");
                break;
            case 2:
                System.out.println("👎 Bad movie");
                break;
            case 1:
                System.out.println("😞 Awful movie");
                break;
        }
    }
}
