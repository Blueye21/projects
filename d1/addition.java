public class addition {
    public static void print(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {
        print("Calculator:");

        int num1 = 36;
        print("36");
        print("+");
        int num2 = 19;
        print("19");
        int sum = num1 + num2;

        print("The sum is: " + sum);
    }

}
