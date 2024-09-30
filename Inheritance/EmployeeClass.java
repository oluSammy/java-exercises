package Inheritance;

abstract class Employee {
    String name;
    int salary;
    String address;
    String jobTitle;

    Employee(String name, int salary, String address, String jobTitle) {
        this.name = name;
        this.salary = salary;
        this.address = address;
        this.jobTitle = jobTitle;
    }

    abstract void calcBonus();
    abstract void generatePerformanceReport();
    abstract void manageReports();
}

class Manager extends Employee {
    Manager(String name, int salary, String address, String jobTitle) {
        super(name, salary, address, jobTitle);
    }

    void calcBonus() {
        System.out.println("Calculating Manager bonus...");
    }

    void generatePerformanceReport() {
        System.out.println("Generating Manager performance report...");
    }

    void manageReports() {
        System.out.println("Managing Manager reports...");
    }
}

class Developer extends Employee {
    Developer(String name, int salary, String address, String jobTitle) {
        super(name, salary, address, jobTitle);
    }

    void calcBonus() {
        System.out.println("Calculating Developer bonus...");
    }

    void generatePerformanceReport() {
        System.out.println("Generating Developer performance report...");
    }

    void manageReports() {
        System.out.println("Managing Developer reports...");
    }
}

class Programmer extends Employee {
    Programmer(String name, int salary, String address, String jobTitle) {
        super(name, salary, address, jobTitle);
    }

    void calcBonus() {
        System.out.println("Calculating Programmer bonus...");
    }

    void generatePerformanceReport() {
        System.out.println("Generating Programmer performance report...");
    }

    void manageReports() {
        System.out.println("Managing Programmer reports...");
    }
}

public class EmployeeClass {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 100000, "123 Main St, Anytown, USA", "Manager");
        Developer developer = new Developer("Jane Doe", 80000, "456 Main St, Anytown, USA", "Developer");
        Programmer programmer = new Programmer("Jim Beam", 60000, "789 Main St, Anytown, USA", "Programmer");

        manager.calcBonus();
        manager.generatePerformanceReport();
        manager.manageReports();

        developer.calcBonus();
        developer.generatePerformanceReport();
        developer.manageReports();

        programmer.calcBonus();
        programmer.generatePerformanceReport();
        programmer.manageReports();
    }
}
