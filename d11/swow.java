package cohding.java.d11;

abstract class wonder {
    void show() {
        System.out.println("temporary");
    }
}

class one extends wonder {
    void show() {
        System.out.println("Pyramid of Giza");
    }
}

class two extends wonder {
    void show() {
        System.out.println("Hanging Gardens of Babylon");
    }
}

class three extends wonder {
    void show() {
        System.out.println("Statue of Zeus at Olympia");
    }
}

class four extends wonder {
    void show() {
        System.out.println("Mausoleum at Halicarnassus");
    }
}

class five extends wonder {
    void show() {
        System.out.println("Colossus of Rhodes");
    }
}

class six extends wonder {
    void show() {
        System.out.println("Lighthouse of Alexandria");
    }
}

class seven extends wonder {
    void show() {
        System.out.println("Great Wall of China");
    }
}

public class swow {
    public static void main(String[] args) {
        wonder[] wonders = {
            new one(),
            new two(),
            new three(),
            new four(),
            new five(),
            new six(),
            new seven()
        };

        for (wonder w : wonders) {
            w.show();
        }
    }
}
