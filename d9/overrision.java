package java.d9;

class High {
    public void say() {
        System.out.println("high");
    }
}

class Low extends High {
    @Override
    public void say() {
        System.out.println("low");
    }
}

public class overrision {
    public static void main(String[] args) {
        Low l = new Low();
        l.say();
    }
}