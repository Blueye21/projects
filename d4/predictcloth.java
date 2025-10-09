package cohding.java.d4;

public class predictcloth {
    public static void main(String[] args) {
        boolean sunny = true;
        //#boolean rainy = false;
        boolean hot = false;

        if(sunny) {
            if(hot) {
                System.out.println("Sunny & Hot");
            }
            else
            {
                System.out.println("Sunny");
            }
        }
        else {
            System.out.println("Cold");
        }
    }
}
