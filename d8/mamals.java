package cohding.java.d8;

class mammal {
    void mam() {
        System.out.println("mam");
    }
}

class lion extends mammal {
    void lio() {
        System.out.println("lio");
    }
}

class human extends mammal {
    void hum() {
        System.out.println("hum");
    }
}

class cow extends mammal {
    void cowr() {
        System.out.println("cow");
    }
}

public class mamals {
    public static void main(String[] args) {
        lion l = new lion();
        System.out.println("Lion output:");
        l.lio();
        l.mam();

        System.out.println();

        human h = new human();
        System.out.println("Human output:");
        h.hum();
        h.mam();
    }
}
