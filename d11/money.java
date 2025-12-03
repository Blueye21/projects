package cohding.java.d11;

abstract class currency {
    void type() {
        System.out.println("temporary");
    }    
}

class cash extends currency {
    void type() {
        System.out.println("Currency type: Cash");
    }
}

class card extends currency {
    void type() {
        System.out.println("Currency type: Card");
    }
}

class coin extends currency {
    void type() {
        System.out.println("Currency type: Coin");
    }
}

class check extends currency {
    void type() {
        System.out.println("Currency type: Check");
    }
}

public class money {
    public static void main(String[] args) {
        currency c;
        c = new cash();
        c.type();
        c = new card();
        c.type();
        c = new coin();
        c.type();
        c = new check();
        c.type();
    }
}