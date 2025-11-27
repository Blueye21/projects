package cohding.java.d11;

class train {
    void type() {
        System.out.println("Train type: ");
    }

    void speed() {
        System.out.println("Speed: ");
    }
}

class freight extends train {
    void type() {
        System.out.println("Train type: Freight");
    }

    void speed() {
        System.out.println("Speed: 60 km/h");
    }
}

class tanker extends train {
    void type() {
        System.out.println("Train type: Tanker");
    }

    void speed() {
        System.out.println("Speed: 40 km/h");
    }
}

class passenger extends train {
    void type() {
        System.out.println("Train type: Passenger");
    }

    void speed() {
        System.out.println("Speed: 80 km/h");
    }
}

public class stations {
    public static void main(String[] args) {
        train[] trains = new train[3];
        trains[0] = new freight();
        trains[1] = new passenger();
        trains[2] = new tanker();

        for (train t : trains) {
            t.type();
            t.speed();
            System.out.println();
        }
    }
}
