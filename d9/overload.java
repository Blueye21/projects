package java.d9;

class Student {
    int id;
    String name;
    float stipend;

    Student() {
        System.out.println("Default");
    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Student(int id, String name, float stipend) {
        this.id = id;
        this.name = name;
        this.stipend = stipend;
    }

    void display() {
        System.out.println(id + ": " + name + ", " + stipend);
    }
}

public class overload {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(54, "Jonas");
        Student s3 = new Student(432, "Cody", 10000);

        s1.display();
        s2.display();
        s3.display();
    }
}