package cohding.java.d8;

class Father {
    int age_id;
    String name;

    void naming(String name) {
        System.out.println("Name: " + name);
    }
}

class Son extends Father {

    void age(int age) {
        System.out.println("Age of student is: " + age);
    }
}

public class student {

    public static void main(String[] args) {
        Son s = new Son();
        s.naming("Aashish");

        s.age(14);
    }
}