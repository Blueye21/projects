package cohding.java.d7;
import java.util.Scanner;

class Student {
    int grade;
    String name;
    double averagescore;

    Student(int grade, String name, double averagescore) {
        this.grade = grade;
        this.name = name;
        this.averagescore = averagescore;
    }

    void display() {
        System.out.println(name + ": " + averagescore + " (Grade " + grade + ")");
    }
}

public class register {
    public static void main(String[] args) {
        Student one = new Student(14, "Jeffery", 97.3);
        Student two = new Student(7, "Jonas", 98.2);
        Student three = new Student(4, "John", 56.2);
        Student four = new Student(12, "Aisha", 88.5);
        Student five = new Student(11, "Miguel", 72.9);
        Student six = new Student(9, "Priya", 84.1);
        Student seven = new Student(10, "Liam", 91.0);
        Student eight = new Student(8, "Sofia", 79.6);
        Student nine = new Student(13, "Noah", 65.4);
        Student ten = new Student(6, "Emma", 93.8);
        Scanner s = new Scanner(System.in);
        System.out.println("Which student? (one, two... nine, ten)");
        String input = s.next();
        switch (input) {
            case "one":
                one.display();
                break;
            case "two":
                two.display();
                break;
            case "three":
                three.display();
                break;
            case "four":
                four.display();
                break;
            case "five":
                five.display();
                break;
            case "six":
                six.display();
                break;
            case "seven":
                seven.display();
                break;
            case "eight":
                eight.display();
                break;
            case "nine":
                nine.display();
                break;
            case "ten":
                ten.display();
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        s.close();
    }
}
