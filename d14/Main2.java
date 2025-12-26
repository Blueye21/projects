package d14;

public class Main2 {
    public static void printl(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corrola", 1996, 4);
        Truck truck = new Truck("Ford", "F150", 2023, 150);

        printl("Number of doors for a " + car.getYear() + " " + car.getMake() + " " + car.getModel() + " is "
                + car.getNumDoors());
        printl("Payload capacity for a " + truck.getYear() + " " + truck.getMake() + " " + truck.getModel() + " is "
                + truck.getPayloadCapacity());
    }
}
