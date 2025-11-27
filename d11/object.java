package cohding.java.d11;

abstract class Animal {
    abstract void sound();

    void display() {
        System.out.println("What animal does this sound make");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

class Spider extends Animal {
    void sound() {
        System.out.println("hiss");
    }
}

public class object {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.display();
        a.sound();
        a = new Cat();
        a.display();
        a.sound();
        a = new Spider();
        a.display();
        a.sound();
    }    
}
