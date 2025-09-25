import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();
        System.out.println("Let's evaluate your grade");
        if (marks > 97) {
            System.out.println("A+");
        } else if (marks > 94) {
            System.out.println("A");
        } else if (marks > 84) {
            System.out.println("B");
        } else if (marks > 74) {
            System.out.println("C");
        } else if (marks > 64) {
            System.out.println("D");
        } else if (marks < 60) {
            System.out.println("F");
        }
        scn.close();
    }
}
