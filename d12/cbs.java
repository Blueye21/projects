import java.util.Scanner;

class Bank {
    double cash;
    String name;

    void init(double cash, String name) {
        this.cash = cash;
        this.name = name;
    }

    void withdraw(double amount) {
        try {
            cash -= amount;
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    void insert(double amount) {
        try {
            cash += amount;
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    String balance() {
        if (cash < 0) {return "-$" + -cash;};
        String balance = "$" + cash;
        return balance;
    }
}

public class cbs {
    public static void println(String text) {
        System.out.println(text);
    }
    public static void main(String[] args) {
        Scanner ca = new Scanner(System.in);
        Bank cb = new Bank();
        boolean la = true;


        println("CREATE ACCOUNT");
        println("Account name:");
        String sa = ca.next();
        println("Account cash:");
        Double da = ca.nextDouble();
        try {
            cb.init(da, sa);
        } catch(Exception e) {
            System.out.println(e);
        } finally {
            println("[1][2] Insert/Withdraw cash into your account [3] Check balance [4] Exit");
        }
        do {
            int ia = ca.nextInt();
            if (ia == 1) {
                println("How much?");
                Double db = ca.nextDouble();
                cb.insert(db);
            } else if(ia == 2) {
                println("How much?");
                Double dc = ca.nextDouble();
                cb.withdraw(dc);
            } else if(ia == 3) {
                String sb = cb.balance();
                println(sb);
            } else if(ia == 4) {
                println("Exiting...");
                break;
            }
            println("");
        } while (la);

        ca.close();
    }
}
