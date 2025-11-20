package cohding.java.d10;

import java.util.Scanner;

public class employr {
    public static Employee[] getEmployeeDetails() {
        Scanner s = new Scanner(System.in);
        Employee[] employees = new Employee[2];

        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();

            System.out.println("Enter Employee ID:");
            employees[i].setEmpId(s.nextInt());

            s.nextLine();

            System.out.println("Enter Employee name");
            employees[i].setName(s.nextLine());

            System.out.println("Enter Salary:");
            employees[i].setSalary(s.nextDouble());
        }
        s.close();
        return employees;
    }

    public static double[] getNetSalary(Employee[] employees, double pfpercentage) {
        double[] netSalaries = new double[employees.length];
        for (int i = 0; i < employees.length; i++) {
            employees[i].calculateNetSalary(pfpercentage);
            netSalaries[i] = employees[i].getNetSalary();
        }
        return netSalaries;
    }

    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);

        Employee[] employees = getEmployeeDetails();

        // System.out.println("Enter PF percentage");
        // double pf = s.nextDouble();

        // double[] netSalaries = getNetSalary(employees, pf);

        System.out.println("\n--- Employee Net Salary Details ---");
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Employee ID: " + employees[i].getEmpId());
            System.out.println("Name       : " + employees[i].getName());
            System.out.println("Net Salary : " + employees[i].getNetSalary());
            System.out.println("-----------------------------------");
        }
        // s.close();
    }
}

class Employee {
    private int empid;
    private String name;
    private double salary;
    private double netsalary;

    public int getEmpId() {
        return empid;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getNetSalary() {
        return netsalary;
    }

    public void setEmpId(int id) {
        empid = id;
    }

    public void setName(String n) {
        name = n;
    }

    public void setSalary(double s) {
        salary = s;
    }

    public void setNetSalary(double ns) {
        netsalary = ns;
    }

    public void calculateNetSalary(double pfpercentage) {
        double pfamount = (salary * pfpercentage) / 100;
        netsalary = salary - pfamount;
    }
}