package cohding.java.d7;

class Employee {
    int empno;
    String name;
    float sal;

    Employee(int empno, String name, float sal) {
        System.out.println("*******");
        this.empno = empno;
        this.name = name;
        this.sal = sal;
    }

    void displayDetails() {
        System.out.println(empno + " | " + name + " | " + sal);
    }
}

class employ {
    public static void main(String[] args) {
        Employee emp1 = new Employee(105, "a", 500f);
        Employee emp2 = new Employee(106, "b", 100f);
        Employee emp3 = new Employee(107, "c", 523f);
        Employee emp4 = new Employee(108, "d", 1000f);
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
        emp4.displayDetails();
    }
}