package d14;

public class Main {
    public static void printl(String text) {
        System.out.println(text);
    }
    public static void main(String[] args) {
        Animal animal = new Animal("fish", 17);
        Dog dog = new Dog("bailey", 3, "hound");
        Cat cat = new Cat("hailey", 6, true);

        printl("Fish");
        printl("Name: " + animal.getName());
        printl("Age: " + animal.getAge());
        printl("Dog");
        printl("Name: " + dog.getName());
        printl("Age: " + dog.getAge());
        printl("Breed: " + dog.getBreed());
        printl("Cat");
        printl("Name: " + cat.getName());
        printl("Age: " + cat.getAge());
        printl("Is indoors? " + cat.getIsIndoor());
    }
}
