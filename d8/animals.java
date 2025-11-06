package cohding.java.d8;
class Animal {
    void eat() {
        System.out.println("Eat");
    }
}

class Lion extends Animal {
    void roar() {
        System.out.println("Roar");
    }
}

class BabyLion extends Lion {
    void weep() {
        System.out.println("weep");
    }
}
public class animals {
    public static void main(String[] args) {
        BabyLion l = new BabyLion();

        l.weep();
        l.eat();
        l.roar();
    }
}